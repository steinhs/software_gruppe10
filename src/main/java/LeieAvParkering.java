public class LeieAvParkering {
    public Bruker leietaker;
    public Parkeringsplass parkeringsplass;
    public Leiedato leiedato;
    public Leietid leietid;

    public LeieAvParkering(Bruker leietaker, Parkeringsplass parkeringsplass, Leiedato leiedato, Leietid leietid) {
        this.leietaker = leietaker;
        this.parkeringsplass = parkeringsplass;
        this.leiedato = leiedato;
        this.leietid = leietid;
    }

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

    @Override
    public String toString() {
        return "LeieAvParkering{" +
                "leietaker=" + leietaker +
                ", parkeringsplass=" + parkeringsplass +
                ", leiedato=" + leiedato +
                ", leietid=" + leietid +
                '}';
    }
}
