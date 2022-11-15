package com.example.aristiane.relationship2.controller;

import com.example.aristiane.relationship2.model.Purchases;
import com.example.aristiane.relationship2.service.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchasesController {

    @Autowired
    private PurchasesService service;

    @PostMapping
    public Purchases save(@RequestBody Purchases purchases) {

        this.service.save(purchases);

        return purchases;

    }
    @GetMapping
    public List<Purchases> findAll(){

        return this.service.findAll();

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

        this.service.delete(id);
    }
}
