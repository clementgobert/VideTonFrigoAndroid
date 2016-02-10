package com.ingesup.ynov.videtonfrigo.videtonfrigo;

/**
 * Created by YoshiYo on 02/12/2015.
 */
public class Recipe {
    private int recipeId;
    private String recipeName;
    private double complexity;
    private double note;
    private double time;
    private int bnVote;
    private int npPeople;
    private String description;
    private String URLimg;

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public double getComplexity() {
        return complexity;
    }

    public void setComplexity(double complexity) {
        this.complexity = complexity;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getNpPeople() {
        return npPeople;
    }

    public void setNpPeople(int npPeople) {
        this.npPeople = npPeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getURLimg() {
        return URLimg;
    }

    public void setURLimg(String URLimg) {
        this.URLimg = URLimg;
    }

    public int getBnVote() {
        return bnVote;
    }

    public void setBnVote(int bnVote) {
        this.bnVote = bnVote;
    }
}
