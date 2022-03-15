package com.bootcamp.public_servicecredit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.public_servicecredit.model.dao.Credit;
import com.bootcamp.public_servicecredit.service.CreditService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {

	private CreditService service;

	@GetMapping
    public Flux<Credit> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Credit> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Credit> save(@RequestBody Credit credit) {
        return service.save(credit);
    }

    @PutMapping
    public Mono<Credit> put(@RequestBody Credit credit) {
        return service.save(credit);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }
	
}
