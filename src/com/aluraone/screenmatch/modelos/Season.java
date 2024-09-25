package com.aluraone.screenmatch.modelos;

public class Season extends Title {

    int seasons;
    int episodeBySeason;
    int minutesPerEpisode;

    @Override
    public  int getDuration(){
        return seasons * episodeBySeason * minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodeBySeason() {
        return episodeBySeason;
    }

    public void setEpisodeBySeason(int episodeBySeason) {
        this.episodeBySeason = episodeBySeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }
}
