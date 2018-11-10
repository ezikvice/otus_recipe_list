package ru.ezikvice.otus.spring.recipes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ezikvice.otus.spring.recipes.domain.Ingredient;

@RepositoryRestResource(collectionResourceRel = "ingredients", path = "ingredients")
public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
