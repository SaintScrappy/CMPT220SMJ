import java.util.Scanner;

public class Attic {
	
  private Scanner input;
  private int choice;
  private String dark;
  public int DeathCalc;
	
  public Attic(){
	System.out.println("You make your way to the attic");
  }
  public void inAttic(){
	while(choice == 0){	
	  
	  System.out.println("");
	  System.out.println("1. Flick the light switch.");
	  System.out.println("2. Don't flick the light switch.");
	  int choice = input.nextInt();
	
	  if (choice == (1)){
	    DeathCalc++;
        System.out.print("Testing1" + DeathCalc);
	    this.choice = choice;
	  }
	  else if(choice == (2)){
	    DeathCalc = DeathCalc + 10;
	    System.out.println("Testing2" + DeathCalc);	
	    this.choice = choice;
	  }
    }
  }
  public int getChoice() {
	return choice;
  }
  public void setChoice(int choice) {
	this.choice = choice;
  }
  public int getDeathCalc() {
	return DeathCalc;
  }
  public void setDeathCalc(int DeathCalc) {
	this.DeathCalc = DeathCalc;
  }
}
