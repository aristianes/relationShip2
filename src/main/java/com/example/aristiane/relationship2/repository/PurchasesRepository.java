package com.example.aristiane.relationship2.repository;

import com.example.aristiane.relationship2.model.Purchases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasesRepository extends CrudRepository<Purchases, Long> {



}
