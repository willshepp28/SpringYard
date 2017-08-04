package com.springyard.customer.service;

import com.springyard.customer.model.Customer;

import java.util.List;

/**
 * Created by Admin on 8/3/17.
 */
public interface CustomerService {

    void add(Customer customer);
    void add(List<Customer> customers);
    // Update a customer
    void update(Customer customer);
    // get customer by id
    Customer getById(int id);
    // Get all customers
    List<Customer> get();
    // Delete a customer
    void delete(int id);
}
