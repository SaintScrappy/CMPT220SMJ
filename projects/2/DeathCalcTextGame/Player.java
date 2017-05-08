import java.util.Scanner;

public class Player {
  private String name;
  private String weapon;
  private String freehand;
  private Scanner input;
  private int choice;
  public int DeathCalc;
  
  public Player() {
    input = new Scanner(System.in);
	this.DeathCalc = 0;
	this.choice = 0;
  }
  //Method called to ask user for their name and allow their input to == name attribute.
  public void chooseName(){
    System.out.println("What is your name?");
	this.name = this.input.nextLine();
	System.out.println("Ah..." + this.name + ". That's a nice name..");
  }
  public void chooseWeap(){
	  
	while(this.weapon == null){
	  System.out.println("The world can be a terrifying place when you are on the age of thirty.");
	  System.out.println("May I suggest you take protection? Under your pillow is a Toothpick, and on your night stand is the Bible.");
	  System.out.println("...Not many good options, but what will you take? Toothpick or Bible.");
      String weapon = input.nextLine();
	  if(weapon.equalsIgnoreCase("Toothpick")) {
	    System.out.println("Hm. Your life rests in your hand.");
		this.weapon = weapon;
	  }
	  else if(weapon.equalsIgnoreCase("Bible")) {
        System.out.println("");
		this.weapon = weapon;
	  }
	}
  }
  public void choosePath()throws Exception{
	  //track locations/path
	  
    while(this.choice == 0){
	  
	  System.out.println("");
	  System.out.println("There's the Kitchen, the Bathroom, the Attic, and the ChildsRoom");
	  System.out.println("Where will you go?");
	  int choice = input.nextInt();
	  
      if(this.choice == (1)){
		//Link to location objects.
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath();
	    this.choice = choice;
      }	
      else if(this.choice == (2)) {
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath();
	    this.choice = choice;	
	  }
	  else if(this.choice == (3)) {
		Attic attic = new Attic();
		attic.inAttic();
		//place holder 
		//System.out.println("You proceed to out of your room, and you unlatched the compartment");
		//System.out.println("to bring down the ladder to the attic. You climb up the stairs, and ");
		//System.out.println("realize that it is a little too dark.");
		//this.inAttic();
	    this.choice = choice;	
	  }
	  else if(this.choice == (4)) {
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath();
	    this.choice = choice;		
	  }
	}
  }
  
  //placeholder
  
  public void endGame(){
	if (DeathCalc >= 10){
	  System.out.println("The number on the calculator reads " + DeathCalc + ".");
      System.out.println("You have exceeded the Calculator's limit.");
      System.out.println("Ending Simulation...");	
	  System.out.println("...");
      System.exit(0);
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
 // public String getLocation() {
	//return location;
  //}
  //public void setLocation(String location) {
    //this.location = location;
  //}
  public String getfreeHand() {
	return freehand;
  }
  public void setfreeHand(String freehand) {
	this.freehand = freehand;
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