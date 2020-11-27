package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrukerBedriftTest {
    Adresse oreveien2 = new Adresse("Oreveien", 2, "Oslo");
    BrukerBedrift olgasParkeringer = new BrukerBedrift("Olgas Parkeringer", 512311212, "olgasParks@mail.com", 32425412);

    @Test
    void motta_epost_bekreftelse() {
        int expected = 1;
        Assert.assertEquals(expected, BrukerBedrift.mottaEpostBekreftelse("olgasParks@mail.com"));
    }

    @Test
    void motta_epost_bekreftelse_men_allerede_bekreftet() {
        olgasParkeringer.setEpostBekreftelseStatus(true);
        int expected = 2;
        Assert.assertEquals(expected, BrukerBedrift.mottaEpostBekreftelse("olgasParks@mail.com"));
    }

    @Test
    void motta_epost_bekreftelse_men_ingen_registrert_epost() {
        int expected = 0;
        Assert.assertEquals(expected, BrukerBedrift.mottaEpostBekreftelse("epostFinnesIkke@mail.com"));
    }

    @Test
    void testToString() {
        String expected = "BrukerBedrift{bedriftNavn='Olgas Parkeringer', orgnr=512311212, epost='olgasParks@mail.com', telefonnummer=32425412, epostBekreftelseStatus=false}";
        Assert.assertEquals(expected, olgasParkeringer.toString());
    }

    @Test
    void get_og_set_Tester() {
        olgasParkeringer.getEpost();
        olgasParkeringer.getBedriftNavn();
        olgasParkeringer.getOrgnr();
        olgasParkeringer.getTelefonnummer();

        olgasParkeringer.setEpost("epost");
        olgasParkeringer.setEpostBekreftelseStatus(true);
        olgasParkeringer.setBedriftNavn("Olgas bedrifter");
        olgasParkeringer.setOrgnr(2);
        olgasParkeringer.setTelefonnummer(11223344);
    }
}