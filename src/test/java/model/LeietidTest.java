package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeietidTest {

    @Test
    void testToString() {
        Leietid leietideks = new Leietid(new Tidspunkt(16, 40, 0), new Tidspunkt(17, 40, 0));
        String expected = "model.Leietid{fratid=model.Tidspunkt{16:40:0}, tiltid=model.Tidspunkt{17:40:0}}";

        Assert.assertEquals(expected, leietideks.toString());
    }

    @Test
    void get_og_set_tester() {
        Leietid testleietid = new Leietid(new Tidspunkt(10, 0, 0), new Tidspunkt(11, 0, 0));

        testleietid.getFratid();
        testleietid.getTiltid();

        testleietid.setFratid(new Tidspunkt(11,0,0));
        testleietid.setTiltid(new Tidspunkt(12,0,0));
    }
}