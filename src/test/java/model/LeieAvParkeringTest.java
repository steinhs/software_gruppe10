package model;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeieAvParkeringTest {
    Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
    Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);
    Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
    Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);
    LeieAvParkering eheb14 = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), true);
    LeieAvParkering eheb14F = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), false);


    @Test
    void betaling_akseptert() {
        LeieAvParkering eheb14 = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), true);
        Assert.assertTrue(LeieAvParkering.betalingAvParkering(true));
    }

    @Test
    void betaling_avslatt() {
        LeieAvParkering eheb14F = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), false);
        Assert.assertFalse(LeieAvParkering.betalingAvParkering(false));
    }

    @Test
    void testToString() {
        String expected = "LeieAvParkering{leietaker=Bruker{fornavn='Eivind', etternavn='Hallan', fodselsdato=Date{17-12-1996}, epost='ehallan@mailer.no', telefonnummer=13378302, epostBekreftelseStatus=false}, parkeringsplass=model.Parkeringsplass{adresse=model.Adresse{gatenavn='Einerbakken', gatenr=14, sted='Egersund'}, pris=model.Pris{Kr200.0 per Dag}, utleier=Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819, epostBekreftelseStatus=false}}, leiedato=model.Leiedato{fradato=Date{16-11-2020}, tildato=Date{16-11-2020}}, leietid=model.Leietid{fratid=model.Tidspunkt{16:40:0}, tiltid=model.Tidspunkt{17:40:0}}, betalingsBekreftelse=true}";
        Assert.assertEquals(expected, eheb14.toString());
    }
}