package com.workintech.s18d4.service;

import com.workintech.s18d4.converter.CustomerDtoConvertor;
import com.workintech.s18d4.dto.CustomerResponse;
import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;


    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer find(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer save(Customer customer) {
        if (customer.getAccounts() != null) {
            List<Account> newAccounts = customer.getAccounts();
            for (Account account: newAccounts) {
                account.setCustomer(customer);
            }
        }
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Customer exitingCustomer = customerRepository.findById(id).orElse(null);
        if (exitingCustomer == null) {
            return null;
        }
        exitingCustomer.setFirstName(customer.getFirstName());
        exitingCustomer.setLastName(customer.getLastName());
        exitingCustomer.setEmail(customer.getEmail());
        exitingCustomer.setSalary(customer.getSalary());
        exitingCustomer.setAddress(customer.getAddress());

        if (customer.getAccounts() != null) {
            List<Account> accounts = customer.getAccounts();
            for (Account account: accounts) {
                account.setCustomer(exitingCustomer);
            }
            exitingCustomer.setAccounts(accounts);
        }

        return customerRepository.save(exitingCustomer);
    }

    @Override
    public Customer delete(Long id) {
        Customer willBeDeletedCustomer = customerRepository.findById(id).orElse(null);
        if (willBeDeletedCustomer != null) {
            customerRepository.delete(willBeDeletedCustomer);
        }
        return willBeDeletedCustomer;
    }
}
