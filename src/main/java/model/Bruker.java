package model;

import java.util.ArrayList;

public class Bruker{

    //Variabler
    public String fornavn;
    public String etternavn;
    public Dato fodselsdato;
    public String epost;
    public int telefonnummer;
    public static ArrayList<Bruker> alleBrukere = new ArrayList<Bruker>(); //Liste for alle opprettede parkeringsplasser
    public boolean epostBekreftelseStatus;

    //Konstruktører
    public Bruker(String fornavn, String etternavn, Dato fodselsdato, String epost, int telefonnummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsdato = fodselsdato;
        this.epost = epost;
        this.telefonnummer = telefonnummer;
        this.epostBekreftelseStatus = false;
        sendEpostBekreftelse(epost);
        alleBrukere.add(this); //Legger bruker til liste
    }

    //Getters og Setters
    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Dato getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(Dato fodselsdato) {
        this.fodselsdato = fodselsdato;
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

    public boolean isEpostBekreftelseStatus() {
        return epostBekreftelseStatus;
    }

    public void setEpostBekreftelseStatus(boolean epostBekreftelseStatus) {
        this.epostBekreftelseStatus = epostBekreftelseStatus;
    }



    public static void sendEpostBekreftelse(String epost) {
        //Sender epostbekreftelse til registrert epostadresse
    }

    public static int mottaEpostBekreftelse(String bekreftelseAvEpost){
        for (int i = 0; i < alleBrukere.size(); i++) {
            if (alleBrukere.get(i).getEpost().equals(bekreftelseAvEpost)){
                if (alleBrukere.get(i).isEpostBekreftelseStatus() == false) {
                    alleBrukere.get(i).setEpostBekreftelseStatus(true);
                    System.out.println("Epost bekreftet");
                    return 1;
                } else if (alleBrukere.get(i).isEpostBekreftelseStatus() == true){
                    System.out.println("Epost allerede bekreftet");
                    return 2;
                }
            }
        }
        System.out.println("Ingen bruker med registrert epost");
        return 0;
    }


    @Override
    public String toString() {
        return "Bruker{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", fodselsdato=" + fodselsdato +
                ", epost='" + epost + '\'' +
                ", telefonnummer=" + telefonnummer +
                ", epostBekreftelseStatus=" + epostBekreftelseStatus +
                '}';
    }
}
