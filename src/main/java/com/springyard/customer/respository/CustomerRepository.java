package com.springyard.customer.respository;

import com.springyard.customer.model.Customer;


import java.util.List;

/**
 * Created by Admin on 8/3/17.
 */
public interface CustomerRepository {


    void add(Customer customer);

    // Update a customer
    void update(Customer customer);
    // get customer by id
    Customer getById(int id);
    // Get all customers
    List<Customer> get();
    // Delete a customer
    void delete(int id);

}
