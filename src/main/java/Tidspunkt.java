public class Tidspunkt {
    public int time;
    public int minutt;
    public int sekund;

    public Tidspunkt(int time, int minutt, int sekund) {
        this.time = time;
        this.minutt = minutt;
        this.sekund = sekund;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMinutt() {
        return minutt;
    }

    public void setMinutt(int minutt) {
        this.minutt = minutt;
    }

    public int getSekund() {
        return sekund;
    }

    public void setSekund(int sekund) {
        this.sekund = sekund;
    }

    @Override
    public String toString() {
        return "Tidspunkt{" + time +
                ":" + minutt +
                ":" + sekund +
                '}';
    }
}
