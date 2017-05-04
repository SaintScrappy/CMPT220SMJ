//file: DeathCalculator.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due At The End.
//version: 1.0

import java.util.Scanner;

public class DeathCalculator{
  public static void main (String [] args){
	  
	DeathCalculator game = new DeathCalculator();
	
	//Player variables
	String myHand = "Death Calculator";
	String userName;
	int DeathCalc;
	int CalcResets = 2;
	
	//Enemy variables
	String[] enemies = {"Spouse", "Little Jimmy", "Your Mother", "Yazmin"};
	
	Scanner input = new Scanner (System.in);  
    System.out.println("You are now in DeathCalculator.exe.");
	System.out.println("Welcome. You will be participating in a simulation known as the Death Calculator.");
	System.out.println("**N/A");
	System.out.println("**N/A");
	
	System.out.println("What is your name?");
	userName = input.nextLine();
	System.out.println("Ah..." + userName + ". That's a nice name..");
	
	System.out.println("Good Morning " + userName +". It is quite a wonderful day outside");
	System.out.println("You currently have " + myHand + " in your hand.");
	
	game.Calculation();
	
	
  }
  public void Calculation() {
	  int DeathCalc = 0;
	  if (DeathCalc >= 10)
      System.exit(0);
      System.out.println("The number on the calculator reads " + DeathCalc + ".");  
    }
}