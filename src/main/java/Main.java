import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ");

        Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
        Adresse brattveien13 = new Adresse("Brattveien", 13, "Halden");
        Adresse oreveien2 = new Adresse("Oreveien", 2, "Oslo");

        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);
        BrukerBedrift olgasParkeringer = new BrukerBedrift("Olgas Parkeringer", 512311212, "olgasParks@mail.com", 32425412);

        Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);
        Parkeringsplass bv13 = new Parkeringsplass(brattveien13, new Pris(13, "Time"), eivindhallan, 1);
        Parkeringsplass ov2 = new Parkeringsplass(oreveien2, new Pris(1200, "Uke"), olgasParkeringer, 1);

        //Leie av einerbakken, betaling fullføres
        LeieAvParkering eheb14 = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), true);
        //Leie av brattveien, men betaling feiler
        LeieAvParkering ehbv13FeiletBetaling = new LeieAvParkering(eivindhallan, bv13, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), false);


        System.out.println(" ----------- Is parkering tatt -----------");
        System.out.println(" * Einerbakken(betaling fullført):");
        System.out.println(eb14.isParkeringTatt());
        System.out.println(" * Brattveien (betaling feilet):");
        System.out.println(bv13.isParkeringTatt());
        System.out.println(" ");

        System.out.println(" ----------- Vise parkeringer i Oslo -----------");
        Parkeringsplass.sokEtterBy("Oslo");
        System.out.println(" ----------- Vise parkeringer i Sarpsborg -----------");
        Parkeringsplass.sokEtterBy("Sarpsborg");

        System.out.println(" ");

        System.out.println(" ----------- Før sletting ----------- ");
        Parkeringsplass.visAlleParkeringsplassAdresser();
        Parkeringsplass.slettParkering(bv13);
        System.out.println(" ----------- Etter sletting av Brattveien 13 -----------");
        Parkeringsplass.visAlleParkeringsplassAdresser();
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ----------- Før motatt epost-bekreftelse -----------");
        System.out.println(steinhanssen.isEpostBekreftelseStatus());
        System.out.println(" ----------- Bruker bekrefter epost **");
        Bruker.mottaEpostBekreftelse("steinhs@mail.com");
        System.out.println(" ----------- Etter motatt epost-bekreftelse -----------");
        System.out.println(steinhanssen.isEpostBekreftelseStatus());

        System.out.println(" ----------- Prøver igjen ----------- ");
        Bruker.mottaEpostBekreftelse("steinhs@mail.com");


    }
}
