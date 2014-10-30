import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void divisibleByThree() {
        FizzBuzz game = new FizzBuzz();
        boolean result = game.divisibleByThree(3);
        assertEquals(true, result);
    }

    @Test
    public void notDivisibleByThree() {
        FizzBuzz game = new FizzBuzz();
        boolean result = game.divisibleByThree(4);
        assertEquals(false, result);
    }
}