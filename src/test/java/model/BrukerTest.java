package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrukerTest {


    @Test
    void motta_epost_bekreftelse() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        int expected = 1;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("steinhs@mail.com"));
    }

    @Test
    void motta_epost_bekreftelse_men_allerede_bekreftet() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        steinhanssen.setEpostBekreftelseStatus(true);
        int expected = 2;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("steinhs@mail.com"));
    }

    @Test
    void testepost(){
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        int expected = 0;
        Assert.assertEquals(expected, Bruker.mottaEpostBekreftelse("hei"));
    }

    @Test
    void testToString() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        String expected = "Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819, epostBekreftelseStatus=false}";
        Assert.assertEquals(expected, steinhanssen.toString());
    }
}