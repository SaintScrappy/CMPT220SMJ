//file: StringLength.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 4
//Due March 3rd
//version: 1.0

import java.util.Scanner;

public class StringLength {
  public static void main (String[] args) {
	  
    Scanner input = new Scanner(System.in);
    System.out.print("Type out a string: ");
    String s = input.nextLine();
	System.out.println("The number of letters is " + countLetters(s));
  }
  public static int countLetters(String s) {
 
    int countLetter = 0;
 
    for (int i = 0; i < s.length(); i++) {
     if (isLetter(s.charAt(i))) {
      countLetter++;
     }
    }
    return countLetter;
  }
    public static boolean isLetter(char ch) {
    return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
    }
}