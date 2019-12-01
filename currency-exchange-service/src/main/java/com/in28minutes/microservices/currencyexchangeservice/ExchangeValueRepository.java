package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExchangeValueRepository extends MongoRepository<ExchangeValue, String> {
	ExchangeValue findByFromAndTo(String from, String to);
}
