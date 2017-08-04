package com.springyard.customer.service;

import com.springyard.customer.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static com.springyard.customer.common.CustomerUtils.createTestPerson;
import static com.springyard.customer.common.CustomerUtils.findInList;

/**
 * Created by Admin on 8/3/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {



    @Autowired
    CustomerService customerService;

    @Test
    public void testAddGet() {
        Customer customer1 = createTestPerson();
        Customer customer2 = createTestPerson();
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        // Cause an error
        customer2.setFirstName(null);
        try {
            customerService.add(customers);
        } catch(Exception e) {
            // expected this
            System.out.println("I expected this shit");
        }

        customers = customerService.get();
        Customer customer3 = findInList(customers, customer1.getFirstName(), customer2.getLastName());
        Assert.assertNull("The first customer created should have rolled back", customer3);
    }
}

