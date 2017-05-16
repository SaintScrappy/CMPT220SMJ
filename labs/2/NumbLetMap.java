//file: NumbLetMap.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class NumbLetMap {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter a letter:");
	//User inputs letter
    String s = input.next();
 
    char c = s.toLowerCase().charAt(0);
    int n;
 
    //Displays corresponding number based on case met.
    switch (c) {
      case 'a':
      case 'b':
      case 'c':
        n = 2;
        break;
 
      case 'd':
      case 'e':
      case 'f':
        n = 3;
        break;
 
      case 'g':
      case 'h':
      case 'i':
        n = 4;
        break;
 
      case 'j':
      case 'k':
      case 'l':
        n = 5;
        break;
 
      case 'm':
      case 'n':
      case 'o':
        n = 6;
        break;
 
      case 'p':
      case 'q':
      case 'r':
      case 's':
        n = 7;
        break;
 
      case 't':
      case 'u':
      case 'v':
        n = 8;
        break;
 
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        n = 9; 
        break;
 
      default:
        n = 0;
        break;
    }
	//Condition for printing number if user correctly inputs a letter.
    if (n != 0) {
      System.out.print("The corresponding number is " + n);
      System.exit(0);
    }
    System.out.print(s + " is an invalid input");
  }
}