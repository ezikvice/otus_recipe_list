package ru.ezikvice.otus.spring.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
@Configuration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class RecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}
}
