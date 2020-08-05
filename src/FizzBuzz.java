import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String args[])
    {
        System.out.println("Welcome to FizzBuzz calculator. \nPlease enter a number you wish to calculate");

        Scanner input = new Scanner(System.in);
        int numberToBeCalculated = input.nextInt();
        int fizzBuzzCounter = 0, fizzCounter = 0, buzzCounter = 0;

        for(int i = 1; i<numberToBeCalculated+1; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
                fizzBuzzCounter++;
            }else if(i%3 == 0)
            {
                System.out.println("Fizz");
                fizzCounter++;
            }else if(i%5 == 0)
            {
                System.out.println("Buzz");
                buzzCounter++;
            }else
            {
                System.out.println(i);
            }
        }
        System.out.printf("Total number of Fizz were: %d", fizzCounter);
        System.out.printf("\nTotal number of Buzz were: %d", buzzCounter);
        System.out.printf("\nTotal number of FizzBuzz were: %d", fizzBuzzCounter);
    }
}
