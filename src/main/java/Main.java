import model.*;

public class Main {

    public static void main(String[] args) {

        // Data med brukere, adresser, parkeringsplasser o.l vil være i
        Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
        Adresse brattveien13 = new Adresse("Brattveien", 13, "Halden");

        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        Bruker eivindhallan = new Bruker("Eivind", "Hallan", new Dato(17, 12, 1996), "ehallan@mailer.no", 13378302);

        Parkeringsplass eb14 = new Parkeringsplass(einerbakken14, new Pris(200, "Dag"), steinhanssen, 2);

        LeieAvParkering eheb14 = new LeieAvParkering(eivindhallan, eb14, new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020)), new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00)), 4);
        //System.out.println(EHEB14);



    }
}
