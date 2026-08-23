package com.workintech.s18d4.controller;

import com.workintech.s18d4.dto.AccountResponse;
import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.AccountService;
import com.workintech.s18d4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    private AccountService accountService;
    private CustomerService customerService;

    @Autowired
    public AccountController(AccountService accountService, CustomerService customerService) {
        this.accountService = accountService;
        this.customerService = customerService;
    }

    @GetMapping("")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable Long id) {
        return accountService.find(id);
    }

    @PostMapping("/{customerId}")
    public Account save(@RequestBody Account account, @PathVariable Long customerId) {
        Customer customer = customerService.find(customerId);
        customer.getAccounts().add(account);
        account.setCustomer(customer);
        return accountService.save(account);
    }

    @PutMapping("/{customerId}")
    public Account update(@PathVariable Long customerId, @RequestBody Account account) {
        Customer customer = customerService.find(customerId);
        Account foundAccount = null;
        try {
            foundAccount = accountService.find(account.getId());
        } catch (Exception e) {
            // ignore
        }
        
        if (foundAccount != null) {
            for (Account account1: customer.getAccounts()) {
                if (account1.getId() == account.getId()) {
                    account1.setAccountName(account.getAccountName());
                    account1.setMoneyAmount(account.getMoneyAmount());
                }
            }
            account.setCustomer(customer);
            customerService.save(customer); 
            return accountService.save(account);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Account delete(@PathVariable Long id)  {
        Account account = accountService.find(id);
        if(account != null){
            accountService.delete(id);
        }
        return account;
    }











}
