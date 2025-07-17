package org.example;

public class TvSeries extends Video{

    private int Episodes;


    public TvSeries(String title, int duration, int Episodes) {
        super(title, duration);
        this.Episodes = Episodes;

    }

    public int getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(int Episodes) {
        this.Episodes = Episodes;
    }


}
