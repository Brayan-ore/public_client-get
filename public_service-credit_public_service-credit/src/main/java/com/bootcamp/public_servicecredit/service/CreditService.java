package com.bootcamp.public_servicecredit.service;

import com.bootcamp.public_servicecredit.model.dao.Credit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
										
	public Flux<Credit> findAll();
    public Mono<Credit> findById(String id);
    public Mono<Credit> save(Credit credit);
    public Mono<Void> deleteById(String id);
	
}
