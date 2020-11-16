public class Pris {
    public double pris;
    public String prisPerX;

    public Pris(double pris, String prisPerX) {
        this.pris = pris;
        this.prisPerX = prisPerX;
    }

    @Override
    public String toString() {
        return "Pris{" + "Kr" + pris +
                " per " + prisPerX +
                '}';
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getPrisPerX() {
        return prisPerX;
    }

    public void setPrisPerX(String prisPerX) {
        this.prisPerX = prisPerX;
    }
}
