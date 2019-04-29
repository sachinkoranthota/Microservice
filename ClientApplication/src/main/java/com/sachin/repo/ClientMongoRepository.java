package com.sachin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sachin.model.Client;

@Repository
public interface ClientMongoRepository extends MongoRepository<Client, String>{
	
}
