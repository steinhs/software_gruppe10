package model;

import java.util.concurrent.ExecutionException;

public class LeieAvParkering {

    //Variabler
    public Bruker leietaker;
    public Parkeringsplass parkeringsplass;
    public Leiedato leiedato;
    public Leietid leietid;
    public boolean betalingsBekreftelse;

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
    public LeieAvParkering(Bruker leietaker, Parkeringsplass parkeringsplass, Leiedato leiedato, Leietid leietid, boolean bankBekreftelse) {
        this.leietaker = leietaker;
        this.parkeringsplass = parkeringsplass;
        this.leiedato = leiedato;
        this.leietid = leietid;
        this.betalingsBekreftelse = bankBekreftelse;
        betalingAvParkering(bankBekreftelse);
    }

    public static boolean betalingAvParkering(boolean bankBekreftelse){
        if (bankBekreftelse == false){
            System.out.println("  ** Betaling avslått, prøv igjen **  ");
            System.out.println(" ");
            return false;
        } else if (bankBekreftelse == true){
            System.out.println("  ** Betaling fullført, parkeringsplass leid **  ");
            System.out.println(" ");
        }
        return true;
    }


    //toString metode
    @Override
    public String toString() {
        return "LeieAvParkering{" +
                "leietaker=" + leietaker +
                ", parkeringsplass=" + parkeringsplass +
                ", leiedato=" + leiedato +
                ", leietid=" + leietid +
                ", betalingsBekreftelse=" + betalingsBekreftelse +
                '}';
    }
}
