package com.springyard.customer.service;

import com.springyard.customer.model.Customer;
import com.springyard.customer.respository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 8/3/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;




    @Transactional
    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Transactional
    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            customerRepository.add(customer);
        }
    }


    // done
    @Override
    public Customer getById(int id) {
        return customerRepository.getById(id);
    }


    // done
    @Override
    public List<Customer> get() {
        return customerRepository.get();
    }


    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }
}
