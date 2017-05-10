//file: SumAnInteger.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 1
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class SumAnInteger {
  public static void main(String[] args) {
	  
	Scanner input = new Scanner (System.in);
	
    System.out.print("Enter an integer between 0 and 1000.");
	
	//User inputs specified integer
    int number = input.nextInt();
	
    //Computes the sum of digits in an integer
    int lastDigit = number % 10;
    int remainingNumber = number/10;
    int secondLastDigit = remainingNumber % 10;
    remainingNumber = remainingNumber/10;
    int thirdLastDigit = remainingNumber % 10;
    int sum = lastDigit + secondLastDigit + thirdLastDigit;
	
    System.out.println("The sum of the integer" + " is " + sum);
  }
}