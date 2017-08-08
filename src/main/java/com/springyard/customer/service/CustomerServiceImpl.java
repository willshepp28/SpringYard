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
    public Customer add(Customer customer) {
         return customerRepository.save(customer);
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    public void add(List<Customer> customers) {
        for (Customer customer : customers) {
            customerRepository.save(customer);
        }
    }


    // done
    @Override
    public Customer getById(int id) {
        return getCustomer(id);
    }


    // done
    @Override
    public List<Customer> get() {
        return customerRepository.findAll();
    }


    @Transactional
    @Override
    public void delete(int id) {
        Customer customer = this.getCustomer(id);

        customerRepository.delete(id);
    }

    private Customer getCustomer(int id) {
        Customer customer = customerRepository.findOne(id);
        return customer;
    }
}
