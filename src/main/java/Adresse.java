public class Adresse {
    public String gatenavn;
    public int gatenr;
    public String sted;

    public String getGatenavn() {
        return gatenavn;
    }

    public void setGatenavn(String gatenavn) {
        this.gatenavn = gatenavn;
    }

    public int getGatenr() {
        return gatenr;
    }

    public void setGatenr(int gatenr) {
        this.gatenr = gatenr;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }


    public Adresse(String gatenavn, int gatenr, String sted) {
        this.gatenavn = gatenavn;
        this.gatenr = gatenr;
        this.sted = sted;

    }

    @Override
    public String toString() {
        return "Adresse{" +
                "gatenavn='" + gatenavn + '\'' +
                ", gatenr=" + gatenr +
                ", sted='" + sted + '\'' +
                '}';
    }
}


