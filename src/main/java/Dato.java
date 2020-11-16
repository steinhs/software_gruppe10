public class Dato {
    public int dag;
    public int maaned;
    public int aar;

    @Override
    public String toString() {
        return "Date{" + dag +
                "-" + maaned +
                "-" + aar +
                '}';
    }

    public int getDag() {
        return dag;
    }

    public void setDag(int dag) {
        this.dag = dag;
    }

    public int getMaaned() {
        return maaned;
    }

    public void setMaaned(int maaned) {
        this.maaned = maaned;
    }

    public int getAar() {
        return aar;
    }

    public void setAar(int aar) {
        this.aar = aar;
    }

    public Dato(int dag, int maaned, int aar) {
        this.dag = dag;
        this.maaned = maaned;
        this.aar = aar;
    }
}
