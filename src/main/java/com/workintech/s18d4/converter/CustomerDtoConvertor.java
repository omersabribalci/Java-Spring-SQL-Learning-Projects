package com.workintech.s18d4.converter;

import com.workintech.s18d4.dto.CustomerResponse;
import com.workintech.s18d4.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDtoConvertor {

    public CustomerResponse convertToDto(Customer customer) {
        if (customer == null) {
            return null;
        }

        return new CustomerResponse(customer.getId(), customer.getEmail(),customer.getSalary());
    }

    public List<CustomerResponse> convertToDtoList(List<Customer> customers) {
        if (customers == null || customers.isEmpty()) {
            return List.of();        }
        return customers.stream()
                .map(customer -> convertToDto(customer)).toList();
    }
}
