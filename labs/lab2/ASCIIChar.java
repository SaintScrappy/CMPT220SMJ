//file: ASCIIChar.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class ASCIIChar {
  public static void main (String[] args){
  
  Scanner input = new Scanner(System.in);
 
  System.out.print("Put a ASCII code:");
  int s = input.nextInt();
 
  System.out.print("The ASCII character " + s + " is "
    + (char) s);
  
  }
}