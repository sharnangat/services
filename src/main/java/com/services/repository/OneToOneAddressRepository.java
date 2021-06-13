package com.services.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.AddressTwoTable;

@Repository
public interface OneToOneAddressRepository<id> extends CrudRepository<AddressTwoTable,id> {

}
