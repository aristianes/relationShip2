package com.example.aristiane.relationship2.service;

import com.example.aristiane.relationship2.model.Address;
import com.example.aristiane.relationship2.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address save(Address address) {
        this.addressRepository.save(address);

        return address;
    }

    public List<Address> findAll() {

        return (List<Address>) this.addressRepository.findAll();
    }

    public void delete(long id) {
        this.addressRepository.deleteById(id);

    }
}


