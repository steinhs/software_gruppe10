package model;

import java.util.ArrayList;

public class Pris {

    //Variabler
    public double pris;
    public String prisPerX;

    //Getters og Setters
    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getPrisPerX() {
        return prisPerX;
    }

    public void setPrisPerX(String prisPerX) {
        this.prisPerX = prisPerX;
    }

    //Konstruktører
    public Pris(double pris, String prisPerX) {
        this.pris = pris;
        this.prisPerX = prisPerX;
    }

    //toString metode
    @Override
    public String toString() {
        return "model.Pris{" + "Kr" + pris +
                " per " + prisPerX +
                '}';
    }
}
