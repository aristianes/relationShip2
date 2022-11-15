package com.example.aristiane.relationship2.service;

import com.example.aristiane.relationship2.model.Address;
import com.example.aristiane.relationship2.model.Purchases;
import com.example.aristiane.relationship2.repository.AddressRepository;
import com.example.aristiane.relationship2.repository.PurchasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasesService {

    @Autowired
    private PurchasesRepository purchasesRepository;

    public Purchases save(Purchases purchases) {
        this.purchasesRepository.save(purchases);

        return purchases;
    }
    public List<Purchases> findAll() {

        return (List<Purchases>) this.purchasesRepository.findAll();
    }
    public void delete(long id) {
        this.purchasesRepository.deleteById(id);

    }

}
