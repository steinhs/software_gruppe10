package model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeietidTest {

    @Test
    void testToString() {
        Leietid leietideks = new Leietid(new Tidspunkt(16, 40, 00), new Tidspunkt(17, 40, 00));
        String expected = "model.Leietid{fratid=model.Tidspunkt{16:40:0}, tiltid=model.Tidspunkt{17:40:0}}";

        Assert.assertEquals(expected, leietideks.toString());
    }
}