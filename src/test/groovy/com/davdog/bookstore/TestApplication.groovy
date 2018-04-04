package com.davdog.bookstore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Profile

@Profile("test")
@SpringBootApplication
class TestApplication {
	
	static void main(String[] args) {
		SpringApplication.run Application, args
	}


}
