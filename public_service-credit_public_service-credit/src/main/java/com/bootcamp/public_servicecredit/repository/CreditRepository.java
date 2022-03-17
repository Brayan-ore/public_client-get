package com.bootcamp.public_servicecredit.repository;

import com.bootcamp.public_servicecredit.model.dao.Credit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CreditRepository extends ReactiveCrudRepository<Credit,String> {
}
