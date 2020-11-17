public class Leietid {

    //Variabler
    public Tidspunkt fratid;
    public Tidspunkt tiltid;

    //Getters og Setters
    public Tidspunkt getFratid() {
        return fratid;
    }

    public void setFratid(Tidspunkt fratid) {
        this.fratid = fratid;
    }

    public Tidspunkt getTiltid() {
        return tiltid;
    }

    public void setTiltid(Tidspunkt tiltid) {
        this.tiltid = tiltid;
    }

    //Konstruktører
    public Leietid(Tidspunkt fratid, Tidspunkt tiltid) {
        this.fratid = fratid;
        this.tiltid = tiltid;
    }

    //toString metode
    @Override
    public String toString() {
        return "Leietid{" +
                "fratid=" + fratid +
                ", tiltid=" + tiltid +
                '}';
    }
}
