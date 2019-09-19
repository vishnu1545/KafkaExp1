package com.example.kafka.springbootkafkaproducerexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.kafka.springbootkafkaproducerexample.controller.Producer;

@SpringBootApplication
public class SpringBootKafkaProducerExampleApplication implements CommandLineRunner{
    @Autowired
    Producer producer;
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootKafkaProducerExampleApplication.class, args);
	}
	@Override
	public void run(String... arg0) {
		System.err.println("running");
		producer.printing();
	}
	}

