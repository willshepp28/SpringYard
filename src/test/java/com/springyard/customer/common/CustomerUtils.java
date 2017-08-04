package com.springyard.customer.common;

import com.springyard.customer.model.Customer;

import java.util.List;

/**
 * Created by Admin on 8/3/17.
 */
public class CustomerUtils {

    public static Customer createTestPerson() {
        // Get unique names every time this test runs
        String firstName = Long.toString(System.currentTimeMillis());
        String lastName = Long.toString(System.currentTimeMillis());

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        return customer;
    }


    public static Customer findInList(List<Customer> customers, String first, String last) {
        // Find the new person in the list
        boolean found = false;
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(first) && customer.getLastName().equals(last)) {
                return customer;
            }
        }
        return null;
    }

}
