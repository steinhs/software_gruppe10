package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdresseTest {


    @Test
    void testToString() {
        Adresse einerbakken14 = new Adresse("Einerbakken", 14, "Egersund");
        String expected = "model.Adresse{gatenavn='Einerbakken', gatenr=14, sted='Egersund'}";

        Assert.assertEquals(expected, einerbakken14.toString());
    }
}