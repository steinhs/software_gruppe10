package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdresseTest {
    Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");


    @Test
    void testToString() {
        Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
        String expected = "model.Adresse{gatenavn='Einerbakken', gatenr=14, sted='Egersund'}";

        Assert.assertEquals(expected, einerbakken14.toString());
    }

    @Test
    void getGatenavn() {
        einerbakken14.getGatenavn();
    }

    @Test
    void setGatenavn() {
        einerbakken14.setGatenavn("Einertatten");
    }

    @Test
    void getGatenr() {
        einerbakken14.getGatenr();
    }

    @Test
    void setGatenr() {
        einerbakken14.setGatenr(15);
    }

    @Test
    void getSted() {
        einerbakken14.getSted();
    }

    @Test
    void setSted() {
        einerbakken14.setSted("Bryne");
    }
}