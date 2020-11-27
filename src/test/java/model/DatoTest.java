package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatoTest {

    @Test
    void get_og_set_tester() {
        Dato testdato = new Dato(1,3,1978);

        testdato.getAar();
        testdato.getDag();
        testdato.getMaaned();

        testdato.setAar(1997);
        testdato.setDag(3);
        testdato.setMaaned(6);
    }

    @Test
    void testToString() {
        Dato datoeks = new Dato(16,1,1996);

        String expected = "Date{16-1-1996}";

        Assert.assertEquals(expected, datoeks.toString());
    }
}