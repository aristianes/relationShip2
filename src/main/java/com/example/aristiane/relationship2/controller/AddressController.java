package com.example.aristiane.relationship2.controller;

import com.example.aristiane.relationship2.model.Address;
import com.example.aristiane.relationship2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService service;

    @PostMapping
    public Address save(@RequestBody Address address) {

        this.service.save(address);

        return address;

    }
    @GetMapping
    public List<Address> findAll(){

        return this.service.findAll();

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

        this.service.delete(id);
    }

}
