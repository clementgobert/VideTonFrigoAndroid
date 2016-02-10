package com.ingesup.ynov.videtonfrigo.videtonfrigo;

/**
 * Created by YoshiYo on 02/12/2015.
 */
public class Ingredient {
    private int IngredientId;
    private String name;
    private double price;
    private float date;

    public int getIngredientId() {
        return IngredientId;
    }

    public void setIngredientId(int ingredientId) {
        IngredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }
}
