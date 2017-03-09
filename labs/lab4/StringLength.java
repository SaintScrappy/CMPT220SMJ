import java.util.Scanner;

public class StringLength {
  public static void main (String[] args) {
	  
    Scanner input = new Scanner(System.in);
    System.out.print("Type out a string: ");
    String s = input.nextLine();
    
    
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
}