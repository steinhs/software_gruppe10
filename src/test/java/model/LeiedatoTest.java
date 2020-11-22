package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeiedatoTest {


    @Test
    void testToString() {
        Leiedato leiedatoeks = new Leiedato(new Dato(16, 11, 2020), new Dato(16, 11, 2020));
        String expected = "model.Leiedato{fradato=Date{16-11-2020}, tildato=Date{16-11-2020}}";

        Assert.assertEquals(expected, leiedatoeks.toString());
    }
}