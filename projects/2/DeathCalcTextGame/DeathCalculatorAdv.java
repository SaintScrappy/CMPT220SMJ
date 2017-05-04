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
    System.out.println("Hello. You are now in DeathCalculator.exe.");
	
	Player user = new Player();
	user.chooseName();
	
	System.out.println("The world can be a terrifying place when you are on the age of thirty.");
	System.out.println("May I suggest you take protection? Under your pillow is a Toothpick, and on your night stand is the Bible.");
	System.out.println("...Not many good options, but what will you take? Toothpick or Bible.");
	user.chooseWeap();
	
		//DeathCalculatorAdv game = new DeathCalculatorAdv();
	
	//Player variables
	//String myHand = "Death Calculator";
	//String userName;
	//int DeathCalc;
	//int CalcResets = 2;
	
	//Enemy variables
	//String[] enemies = {"Spouse", "Little Jimmy", "Your Mother", "Yazmin"};
	
	
  }
  public void Calculation() {
	  int DeathCalc = 0;
	  if (DeathCalc >= 10)
      System.exit(0);
      System.out.println("The number on the calculator reads " + DeathCalc + ".");  
    }
}