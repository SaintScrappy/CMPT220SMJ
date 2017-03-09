//file: NonDecreaseInts.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class NonDecreaseInts {
  public static void main (String args []) {
	  
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter three integers:");
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();
      int temp = 0;
 
    if (number1 > number2) {
     temp = number1;
     number1 = number2;
     number2 = temp;
    }
    if (number2 > number3) {
     temp = number2;
     number2 = number3;
     number3 = temp;
    }
    if (number1 > number2) {
     temp = number1;
     number1 = number2;
     number2 = temp;
    }
  System.out.println(number1);
  System.out.println(number2);
  System.out.println(number3);
 }
}