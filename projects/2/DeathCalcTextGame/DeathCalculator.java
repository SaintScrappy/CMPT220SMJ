//file: DeathCalculator.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due At The End.
//version: 1.0

import java.util.Scanner;

public class DeathCalculator{
  public static void main (String [] args){
	  
	Scanner input = new Scanner (System.in);  
    System.out.println("You are now in DeathCalculator.exe.");
	System.out.println("Welcome. You will be participating in a simulation known as the Death Calculator.");
	System.out.println("**N/A");
	System.out.println("**N/A");
	
	String userName;
	System.out.println("What is your name?");
	userName = input.nextLine();
	System.out.println("Ah..." + userName + "That's a nice name..");
	
	String myHand = "No Item";
	String myHand2 = "Death Calculator";
	String myOtherHand = "Compass";
	
	System.out.println("You currently have" + myHand + "in your hand.");
	
	DeathCalculator game = new DeathCalculator();
	game.Calculation();
	
  }
  public void Calculation() {
	  int DeathCalc = 0;
	  if (DeathCalc >= 10)
      System.exit(0);
      System.out.println("The number on the calculator reads" + DeathCalc + ".");  
    }
}