package com.springyard.customer.model;

/**
 * Created by Admin on 8/3/17.
 */
public class Customer {

    // instantiate variables
         private int id;
         private String firstName;
         private String lastName;
         private String phone;
         private String email;


    // constructor
    public Customer() {
    }





    // getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }





    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
