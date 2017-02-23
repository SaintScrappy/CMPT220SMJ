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