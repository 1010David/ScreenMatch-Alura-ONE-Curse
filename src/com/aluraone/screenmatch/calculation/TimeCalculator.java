package com.aluraone.screenmatch.calculation;

import com.aluraone.screenmatch.modelos.Movie;
import com.aluraone.screenmatch.modelos.Season;
import com.aluraone.screenmatch.modelos.Title;

public class TimeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void incluided(Title title){
        this.totalTime += title.getDuration();
    }

}
