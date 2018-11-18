package ru.ezikvice.otus.spring.recipes.domain;

import org.springframework.data.annotation.Id;

public class Ingredient {

    @Id
    private String ingredientId;
    private String name;

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
