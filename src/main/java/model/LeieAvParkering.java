package model;

import java.util.concurrent.ExecutionException;

public class LeieAvParkering {

    //Variabler
    public Bruker leietaker;
    public Parkeringsplass parkeringsplass;
    public Leiedato leiedato;
    public Leietid leietid;

    //Getters og Setters
    public Bruker getLeietaker() {
        return leietaker;
    }

    public void setLeietaker(Bruker leietaker) {
        this.leietaker = leietaker;
    }

    public Parkeringsplass getParkeringsplass() {
        return parkeringsplass;
    }

    public void setParkeringsplass(Parkeringsplass parkeringsplass) {
        this.parkeringsplass = parkeringsplass;
    }

    public Leiedato getLeiedato() {
        return leiedato;
    }

    public void setLeiedato(Leiedato leiedato) {
        this.leiedato = leiedato;
    }

    public Leietid getLeietid() {
        return leietid;
    }

    public void setLeietid(Leietid leietid) {
        this.leietid = leietid;
    }


    //Konstruktører
    public LeieAvParkering(Bruker leietaker, Parkeringsplass parkeringsplass, Leiedato leiedato, Leietid leietid) {
        this.leietaker = leietaker;
        this.parkeringsplass = parkeringsplass;
        this.leiedato = leiedato;
        this.leietid = leietid;
        if (betalingAvParkering() == false){
            throw new IllegalArgumentException("  ** Betaling feilet, prøv igjen senere **  ");
        }
    }

    public static boolean betalingAvParkering(){
        boolean bankBekreftelse;
        //sender kunde til betaling/verifiserer betalingsinformasjon med bank
        bankBekreftelse = true; //svaret her blir true fra banken
        //bankBekreftelse = false; //transaksjon feilet

        if (bankBekreftelse == false){
            return false;
        } else if (bankBekreftelse == true){
            System.out.println("  ** Betaling fullført, parkeringsplass leid **  ");
        }
        System.out.println(" ");
        return true;
    }


    //toString metode
    @Override
    public String toString() {
        return "model.LeieAvParkering{" +
                "leietaker=" + leietaker +
                ", parkeringsplass=" + parkeringsplass +
                ", leiedato=" + leiedato +
                ", leietid=" + leietid +
                '}';
    }


}
