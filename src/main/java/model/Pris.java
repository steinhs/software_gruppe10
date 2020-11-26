package model;

import java.util.ArrayList;

public class Pris {

    //Variabler
    public double pris;
    public String prisPerX;
    public double prisPerTime;

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

    public double getPrisPerTime() {
        return prisPerTime;
    }

    public void setPrisPerTime(double prisPerTime) {
        this.prisPerTime = prisPerTime;
    }

    //Konstruktører
    public Pris(double pris, String prisPerX) {
        this.pris = pris;
        this.prisPerX = prisPerX;
        this.bestemPrisPerTime();
    }

    private void bestemPrisPerTime() {
        if (prisPerX.equalsIgnoreCase("Dag")) {
            prisPerTime = pris/24;
        } else if (prisPerX.equalsIgnoreCase("Uke")) {
            prisPerTime = pris/168;
        } else {
            prisPerTime=pris;
        }
    }


    //toString metode
    @Override
    public String toString() {
        return "model.Pris{" + "Kr" + pris +
                " per " + prisPerX +
                '}';
    }
}
