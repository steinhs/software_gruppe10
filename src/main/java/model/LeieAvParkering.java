package model;

public class LeieAvParkering {

    //Variabler
    public Bruker leietaker;
    public Parkeringsplass parkeringsplass;
    public Leiedato leiedato;
    public Leietid leietid;
    public int onsketParkeringer;

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

    public int getOnsketParkeringer() {
        return onsketParkeringer;
    }

    public void setOnsketParkeringer(int onsketParkeringer) {
        this.onsketParkeringer = onsketParkeringer;
    }

    //Konstruktører
    public LeieAvParkering(Bruker leietaker, Parkeringsplass parkeringsplass, Leiedato leiedato, Leietid leietid, int onsketParkeringer) {
        this.leietaker = leietaker;
        this.parkeringsplass = parkeringsplass;
        this.leiedato = leiedato;
        this.leietid = leietid;

        this.parkeringsplass.setAntallParkeringer(this.parkeringsplass.getAntallParkeringer()+onsketParkeringer);
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
