package model;

public class Adresse {

    //Variabler
    public String gatenavn;
    public int gatenr;
    public String sted;

    //Getters og Setters
    public String getGatenavn() {
        return gatenavn;
    }

    public void setGatenavn(String gatenavn) {
        this.gatenavn = gatenavn;
    }

    public int getGatenr() {
        return gatenr;
    }

    public void setGatenr(int gatenr) {
        this.gatenr = gatenr;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    //Konstruktører
    public Adresse(String gatenavn, int gatenr, String sted) {
        this.gatenavn = gatenavn;
        this.gatenr = gatenr;
        this.sted = sted;
    }

    //toString metode
    @Override
    public String toString() {
        return "model.Adresse{" +
                "gatenavn='" + gatenavn + '\'' +
                ", gatenr=" + gatenr +
                ", sted='" + sted + '\'' +
                '}';
    }
}


