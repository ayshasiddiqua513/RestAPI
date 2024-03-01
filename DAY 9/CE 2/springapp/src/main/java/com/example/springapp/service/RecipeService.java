package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Recipe;
import com.example.springapp.repository.RecipeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService
{
    @Autowired
    RecipeRepo recipeRepo;
    public Recipe addRecipes(Recipe recipe)
    {
        return recipeRepo.save(recipe);
    }
    public List<Recipe> getByName(String recipeName)
    {
        return recipeRepo.findByRecipeName(recipeName);
    }
    public Optional<Recipe> getById(int recipeId)
    {
        return recipeRepo.findById(recipeId);
    }
}