package com.bootcamp.public_servicecredit.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.public_servicecredit.model.dao.Credit;

public interface CreditCrudRepository extends ReactiveCrudRepository<Credit, String>{

}
