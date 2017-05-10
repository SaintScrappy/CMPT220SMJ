//file: ASCIIChar.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class ASCIIChar {
  public static void main (String[] args){
  
    Scanner input = new Scanner(System.in);
    
	//User inputs int which is ASCII code
    System.out.print("Put a ASCII code:");
    int s = input.nextInt();
 
    //ASCII code is displayed as character.
    System.out.print("The ASCII character " + s + " is "
      + (char) s);
  }
}