package ru.ezikvice.otus.spring.recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ezikvice.otus.spring.recipes.domain.Step;

@RepositoryRestResource(collectionResourceRel = "steps", path = "steps")
public interface StepRepository extends MongoRepository<Step, String> {
}
