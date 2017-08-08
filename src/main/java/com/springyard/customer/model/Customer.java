package com.springyard.customer.model;

import javax.persistence.*;

/**
 * Created by Admin on 8/3/17.
 */

@Entity
@Table(name="customer")
public class Customer {

    // instantiate variables
         private int id;
         private String firstName;
         private String lastName;
         private String phone;
         private String email;









    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    @Column(name = "email")
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


    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Customer customer = (Customer) o;

        return this.id == customer.id;

    }

}
