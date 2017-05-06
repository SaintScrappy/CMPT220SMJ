//file: DeathCalculator.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due At The End.
//version: 1.0

import java.util.Scanner;

public class DeathCalculatorAdv{
  public static void main (String [] args)throws Exception{
	
	Scanner input = new Scanner(System.in); 
	System.out.println("...");	
    System.out.println("Now entering DeathCalculator.exe.");
	
	Player user = new Player();
	user.chooseName();
	user.chooseWeap();
	user.choosePath();
	//user.inAttic();
	user.endGame();
	//user.chooseName();
	
	System.out.println("");
	
	//Player variables
	//String myHand = "Death Calculator";
	//String userName;
	//int DeathCalc;
	//int CalcResets = 2;
	
	//Enemy variables
	//String[] enemies = {"Spouse", "Little Jimmy", "Your Mother", "Yazmin"};
	
	
  }
}