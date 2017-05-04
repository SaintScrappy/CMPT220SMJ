import java.util.Scanner;

public class Player {
  private String name;
  private String weapon;
  private String location;
  private String freehand;
  private Scanner input;
  
  public Player() {
    input = new Scanner(System.in);
  }
  public void chooseName(){
    System.out.println("What is your name?");
	this.name = this.input.nextLine();
	System.out.println("Ah..." + this.name + ". That's a nice name..");
  }
  public void chooseWeap()throws Exception{
    this.weapon = this.input.nextLine();
	
	if(this.weapon.equalsIgnoreCase("Toothpick")) {
	  System.out.println("Hm. Your life rests in your hand.");
	}
	else if(this.weapon.equalsIgnoreCase("Bible")) {
      System.out.println("");
	}
	else {
	  System.out.println("I don't think that choice is right.");
      throw new Exception("???");
	}
  }
  
  public String getName() {
	return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getWeapon() {
    return weapon;
  }
  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }
  public String getLocation() {
	return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public String getfreeHand() {
	return freehand;
  }
  public void setfreeHand(String freehand) {
	this.freehand = freehand;
  }
}