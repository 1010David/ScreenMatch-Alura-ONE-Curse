package com.aluraone.screenmatch.modelos;


import com.aluraone.screenmatch.calculation.Clasification;

public class Movie extends Title implements Clasification {

    public String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasifacation() {
        return (int) (calculateAverage() / 2);
    }
}
