import java.util.Scanner;

public class Attic {
	
  private Scanner input;
  private String choice;
  private String dark;
  private int DeathCalc;
	
  public Attic(){
	System.out.println("You make your way to the attic.");
    this.DeathCalc = 0;
  }
  public void inAttic(){
	while(this.choice == null){	
	  
	  System.out.println("");
	  System.out.println("1. Flick the light switch.");
	  System.out.println("2. Don't flick the light switch.");
	  String choice = input.nextLine(); //NullPointerException
	
	  if (choice == ("1")){
	    DeathCalc++;
        System.out.print("Testing1" + DeathCalc);
	    this.choice = choice;
	  }
	  else if(choice == ("2")){
	    DeathCalc = DeathCalc + 10;
	    System.out.println("Testing2" + DeathCalc);	
	    this.choice = choice;
	  }
    }
  }
  public void endGame(){
	if (DeathCalc >= 10){
	  System.out.println("The number on the calculator reads " + DeathCalc + ".");
      System.out.println("You have exceeded the Calculator's limit.");
      System.out.println("Ending Simulation...");	
	  System.out.println("...");
      System.exit(0);
	}
  }
  public String getChoice() {
	return choice;
  }
  public void setChoice(String choice) {
	this.choice = choice;
  }
  public int getDeathCalc() {
	return DeathCalc;
  }
  public void setDeathCalc(int DeathCalc) {
	this.DeathCalc = DeathCalc;
  }
}
