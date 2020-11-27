package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrukerTest {


    @Test
    void motta_epost_bekreftelse() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
        int expected = 1;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("steinhs@mail.com"));
    }

    @Test
    void motta_epost_bekreftelse_men_allerede_bekreftet() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
        steinhanssen.setEpostBekreftelseStatus(true);
        int expected = 2;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("steinhs@mail.com"));
    }

    @Test
    void motta_epost_bekreftelse_men_epost_finnes_ikke(){
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
        int expected = 0;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("feilepost@meil.no"));
    }

    @Test
    void get_Fornavn() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.getFornavn();
    }

    @Test
    void set_Fornavn() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.setFornavn("Marcus");
    }

    @Test
    void get_Etternavn() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.getEtternavn();
    }

    @Test
    void set_Etternavn() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.setEtternavn("Utigaard");
    }

    @Test
    void get_Fodsels_dato() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.getFodselsdato();
    }

    @Test
    void set_Fodselsdato() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.setFodselsdato(new Dato(19,10,1999));
    }

    @Test
    void set_Epost() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.setEpost("annenmail@mail.com");
    }

    @Test
    void get_Telefonnummer() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.getTelefonnummer();
    }

    @Test
    void set_Telefonnummer() {
        Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
        markusutigard.setTelefonnummer(98989822);
    }

    @Test
    void testToString() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
        String expected = "Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819, epostBekreftelseStatus=false}";
        Assert.assertEquals(expected, steinhanssen.toString());
    }
}