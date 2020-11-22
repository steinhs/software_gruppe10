package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisTest {


    @Test
    void testToString() {
        Pris priseks = new Pris(120, "time");
        String expected = "model.Pris{Kr120.0 per time}";

        Assert.assertEquals(expected, priseks.toString());
    }
}