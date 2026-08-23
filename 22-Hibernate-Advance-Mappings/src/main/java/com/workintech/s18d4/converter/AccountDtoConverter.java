package com.workintech.s18d4.converter;

import com.workintech.s18d4.dto.AccountResponse;
import com.workintech.s18d4.entity.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDtoConverter {
    public AccountResponse convertToDto(Account account) {
        if (account == null) {
            return null;
        }

        return new AccountResponse(
                account.getAccountName()
        );
    }

    public List<AccountResponse> convertToDtoList(List<Account> accounts) {
        if (accounts == null || accounts.isEmpty()) {
            return List.of();        }
        return accounts.stream()
                .map(account -> convertToDto(account)).toList();
    }
}
