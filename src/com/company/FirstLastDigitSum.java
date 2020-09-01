package com.company;
import java.security.SecureRandom;

public class FirstLastDigitSum
{
        public static int sumFirstAndLastDigit(int number)
        {
            int sum = 0;
            int firstDigit = 0;
            int lastDigit = number % 10;

            if(number >= 0)
            {
                while(number != 0)
                {
                    firstDigit = number;

                    number /= 10;

                    if(number <= 0)
                    {
                        break;
                    }
                }

                sum = firstDigit + lastDigit;
                return sum;
            }else{
                return -1;
            }

        }

    public static void main(String[] args)
    {
        SecureRandom random = new SecureRandom();
        int randomNumber = Math.abs(random.nextInt());
        int sum = sumFirstAndLastDigit(randomNumber);
        System.out.println("The random number is: " + randomNumber);
        System.out.println("The sum of first and last digit of the number is: " + sum);
    }
}




