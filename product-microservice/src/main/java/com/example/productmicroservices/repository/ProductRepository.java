package com.example.microservices.repository;

import com.example.microservices.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String>{

}
