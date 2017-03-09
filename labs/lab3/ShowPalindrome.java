import java.util.Scanner;

public class ShowPalindrome {
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  int number = input.nextInt();
 
  if (isPalindrome(number)) {
   System.out.print(number + " is palindrome");
  } else {
   System.out.print(number + " isn't palindrome");
  }
}
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
 public static boolean isPalindrome(int number) {
  return (number == reverse(number));
 }
}
 