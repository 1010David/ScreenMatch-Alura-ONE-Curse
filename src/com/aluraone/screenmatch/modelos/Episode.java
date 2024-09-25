package com.aluraone.screenmatch.modelos;

import com.aluraone.screenmatch.calculation.Clasification;

public class Episode implements Clasification {

    private  int number;
    private  String name;
    private  Season season;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public int getClasifacation() {
        if(views > 100){
            return 4;
        }else {
            return 2;
        }
    }
}

