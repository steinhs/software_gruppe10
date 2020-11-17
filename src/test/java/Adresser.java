import org.junit.jupiter.api.*;

public class Adresser {
    @Test()
    public void printmessage(){
        System.out.println("Hello");
    }

    @Test
    public void leap_years_are_divisible_by_4_but_not_by_100() {
        String actual = "Hello";

        Assertions.assertEquals("Hello", actual);
    }
}
