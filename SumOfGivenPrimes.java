import java.util.*;
public class SumOfGivenPrimes {
    public static void main(String[] args)
    {
        Scanner SN = new Scanner(System.in);
        // Get amount of numbers
        System.out.println("Enter the number of digits");
        byte number = SN.nextByte();
        int sumOfPrime = 0;
        while(number>0)
        {
            boolean isNumberPrime = true;
            int userInputNumber = SN.nextInt();
            // Calculate if number is prime
            for (int i = 2; i<userInputNumber; i++)
            {
                if(userInputNumber%i == 0)
                {
                    isNumberPrime = false;
                    break;
                }
            }
            // if number is a prime, append to sum of primes
            if(isNumberPrime == true && userInputNumber != 1)
            {
                sumOfPrime+=userInputNumber;
            }
            number--;
        }
        // output sum of primes
        System.out.println("The sum of added primes is :" + sumOfPrime);
        SN.close();
    }
}
/* VARIABLE DESCRIPTION TABLE
 * SN - User Input
 * Number - Number of digits
 * sumOfPrime - Sum Of Prime Numbers
 * isNumberPrime - Used to check if the number is prime or not
 * userInputNumber - number input by the user
 */