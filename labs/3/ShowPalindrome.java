//file: ShowPalindrome.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

import java.util.Scanner;

public class ShowPalindrome {
  public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
	
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    
	//Used for stating if number is palindrome
    if (isPalindrome(number)) {
      System.out.print(number + " is palindrome");
    } else {
        System.out.print(number + " isn't palindrome");
      }
  }
  
  //Method returns a reversal of number
  public static int reverse(int number) {
    int reverse = 0;
    int digit;
 
    do {
      digit = number % 10;
      reverse = reverse * 10 + digit;
      number /= 10;
    } while (number != 0);
        return reverse;
  }
  
  //Returns true for a number that is palindrome
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
  }
}
 