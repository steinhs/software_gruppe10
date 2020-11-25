package model;

import java.util.ArrayList;

public class BrukerBedrift {

    //Variabler
    public String bedriftNavn;
    public long orgnr;
    public String epost;
    public int telefonnummer;
    public Adresse bedriftAdresse;
    public static ArrayList<BrukerBedrift> alleBedrifter = new ArrayList<BrukerBedrift>(); //Liste for alle opprettede parkeringsplasser
    public boolean epostBekreftelseStatus;

    public BrukerBedrift(String bedriftNavn, long orgnr, String epost, int telefonnummer, Adresse bedriftAdresse) {
        this.bedriftNavn = bedriftNavn;
        this.orgnr = orgnr;
        this.epost = epost;
        this.telefonnummer = telefonnummer;
        this.bedriftAdresse = bedriftAdresse;
        this.epostBekreftelseStatus = false;
        sendEpostBekreftelse(epost);
        alleBedrifter.add(this); //Legger bedrifter til liste
    }


    public static void sendEpostBekreftelse(String epost) {
        //Sender epostbekreftelse til registrert epostadresse
    }

    public static int mottaEpostBekreftelse(String bekreftelseAvEpost){
        for (int i = 0; i < alleBedrifter.size(); i++) {
            if (alleBedrifter.get(i).getEpost().equals(bekreftelseAvEpost)){
                if (alleBedrifter.get(i).isEpostBekreftelseStatus() == false) {
                    alleBedrifter.get(i).setEpostBekreftelseStatus(true);
                    System.out.println("Epost bekreftet");
                    return 1;
                } else if (alleBedrifter.get(i).isEpostBekreftelseStatus() == true){
                    System.out.println("Epost allerede bekreftet");
                    return 2;
                }
            }
        }
        System.out.println("Ingen bruker med registrert epost");
        return 0;
    }

    public long getOrgnr() {
        return orgnr;
    }

    public void setOrgnr(long orgnr) {
        this.orgnr = orgnr;
    }

    public boolean isEpostBekreftelseStatus() {
        return epostBekreftelseStatus;
    }

    public void setEpostBekreftelseStatus(boolean epostBekreftelseStatus) {
        this.epostBekreftelseStatus = epostBekreftelseStatus;
    }

    public String getBedriftNavn() {
        return bedriftNavn;
    }

    public void setBedriftNavn(String bedriftNavn) {
        this.bedriftNavn = bedriftNavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Adresse getBedriftAdresse() {
        return bedriftAdresse;
    }

    public void setBedriftAdresse(Adresse bedriftAdresse) {
        this.bedriftAdresse = bedriftAdresse;
    }


    @Override
    public String toString() {
        return "BrukerBedrift{" +
                "bedriftNavn='" + bedriftNavn + '\'' +
                ", orgnr=" + orgnr +
                ", epost='" + epost + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", bedriftAdresse=" + bedriftAdresse +
                ", epostBekreftelseStatus=" + epostBekreftelseStatus +
                '}';
    }
}
