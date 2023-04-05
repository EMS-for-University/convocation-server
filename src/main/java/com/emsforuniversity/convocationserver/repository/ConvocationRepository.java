package com.emsforuniversity.convocationserver.repository;

import com.emsforuniversity.convocationserver.model.Convocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvocationRepository extends MongoRepository<Convocation, Integer> {
}