package com.workintech.s18d4.service;

import com.workintech.s18d4.dto.AccountResponse;
import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.repository.AccountRepository;
import com.workintech.s18d4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServiceImpl implements AccountService{
    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository,
                              CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account find(Long id) {
        Account account = accountRepository.findById(id).get();
        return account;
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account update(Long customerId, Account account) {
        Customer customer = customerRepository.findById(customerId).get();
        Account existingAccount = accountRepository.findById(account.getId()).get();
        existingAccount.setAccountName(account.getAccountName());
        existingAccount.setMoneyAmount(account.getMoneyAmount());
        existingAccount.setCustomer(customer);

        return accountRepository.save(existingAccount);
    }

    @Override
    public Account delete(Long id) {
        Account account = accountRepository.findById(id).orElse(null);
        if (account != null) {
            accountRepository.delete(account);
        }

        return account;
    }
}
