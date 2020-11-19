package model;

public class Bruker {

    //Variabler
    public String fornavn;
    public String etternavn;
    public Dato fodselsdato;
    public String epost;
    public int telefonnummer;

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

    //Konstruktører
    public Bruker(String fornavn, String etternavn, Dato fodselsdato, String epost, int telefonnummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsdato = fodselsdato;
        this.epost = epost;
        this.telefonnummer = telefonnummer;
    }

    //toString metode
    @Override
    public String toString() {
        return "model.Bruker{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", fodselsdato=" + fodselsdato +
                ", epost='" + epost + '\'' +
                ", telefonnummer=" + telefonnummer +
                '}';
    }
}
