package com.ingesup.ynov.videtonfrigo.videtonfrigo;

/**
 * Created by tristan on 02/12/2015.
 */
public class Fridge {
    private int FridgeID;
    private int UserID;
    private int IngredientID;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public int getIngredientID() {
        return IngredientID;
    }

    public void setIngredientID(int ingredientID) {
        IngredientID = ingredientID;
    }
}
