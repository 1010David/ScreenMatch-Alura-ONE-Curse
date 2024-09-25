package com.aluraone.screenmatch.modelos;

public class Title {

    private String name;
    private int releaseDate;
    private int duration;
    private boolean includedInThePlan;
    private double sumOfEvaluation;
    private int totalEvaluations;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;

    }

    public void showTechnicalSheet() {
        System.out.println("This movie is: " + name);
        System.out.println("Its release date is: " + releaseDate);
        System.out.println("The movie lasts :" + getDuration());
    }

    public void evaluate(double note){
        sumOfEvaluation += note;
        totalEvaluations  ++;

    }
    public double calculateAverage(){
        return sumOfEvaluation / totalEvaluations;
    }

}
