package com.example.aristiane.relationship2.controller;

import com.example.aristiane.relationship2.model.Customer;
import com.example.aristiane.relationship2.service.AddressService;
import com.example.aristiane.relationship2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {

        this.service.save(customer);

        return customer;

    }
    @GetMapping
    public List<Customer> findAll(){

        return this.service.findAll();

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

        this.service.delete(id);
    }




}
