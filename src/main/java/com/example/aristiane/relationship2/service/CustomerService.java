package com.example.aristiane.relationship2.service;

import com.example.aristiane.relationship2.model.Address;
import com.example.aristiane.relationship2.model.Customer;
import com.example.aristiane.relationship2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {

        this.customerRepository.save(customer);

        return customer;

    }

    public List<Customer> findAll() {

        return (List<Customer>) this.customerRepository.findAll();
    }
    public void delete(long id) {
        this.customerRepository.deleteById(id);

    }

}
