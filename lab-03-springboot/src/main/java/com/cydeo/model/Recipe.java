package com.cydeo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
import com.cydeo.enums.RecipeType;

import java.util.List;
import java.util.UUID;

public class Recipe {

    private UUID recipeID;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient> ingredients;
    private RecipeType recipeType;
}
