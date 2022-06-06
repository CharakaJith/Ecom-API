package com.ecom.api.service;

import com.ecom.api.dao.CustomerRepository;
import com.ecom.api.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    String signup(Customer cust);

    Optional<Customer> login(String mail, String pwd);

    List<Customer> viewAllCust();

    Optional<Customer> viewCustById(Long id);

    Customer updateCustDetails(Customer cust);

    void deleteCustAcc(Long id);
}
