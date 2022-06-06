package com.ecom.api.controller;

import com.ecom.api.model.Customer;
import com.ecom.api.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService custServ;

    public CustomerController(CustomerService custServ) {
        this.custServ = custServ;
    }

    @PostMapping("/api/customer/signup")
    public String signup(@RequestBody Customer cust){
        System.out.println("endpoint /api/customer/signup was hit.....");

        String response = "";

        String statusMsg = this.custServ.signup(cust);

        if(statusMsg == "user_exists" || statusMsg == ""){
            response = "This email is already registered!";
        }
        if(statusMsg == "user_registered"){
            response = "Welcome " + cust.getfName() + "!";
        }

        return response;
    }
}
