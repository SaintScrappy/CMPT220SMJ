import java.util.Scanner;

public class SuminDigits {
  public static void main (String [] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer: ");
  long n = input.nextLong();
 
  System.out.println("The sum is " + sumDigits(n));
  }
  //Methods belong outside main.
  public static int sumDigits(long n) {
    
	int sum = 0;
    do {
      sum += n % 10;
    } 
    while ((n = n / 10) != 0);
    return sum;
 }
}

