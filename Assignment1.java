// *****************************************************************************
// Assignment1.java       Author: Michael Robert
//
// Submission for Assignment 1 in CS 114
// *****************************************************************************

// Import libraries here
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.text.DecimalFormat;

public class Assignment1 {
  // ---------------------------------------------------------------------------
  //  Print block initials, generate new string from user input.
  // ---------------------------------------------------------------------------
    public static void main(String[] args) {
      //Declare and Initialize variables
      int randInt;
      float tempF, tempC;
      String userString, shortenedString, tempString;

      //Create new objects
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      DecimalFormat fmt = new DecimalFormat("0.#");

      //Print "MR" in block letters
      System.out.println("");
      System.out.println("");
      System.out.println("MMM       MMM    RRRRRRRRRRR ");
      System.out.println("MMMMM   MMMMM    RRR      RRR");
      System.out.println("MMMMMM MMMMMM    RRR      RRR");
      System.out.println("MMM  MMM  MMM    RRRRRRRRRRR ");
      System.out.println("MMM       MMM    RRR  RRR    ");
      System.out.println("MMM       MMM    RRR    RRR  ");
      System.out.println("MMM       MMM    RRR      RRR");
      System.out.println("");
      System.out.println("");

      //Prompt for an integer temperature in Fahrenheit
      System.out.println("Enter a temperature in Fahrenheit:");
      tempF = scan.nextInt();
      System.out.println("");

      //Convert Fahrenheit to Celsius and keep only 1 decimal place
      tempC = (((tempF-32)*5)/9);
      tempString = fmt.format(tempC);

      //Prompt for a random 5 letter string, save to userString
      System.out.println("Enter a random 5-letter string:");
      userString = scan.next();
      System.out.println("");

      //Ensure the previously entered string is 5 characters long
      while(userString.length() != 5){
        System.out.println("");
        System.out.println("**Please make sure your string has 5 letters!**");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a random 5-letter string:");
        userString = scan.next();
        System.out.println("");
      }

      //Remove first and last characters of userString
      shortenedString = userString.substring(1, 4);

      //Break string into first, middle, and last characters
      char firstChar = shortenedString.charAt(0);
      char middleChar = shortenedString.charAt(1);
      char lastChar = shortenedString.charAt(2);

      //Generate random integer between 32 and 16384
      randInt = generator.nextInt(16353) + 32;
      System.out.println("Generating random integer between 32 and 16384...");
      System.out.println("");

      //Print new string
      System.out.println(tempString + lastChar + middleChar + firstChar +
      randInt);
      System.out.println("");
      System.out.println("");

      //Prevent resource leak
      scan.close();
    }
}
