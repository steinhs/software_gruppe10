public class Leiedato {
    public Dato fradato;
    public Dato tildato;

    public Leiedato(Dato fradato, Dato tildato) {
        this.fradato = fradato;
        this.tildato = tildato;
    }

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

    @Override
    public String toString() {
        return "Leietid{" +
                "fradato=" + fradato +
                ", tildato=" + tildato +
                '}';
    }
}
