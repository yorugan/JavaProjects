package com.company;

import java.util.Scanner;


public class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string and the program will reverse and print it out.");

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        String reversedString = "";

        for(int i = userInput.length() - 1; i>= 0; i--) // userInput.length -1 because of the null char at the end of the string
        {
            reversedString = reversedString + userInput.charAt(i);
        }
        System.out.printf("Reversed string is: %s", reversedString);
    }
}
