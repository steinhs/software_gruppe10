package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TidspunktTest {


    @Test
    void testToString() {
        Tidspunkt tideks = new Tidspunkt(16, 40, 00);
        String expected = "model.Tidspunkt{16:40:0}";

        Assert.assertEquals(expected, tideks.toString());
    }
}