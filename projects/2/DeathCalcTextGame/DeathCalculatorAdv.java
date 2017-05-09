//file: DeathCalculator.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due At The End.
//version: 1.0

import java.util.Scanner;

public class DeathCalculatorAdv extends Player{
  public static void main (String [] args)throws Exception{
	
	Scanner input = new Scanner(System.in); 
	System.out.println("...");	
    System.out.println("Now entering DeathCalculator.exe.");
	
	Player user = new Player();
	user.chooseName();
	user.chooseWeap();
	user.choosePath();
  }
}