package model;

import java.util.ArrayList;

public class Parkeringsplass {

    //Variabler
    public Adresse adresse;
    public Pris pris;
    public Bruker utleier;
    public BrukerBedrift bedriftUtleier;
    public int antallParkeringer;
    public static ArrayList<Parkeringsplass> alleParkeringsplasser = new ArrayList<>(); //Liste for alle opprettede parkeringsplasser
    public boolean parkeringTatt = false;


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

    public int getAntallParkeringer() {
        return antallParkeringer;
    }

    public void setAntallParkeringer(int antallParkeringer) {
        this.antallParkeringer = antallParkeringer;
    }

    public boolean isParkeringTatt() {
        return parkeringTatt;
    }

    public void setParkeringTatt(boolean parkeringTatt) {
        this.parkeringTatt = parkeringTatt;
    }
    public BrukerBedrift getBedriftUtleier() {
        return bedriftUtleier;
    }

    public void setBedriftUtleier(BrukerBedrift bedriftUtleier) {
        this.bedriftUtleier = bedriftUtleier;
    }

    //Konstruktører
    public Parkeringsplass(Adresse adresse, Pris pris, Bruker utleier, int antallParkeringer) {
        this.adresse = adresse;
        this.pris = pris;
        this.utleier = utleier;
        this.antallParkeringer = antallParkeringer;
        alleParkeringsplasser.add(this); //Legger parkeringsplass til liste ved opprettelse
    }

    public Parkeringsplass(Adresse adresse, Pris pris, BrukerBedrift bedriftUtleier, int antallParkeringer) {
        this.adresse = adresse;
        this.pris = pris;
        this.bedriftUtleier = bedriftUtleier;
        this.antallParkeringer = antallParkeringer;
        alleParkeringsplasser.add(this); //Legger parkeringsplass til liste ved opprettelse
    }

    //For å vise alle parkeringsplass adresser
    public static void visAlleParkeringsplassAdresser(){
        for (int i = 0; i < alleParkeringsplasser.size(); i++) {
            System.out.println(alleParkeringsplasser.get(i).adresse.getGatenavn() + " " + alleParkeringsplasser.get(i).adresse.getGatenr());

        }
    }

    public static void sokEtterBy(String stedsnavn){
        ArrayList<Parkeringsplass> sokResultat = new ArrayList<Parkeringsplass>();
        for (int i = 0; i < alleParkeringsplasser.size() ; i++){
            if (alleParkeringsplasser.get(i).adresse.getSted().contains(stedsnavn)){
                sokResultat.add(alleParkeringsplasser.get(i));
                System.out.println(alleParkeringsplasser.get(i).adresse.getGatenavn());
            }
        }
        if (sokResultat.isEmpty()) {
            System.out.println("Ingen parkerinsplasser tilgjengelig i " + stedsnavn);
        }
    }

    public static void slettParkering(Parkeringsplass parkeringsplass){
        for (int i = 0; i < alleParkeringsplasser.size(); i++){
            if (alleParkeringsplasser.get(i).getAdresse() == parkeringsplass.getAdresse()){
                alleParkeringsplasser.remove(i);
            }
        }
    }

    public static ArrayList<Parkeringsplass> sokEtterParkeringsPlassOgSorter(int sorteringsMetode, String sok) {
        ArrayList<Parkeringsplass> sokResultat = new ArrayList<>();
        System.out.println("Sorteringsmetode: " + sorteringsMetode);
        System.out.println("Søk var: " + sok);

        for (Parkeringsplass parkeringsplass : alleParkeringsplasser) {
            if (parkeringsplass.adresse.getSted().contains(sok)) {
                sokResultat.add(parkeringsplass);
            }
        }

        //Pris (Lav)
        if (sorteringsMetode==0) {
            sokResultat.sort(Parkeringsplass.parkeringsplassComparatorPrisLav);
        }

        //Pris (Høy)
        if (sorteringsMetode==1) {
            sokResultat.sort(Parkeringsplass.parkeringsplassComparatorPrisHoy);
        }


    //toString metode
    @Override
    public String toString() {
        return "model.Parkeringsplass{" +
                "adresse=" + adresse +
                ", pris=" + pris +
                ", utleier=" + utleier +
                '}';
    }
}
