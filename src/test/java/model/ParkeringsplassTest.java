package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ParkeringsplassTest {
    Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
    Adresse brattveien13 = new Adresse("Brattveien", 13, "Halden");
    Adresse oreveien2 = new Adresse("Oreveien", 2, "Oslo");
    Adresse oreveien4 = new Adresse("Oreveien", 4, "Oslo");

    Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
    Bruker markusutigard = new Bruker("Markus", "Utigard", new Dato(19,9,1999), "markusutigard@mail.com", 85848584);
    Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);
    Bruker olanordy = new Bruker("Ola", "Nordmann", new Dato(5, 2, 2000), "on@mailer.no", 383471237);
    BrukerBedrift olgasParkeringer = new BrukerBedrift("Olgas Parkeringer", 512311212, "olgasParks@mail.com", 32425412);

    Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);
    Parkeringsplass bv13 = new Parkeringsplass(brattveien13, new Pris(13, "Time"), eivindhallan, 1);
    Parkeringsplass ov2 = new Parkeringsplass(oreveien2, new Pris(124, "Dag"), olanordy, 5);
    Parkeringsplass ov4 = new Parkeringsplass(oreveien4, new Pris(124, "Dag"), olanordy, 5);
    Parkeringsplass ov22 = new Parkeringsplass(oreveien2, new Pris(1200, "Uke"), olgasParkeringer, 1);

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
    void sok_Etter_Parkerings_Plass_og_sorter() {
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(0, "Oslo");
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(0, "");
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(1, "Halden");
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(1, "");
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(2, "Egersund");
        Parkeringsplass.sokEtterParkeringsPlassOgSorter(2, "");

    }

    @Test
    void set_Adresse() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setAdresse(einerbakken14);
    }

    @Test
    void set_Pris() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setPris(new Pris(79,"Time"));
    }

    @Test
    void get_Utleier() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.getUtleier();
    }

    @Test
    void set_Utleier() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setUtleier(steinhanssen);
    }

    @Test
    void get_Antall_Parkeringer() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.getAntallParkeringer();
    }

    @Test
    void set_Antall_Parkeringer() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setAntallParkeringer(2);
    }

    @Test
    void er_Parkering_Tatt() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.isParkeringTatt();
    }

    @Test
    void set_er_Parkeringen_tatt() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setParkeringTatt(true);
    }

    @Test
    void get_Bedrift_Utleier() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.getBedriftUtleier();
    }

    @Test
    void set_Bedrift_Utleier() {
        Parkeringsplass testPark = new Parkeringsplass(oreveien2, new Pris(50,"Time"), markusutigard,3);
        testPark.setBedriftUtleier(olgasParkeringer);
    }

    @Test
    void testToString() {
        String expected = "model.Parkeringsplass{adresse=model.Adresse{gatenavn='Einerbakken', gatenr=14, sted='Egersund'}, pris=model.Pris{Kr200.0 per Dag}, utleier=Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819, epostBekreftelseStatus=false}}";

        Assert.assertEquals(expected, eb14.toString());
    }
}