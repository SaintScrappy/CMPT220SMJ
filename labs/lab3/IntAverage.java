//file: IntAverage.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

import java.util.Scanner;

public class IntAverage {
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, put 0 at the end: ");
   
    int n = 0;
    int countNeg = 0;
    int countPos = 0;
    float sum = 0;
  
    do {
	sum = sum + n;
	
    if (n > 0) {
    countPos++;
    } else if (n < 0) {
      countNeg++;
      }
    } while ((n = input.nextInt()) != 0);
	
      if (countPos + countNeg == 0) {
      System.out.println("No numbers are entered except 0");
      System.exit(0);
      }
   
   System.out.println("The positive number is " + countPos);
   System.out.println("The negative number is " + countNeg);
   System.out.println("The total is " + sum);
   System.out.println("The average is " + (sum/(countPos + countNeg)));
  }
}

