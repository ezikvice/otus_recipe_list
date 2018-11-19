package ru.ezikvice.otus.spring.recipes;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import java.net.UnknownHostException;

@SpringBootApplication
@Configuration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class RecipesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipesApplication.class, args);
    }

    @Bean
    public Jongo jongo() {
        DB db;
        try {
            db = new MongoClient("127.0.0.1", 27017).getDB("user_db");
        } catch (UnknownHostException e) {
            throw new MongoException("Connection error : ", e);
        }
        return new Jongo(db);
    }

    @Bean
    public MongoCollection users() {
        return jongo().getCollection("users");
    }

}
