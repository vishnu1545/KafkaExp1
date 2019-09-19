package com.example.kafka.springbootkafkaproducerexample.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafka.springbootkafkaproducerexample.model.Person;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String,Person> kafkaTemplate;
	
	public static final String TOPIC="test";
	
	public void printing() {
		System.err.println("kuch bhi ho raha hai");
		Person data=new Person();
		data.setHeartRate(88);
		data.setTimeStamp(new Date());
		data.setPersonId(454);
		
		kafkaTemplate.send(TOPIC, data);
		System.err.println("Successfull");
	}
	
}
