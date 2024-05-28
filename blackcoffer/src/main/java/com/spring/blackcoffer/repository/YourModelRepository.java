package com.spring.blackcoffer.repository;

import com.spring.blackcoffer.model.YourModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YourModelRepository extends MongoRepository<YourModel, String> {
}
