package com.bootcamp.public_servicecredit.service.impl;

import com.bootcamp.public_servicecredit.model.dao.Credit;
import com.bootcamp.public_servicecredit.repository.CreditCrudRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CreditServiceImpl {

	private CreditCrudRepository repository;
	
	public Flux<Credit> findAll() {
        return repository.findAll();
    }

    public Mono<Credit> findById(String id) {
        return repository.findById(id);
    }

    public Mono<Credit> save(Credit credit) {
        return repository.save(credit);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
	
}
