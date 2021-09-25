package com.covid.covidWebapp.bean;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Zone {


    private int pinCode;
    private String color;
    private ArrayList<User> users;





    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }



    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
