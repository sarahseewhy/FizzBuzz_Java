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

    @Test
    public void divisibleByFive() {
        boolean result = game.divisibleByFive(5);
        assertEquals(true, result);
    }

    @Test
    public void notDivisibleByFive() {
        boolean result = game.divisibleByFive(7);
        assertEquals(false, result);
    }

    @Test
    public void divisibleByFifteen() {
        boolean result = game.divisibleByFifteen(15);
        assertEquals(true, result);
    }

    @Test
    public void notDivisibleByFifteen() {
        boolean result = game.divisibleByFifteen(17);
        assertEquals(false, result);
    }

    @Test
    public void returnsNumber() {
        String result = game.returnsNumber(4);
        assertEquals("4", result);
    }

    @Test
    public void gameSaysFizzBuzz() {
        String result1 = game.playFizzBuzz(15);
        assertEquals("FizzBuzz", result1);
    }
}