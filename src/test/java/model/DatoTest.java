package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatoTest {


    @Test
    void testToString() {
        Dato datoeks = new Dato(16,01,1996);

        String expected = "Date{16-1-1996}";

        Assert.assertEquals(expected, datoeks.toString());
    }
}