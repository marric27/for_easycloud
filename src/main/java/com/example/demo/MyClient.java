package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyClient {

	private static final Logger log = LoggerFactory.getLogger(MyClient.class);

	public static void main(String[] args) {
		SpringApplication.run(MyClient.class);
	}

	@Bean
	public CommandLineRunner demo(AnagraficaRepository repository) {
		return (args) -> {
			// save a few Anagraficas
			repository.save(new Anagrafica("Jack", "Bauer"));
			repository.save(new Anagrafica("Chloe", "O'Brian"));
			repository.save(new Anagrafica("Kim", "Bauer"));
			repository.save(new Anagrafica("David", "Palmer"));
			repository.save(new Anagrafica("Michelle", "Dessler"));
		};
	}
}
