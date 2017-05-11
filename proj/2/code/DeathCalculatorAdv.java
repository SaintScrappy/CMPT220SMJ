//file: DeathCalculator.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due May 11th
//version: 1.0

/*The Death Calculator is a text-based adventure game that takes some advantage of Object-Oriented Programming 
in Java, along with conditional statements, method calls, exception handling, and etc. This file uses the Player
object to call methods that will progress the game. The major method used is endGame which is suppose to end 
the program if variable DeathCalc gets to 10 at the end of each method.*/

import java.util.Scanner;

public class DeathCalculatorAdv extends Player {
  public static void main(String[] args)throws Exception{
	
	Scanner input = new Scanner(System.in); 
	
	System.out.println("...");	
    System.out.println("Now entering Beta DeathCalculator.jar.");
	
	//Creates a new Player object 
	Player user = new Player();
	
	//Methods in Player class which contains parts of the game.
	user.chooseName();
	user.chooseWeap();
	user.choosePath();
	
	user.getLocation();
	
	//Based on condition executes a specific method from Player
	if(user.getLocation() == "Kitchen")
	  user.inKitchen();
    else if (user.getLocation() == "Attic")
	  user.inAttic();
  }
}