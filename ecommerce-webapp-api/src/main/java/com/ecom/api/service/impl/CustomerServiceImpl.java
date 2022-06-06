package com.ecom.api.service.impl;

import com.ecom.api.dao.CustomerRepository;
import com.ecom.api.model.Customer;
import com.ecom.api.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository custRepo;

    public CustomerServiceImpl(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }

    @Override
    public String signup(Customer cust) {
        String statusMsg = "";

        if(this.custRepo.findByMail(cust.getMail()) == null){
            this.custRepo.save(cust);

            statusMsg = "user_registered";
        }
        else{
            if(cust.getMail().equals(this.custRepo.findByMail(cust.getMail()))){
                statusMsg = "user_exists";
            }
        }

        return statusMsg;
    }

    @Override
    public Optional<Customer> login(String mail, String pwd) {
        return Optional.empty();
    }

    @Override
    public List<Customer> viewAllCust() {
        return this.custRepo.findAll();
    }

    @Override
    public Optional<Customer> viewCustById(Long id) {
        return this.custRepo.findById(id);
    }

    @Override
    public Customer updateCustDetails(Customer cust) {
        return this.custRepo.save(cust);
    }

    @Override
    public void deleteCustAcc(Long id) {
        this.custRepo.deleteById(id);
    }
}
