package com.covid.covidWebapp.bean;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class User {


    private int id;
    private String name;
    private int mob;
    private ArrayList<String> symptopms;
    private boolean travel;
    private boolean contact;
    private int covidRisk;
    private boolean covidResult;
    private Zone zone;

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public boolean isCovidResult() {
        return covidResult;
    }

    public void setCovidResult(boolean covidResult) {
        this.covidResult = covidResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }


    public ArrayList<String> getSymptopms() {
        if(symptopms==null){
            symptopms = new ArrayList<>();
        }
        return symptopms;
    }

    public void setSymptopms(ArrayList<String> symptopms) {


        this.symptopms = symptopms;
    }

    public boolean isTravel() {
        return travel;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public int getCovidRisk() {
        return covidRisk;
    }

    public void setCovidRisk(int covidRisk) {
        this.covidRisk = covidRisk;
    }

    public boolean getTravel() {
        return travel;
    }

    public void setTravel(boolean travel) {
        this.travel = travel;
    }
}
