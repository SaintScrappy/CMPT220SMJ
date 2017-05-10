//file: MoneyApp.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class MoneyApp {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter a double value. ");
	
	//User input any amount of money in the form of a double.
    String amount = input.nextLine();
	
	//Extracts the dollars
    int numberOfOneDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
	//Extracts the cents
    int numberOfCents = Integer.parseInt(amount.substring( amount.indexOf('.')+1));

	//Find number of cents
    int numberOfQuarters = numberOfCents / 25;
    numberOfCents = numberOfCents % 25;
 
    int numberOfDimes = numberOfCents / 10;
    numberOfCents = numberOfCents % 10;
 
    int numberOfNickels = numberOfCents / 5;
    numberOfCents = numberOfCents % 5;
 
    int numberOfPennies = numberOfCents;
 
    System.out.println("Your amount " + amount + " has"); 
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters ");
    System.out.println("    " + numberOfDimes + " dimes"); 
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
	}
}
