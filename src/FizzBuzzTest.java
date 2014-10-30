import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz game = new FizzBuzz();

    @Test
    public void divisibleByThree() {
        boolean result = game.divisibleByThree(3);
        assertEquals(true, result);
    }

    @Test
    public void notDivisibleByThree() {
        boolean result = game.divisibleByThree(4);
        assertEquals(false, result);
    }
}