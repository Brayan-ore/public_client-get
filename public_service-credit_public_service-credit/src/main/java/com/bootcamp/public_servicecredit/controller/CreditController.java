package com.bootcamp.public_servicecredit.controller;


import com.bootcamp.public_servicecredit.model.dao.Credit;
import com.bootcamp.public_servicecredit.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {

    @Autowired
    private CreditService creditService;


    @GetMapping
    public Flux<Credit> findAll() {
        return creditService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Credit> findById(@PathVariable String id) {
        return creditService.findById(id);
    }

    @PostMapping
    public Mono<Credit> save(@RequestBody Credit credit) {
        return creditService.save(credit);
    }

    @PutMapping
    public Mono<Credit> put(@RequestBody Credit credit) {
        return creditService.save(credit);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return creditService.deleteById(id);
    }



}
