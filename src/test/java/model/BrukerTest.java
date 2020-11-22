package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrukerTest {


    @Test
    void testToString() {
        Bruker steinhanssen = new Bruker("Stein", "Hanssen", new Dato(16,01,1996), "steinhs@mail.com", 47359819);
        String expected = "model.Bruker{fornavn='Stein', etternavn='Hanssen', fodselsdato=Date{16-1-1996}, epost='steinhs@mail.com', telefonnummer=47359819}";

        Assert.assertEquals(expected, steinhanssen.toString());
    }
}