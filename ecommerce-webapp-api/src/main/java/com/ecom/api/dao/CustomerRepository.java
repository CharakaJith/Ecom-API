package com.ecom.api.dao;

import com.ecom.api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
        Customer findByMail(String mail);
}
