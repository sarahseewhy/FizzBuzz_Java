import java.util.ArrayList;

/**
 * Created by sarah on 10/30/14.
 */
public class FizzBuzz {

    //Checks if a number is divisible by three
    public boolean divisibleByThree(int number) {
        boolean result = false;
        if(number % 3 == 0) {
            result = true;
        }
        return result;
    }

    //Checks if a number is divisible by five
    public boolean divisibleByFive(int number) {
        boolean result = false;
        if(number % 5 == 0) {
            result = true;
        }
        return result;
    }

    //Checks if a number is divisible by fifteen
    public boolean divisibleByFifteen(int number) {
        boolean result = false;
        if(number % 15 == 0) {
            result = true;
        }
        return result;
    }

    public String returnsNumber(int number) {
        return String.valueOf(number);
    }

    public String playFizzBuzz(int number) {
        String result = null;

        if(divisibleByFifteen(number)) {
            result = "FizzBuzz";
        }else if(divisibleByThree(number)) {
            result = "Fizz";
        }else if(divisibleByFive(number)) {
            result = "Buzz";
        }else{
            result = returnsNumber(number);
        }
        return result;
    }
}
