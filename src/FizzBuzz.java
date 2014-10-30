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
}
