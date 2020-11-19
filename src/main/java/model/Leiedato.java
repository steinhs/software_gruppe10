package model;

public class Leiedato {

    //Variabler
    public Dato fradato;
    public Dato tildato;

    //Getters og Setters
    public Dato getFradato() {
        return fradato;
    }

    public void setFradato(Dato fradato) {
        this.fradato = fradato;
    }

    public Dato getTildato() {
        return tildato;
    }

    public void setTildato(Dato tildato) {
        this.tildato = tildato;
    }

    //Konstruktører
    public Leiedato(Dato fradato, Dato tildato) {
        this.fradato = fradato;
        this.tildato = tildato;
    }

    //toString metode
    @Override
    public String toString() {
        return "model.Leietid{" +
                "fradato=" + fradato +
                ", tildato=" + tildato +
                '}';
    }
}
