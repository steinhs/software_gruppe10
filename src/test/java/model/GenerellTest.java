package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerellTest {

    Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
    Adresse brattveien13 = new Adresse("Brattveien", 13, "Halden");
    Adresse oreveien2 = new Adresse("Oreveien", 2, "Oslo");
    Adresse gulveien11 = new Adresse("Gulveien", 11, "Malvik");
    Adresse skoggata17 = new Adresse("Skoggata", 17, "Fredrikstad");
    Adresse gronnerud22 = new Adresse("Grønnerud", 22, "Bergen");
    Adresse torkveien10 = new Adresse("Torkveien", 10, "Stavanger");
    Adresse silgata12 = new Adresse("Silgata", 12, "Tromsø");
    Adresse veggveien29 = new Adresse("Veggveien", 29, "Orkanger");

    Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,1,1996), "steinhs@mail.com", 47359819);
    Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);
    BrukerBedrift olgasParkeringer = new BrukerBedrift("Olgas Parkeringer", 512311212, "olgasParks@mail.com", 32425412);

    Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);
    Parkeringsplass bv13 = new Parkeringsplass(brattveien13, new Pris(13, "Time"), eivindhallan, 1);
    Parkeringsplass ov2 = new Parkeringsplass(oreveien2, new Pris(1200, "Uke"), olgasParkeringer, 1);
    Parkeringsplass gv11 = new Parkeringsplass(gulveien11, new Pris(170, "Dag"), steinhanssen, 4);
    Parkeringsplass sg17 = new Parkeringsplass(skoggata17, new Pris(14, "Time"), eivindhallan, 6);
    Parkeringsplass gr22 = new Parkeringsplass(gronnerud22, new Pris(2200, "Uke"), olgasParkeringer, 2);
    Parkeringsplass tv10 = new Parkeringsplass(torkveien10, new Pris(100, "Dag"), steinhanssen, 23);
    Parkeringsplass sg12 = new Parkeringsplass(silgata12, new Pris(17, "Time"), eivindhallan, 11);
    Parkeringsplass vv29 = new Parkeringsplass(veggveien29, new Pris(1800, "Uke"), olgasParkeringer, 5);

    LeieAvParkering leieEB14 = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 0), new Tidspunkt(17, 40, 0)), true);
    LeieAvParkering leieEB14betalingfeil = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 0), new Tidspunkt(17, 40, 0)), false);

    //Test for oppretting av en bruker.
    @Test
    void oppretting_av_brukerkonto() {
        Bruker testBruker = new Bruker("Tor", "Sigurdson", new Dato(1,1,970), "torsigurdson@mail.com", 1881);
    }

}