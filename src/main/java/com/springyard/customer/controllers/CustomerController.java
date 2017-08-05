package com.springyard.customer.controllers;

import com.springyard.customer.model.Customer;
import com.springyard.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;



        /* ******************************************************************* */
            /*    A Home page that shows a link to the Customers page  */
    /* ******************************************************************* */
    @RequestMapping("/customer")
    public String customer(Model model){


        List<Customer> getCustomer = customerService.get();
        model.addAttribute("getcustomer", getCustomer);

        return "customer";
    }



    /* ******************************************************************* */
            /*   Add Customer page  */
    /* ******************************************************************* */
    @RequestMapping("/addCustomer")
        public String addCustomer(){

            return "addCustomer";
        }





    /* ******************************************************************* */
            /*   Post to Customer page  */
    /* ******************************************************************* */
    @RequestMapping(path = "/addCustomer", method = RequestMethod.POST)
        public String createCustomer(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName, @RequestParam(value="email") String email, @RequestParam(value="phone") String phone, Model model){

        Customer customer = new Customer();

        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhone(phone);

        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getPhone());
        customerService.add(customer);

        /* set student firstName, lastName and grade using the http request parameters */

        /* add the student to the model that will be used by the view_student html file */
//        model.addAttribute("customer", customer);

        return "redirect:/customer";

    }




    /* ******************************************************************* */
            /*   View Customer Page  */
    /* ******************************************************************* */
    @RequestMapping("/viewCustomer/{customerId}")
    public String viewCustomer(@PathVariable int customerId, Model model){

        Customer getCustomer = customerService.getById(customerId);

        model.addAttribute("getcustomer", getCustomer);

            return "viewCustomer";
    }


}