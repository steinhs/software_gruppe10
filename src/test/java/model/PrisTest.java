package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisTest {
    Pris priseks = new Pris(120, "time");

    @Test
    void testToString() {
        Pris priseks = new Pris(120, "time");
        String expected = "model.Pris{Kr120.0 per time}";

        Assert.assertEquals(expected, priseks.toString());
    }

    @Test
    void get_og_set_tester() {

        priseks.getPrisPerTime();
        priseks.getPris();
        priseks.getPrisPerX();

        priseks.setPris(2);
        priseks.setPrisPerX("Time");
        priseks.setPrisPerTime(2);
    }
}