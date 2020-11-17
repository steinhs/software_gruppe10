public class Parkeringsplass {

    //Variabler
    public Adresse adresse;
    public Pris pris;
    public Bruker utleier;

    //Getters og Setters
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Pris getPris() {
        return pris;
    }

    public void setPris(Pris pris) {
        this.pris = pris;
    }

    public Bruker getUtleier() {
        return utleier;
    }

    public void setUtleier(Bruker utleier) {
        this.utleier = utleier;
    }

    //Konstruktører
    public Parkeringsplass(Adresse adresse, Pris pris, Bruker utleier) {
        this.adresse = adresse;
        this.pris = pris;
        this.utleier = utleier;
    }

    //toString metode
    @Override
    public String toString() {
        return "Parkeringsplass{" +
                "adresse=" + adresse +
                ", pris=" + pris +
                ", utleier=" + utleier +
                '}';
    }
}
