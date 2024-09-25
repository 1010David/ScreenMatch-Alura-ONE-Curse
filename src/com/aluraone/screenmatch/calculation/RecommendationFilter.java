package com.aluraone.screenmatch.calculation;

public class RecommendationFilter {

    public void filter (Clasification clasification) {
        if (clasification.getClasifacation() >= 4) {
            System.out.println("Bien evaluado");
        } else if (clasification.getClasifacation() >=2){
            System.out.println("Popular");
        } else {
            System.out.println("Ver despues");
        }

    }
}
