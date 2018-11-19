package ru.ezikvice.otus.spring.recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.core.userdetails.User;
import ru.ezikvice.otus.spring.recipes.domain.Client;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<Client, String> {

    Client findByUsername(String username);
}
