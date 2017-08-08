package com.springyard.customer.respository;

import com.springyard.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

/**
 * Created by Admin on 8/3/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
