package com.services.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.services.model.UserOneTable;

@Repository
public interface OneToOneRepository<id> extends CrudRepository< UserOneTable,id>{

}
