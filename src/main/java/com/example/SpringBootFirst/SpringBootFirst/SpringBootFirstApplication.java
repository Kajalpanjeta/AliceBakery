package com.example.SpringBootFirst.SpringBootFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication implements CommandLineRunner {
	@Autowired
	cakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.BakeClass();
	}
}
