import java.util.Scanner;

public class TheLotto {
  public static void main (String [] args) {
  
  Scanner input = new Scanner(System.in);
  
  int lottery = (int) (Math.random() * 1000);
  System.out.print("Enter your lottery guess (three digits): ");
  int guess = input.nextInt();
 
  int lotteryDigit1 = lottery / 100;
  int lotteryDigit2 = (lottery % 100) / 10;
  int lotteryDigit3 = lottery % 10;
 
  int guessDigit1 = guess / 100;
  int guessDigit2 = (guess % 100) / 10;
  int guessDigit3 = guess % 10;
 
  System.out.println("The lottery number is " + lotteryDigit1
    + lotteryDigit2 + lotteryDigit3);
 
  // Check the guess
  if (guess == lottery)
   System.out.println("Exact match: you got Retirement");
  else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
    || (guessDigit1 == lotteryDigit2
      && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
    || (guessDigit1 == lotteryDigit3
      && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
    || (guessDigit1 == lotteryDigit3
      && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
    || (guessDigit1 == lotteryDigit1
      && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2))
   System.out.println("Match all digits: you got $3,000");
  else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
    || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
    || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
    || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
    || guessDigit3 == lotteryDigit3)
   System.out.println("Match one digit: you got $1,000");
  else
   System.out.println("No good.");
  }
}