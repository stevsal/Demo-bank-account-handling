package com.example.Demo.bank.account.handling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DemoBankAccountHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBankAccountHandlingApplication.class, args);
	}

}
