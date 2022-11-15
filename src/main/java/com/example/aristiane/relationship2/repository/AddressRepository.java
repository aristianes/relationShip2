package com.example.aristiane.relationship2.repository;

import com.example.aristiane.relationship2.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
