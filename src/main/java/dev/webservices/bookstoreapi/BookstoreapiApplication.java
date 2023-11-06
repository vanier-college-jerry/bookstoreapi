package dev.webservices.bookstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BookstoreapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreapiApplication.class, args);
	}

}
