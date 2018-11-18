package ru.ezikvice.otus.spring.recipes.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Recipe {
    @Id
    private String recipeId;
    private List<Ingredient> ingredients;
    private List<Step> steps;
    private String description;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
