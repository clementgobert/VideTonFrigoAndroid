package com.ingesup.ynov.videtonfrigo.videtonfrigo;

import android.text.format.DateFormat;

/**
 * Created by tristan on 02/12/2015.
 */
public class User {
    private int UserId ;
    private String Pseudo;
    private String Email;
    private String Password;
    private String City;
    private DateFormat Birthday;
    private float Budget;

    public User(){

    }

    public void AddToBdd(){

    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public DateFormat getBirthday() {
        return Birthday;
    }

    public void setBirthday(DateFormat birthday) {
        Birthday = birthday;
    }

    public float getBudget() {
        return Budget;
    }

    public void setBudget(float budget) {
        Budget = budget;
    }
}
