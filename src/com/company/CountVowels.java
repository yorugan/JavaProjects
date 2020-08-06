package com.company;

import java.util.Scanner;


public class CountVowels
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string and the program will count the number of vowels");

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        int vowelCount = 0;
        for(int i = 0; i < userInput.length(); i++)
        {
            char vowel = userInput.charAt(i);
            if(vowel == 'a' || vowel == 'e'|| vowel == 'i'|| vowel == 'o'|| vowel == 'u')
            {
                vowelCount++;
            }
        }
        System.out.printf("Number of vowels in word %s is/are: %d", userInput, vowelCount);
    }
}
