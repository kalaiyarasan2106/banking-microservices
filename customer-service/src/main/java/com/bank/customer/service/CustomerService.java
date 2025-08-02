package com.bank.customer.service;

import com.bank.customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer account);

    List<Customer> getAllCustomer();

    Customer getCustomerById(Long id);

    void deleteCustomer(Long id);

}
