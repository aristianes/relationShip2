package com.example.aristiane.relationship2.repository;

import com.example.aristiane.relationship2.model.Address;
import com.example.aristiane.relationship2.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

