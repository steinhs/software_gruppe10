package model;

public class Parkeringsplass {

    //Variabler
    public Adresse adresse;
    public Pris pris;
    public Bruker utleier;
    public int antallParkeringer;

    //Getters og Setters
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Pris getPris() {
        return pris;
    }

    public void setPris(Pris pris) {
        this.pris = pris;
    }

    public Bruker getUtleier() {
        return utleier;
    }

    public void setUtleier(Bruker utleier) {
        this.utleier = utleier;
    }

    public int getAntallParkeringer() {
        return antallParkeringer;
    }

    public void setAntallParkeringer(int antallParkeringer) {
        this.antallParkeringer = antallParkeringer;
    }

    //Konstruktører
    public Parkeringsplass(Adresse adresse, Pris pris, Bruker utleier, int antallParkeringer) {
        this.adresse = adresse;
        this.pris = pris;
        this.utleier = utleier;
        this.antallParkeringer = antallParkeringer;
    }

    //toString metode
    @Override
    public String toString() {
        return "model.Parkeringsplass{" +
                "adresse=" + adresse +
                ", pris=" + pris +
                ", utleier=" + utleier +
                '}';
    }
}
