public class Leietid {
    public Tidspunkt fratid;
    public Tidspunkt tiltid;

    public Leietid(Tidspunkt fratid, Tidspunkt tiltid) {
        this.fratid = fratid;
        this.tiltid = tiltid;
    }

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

    @Override
    public String toString() {
        return "Leietid{" +
                "fratid=" + fratid +
                ", tiltid=" + tiltid +
                '}';
    }
}
