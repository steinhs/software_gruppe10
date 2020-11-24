package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ParkeringsplassTest {
    Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
    Adresse brattveien13 = new Adresse("Brattveien", 13, "Halden");
    Adresse oreveien2 = new Adresse("Oreveien", 2, "Oslo");

    Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
    Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);
    Bruker olanordy = new Bruker("Ola", "Nordmann", new Dato(05, 02, 2000), "on@mailer.no", 383471237);

    Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);
    Parkeringsplass bv13 = new Parkeringsplass(brattveien13, new Pris(13, "Time"), eivindhallan, 1);
    Parkeringsplass ov2 = new Parkeringsplass(oreveien2, new Pris(124, "Dag"), olanordy, 5);

    @Test
    void vis_alle_parkeringsplasser() {
        Parkeringsplass.visAlleParkeringsplassAdresser();
    }

    @Test
    void sok_etter_by_som_er_registrert() {
        Parkeringsplass.sokEtterBy("Oslo");
    }

    @Test
    void sok_etter_by_som_ikke_er_registrert() {
        Parkeringsplass.sokEtterBy("Bergen");
    }

    @Test
    void slett_parkering_fra_system() {
        Parkeringsplass.slettParkering(ov2);
    }

    @Test
    void testToString() {
        String expected = "model.Parkeringsplass{adresse=model.Adresse{gatenavn='Einerbakken', gatenr=14, sted='Egersund'}, pris=model.Pris{Kr200.0 per Dag}, utleier=model.Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819}}";

        Assert.assertEquals(expected, eb14.toString());
    }
}