package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TidspunktTest {


    @Test
    void testToString() {
        Tidspunkt tideks = new Tidspunkt(16, 40, 0);
        String expected = "model.Tidspunkt{16:40:0}";

        Assert.assertEquals(expected, tideks.toString());
    }

    @Test
    void get_og_set_tester() {
        Tidspunkt testtidspunkt = new Tidspunkt(5,0,0);

        testtidspunkt.getMinutt();
        testtidspunkt.getSekund();
        testtidspunkt.getTime();

        testtidspunkt.setMinutt(4);
        testtidspunkt.setSekund(9);
        testtidspunkt.setTime(10);
    }
}