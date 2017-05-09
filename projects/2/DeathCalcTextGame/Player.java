import java.util.Scanner;

public class Player {
  private String name;
  private String weapon;
  private Scanner input;
  private String location;
  private String choice;
  public int DeathCalc;
  
  public Player() {
    input = new Scanner(System.in);
	this.DeathCalc = 0;
  }
  //Method called to ask user for their name and allow their input to == name attribute.
  public void chooseName(){
    System.out.println("What is your name?");
	this.name = this.input.nextLine();
	System.out.println("Ah..." + this.name + ". That's a nice name..");
  }
  //Methods sets the weapon string equal to user input of two objects.
  public void chooseWeap(){
	  
	while(this.weapon == null){
	  System.out.println("The world can be a terrifying place when you are on the age of thirty.");
	  System.out.println("May I suggest you take protection? Under your pillow is a Toothpick, and on your night stand is the Bible.");
	  System.out.println("...Not many good options, but what will you take? Toothpick or Bible.");
      String weapon = input.nextLine();
	  if(weapon.equalsIgnoreCase("Toothpick")) {
	    System.out.println("Hm. Your life rests in your hand.");
		this.weapon = "Toothpick";
	  }
	  else if(weapon.equalsIgnoreCase("Bible")) {
        System.out.println("");
		this.weapon = "Bible";
	  }
	}
  }
  public void choosePath()throws Exception{
	  
    while(this.location == null){
	  
	  System.out.println("");
	  System.out.println("There's the Kitchen, the Bathroom, the Attic, and the ChildsRoom");
	  System.out.println("Where will you go?");
	  String location = input.nextLine();
	  
      if(location.equalsIgnoreCase("Kitchen")){
		//Link to location objects.
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath();
	    this.location = location;
      }	
      else if(location.equalsIgnoreCase("Bathroom")) {
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath(); //NullPointerException
	    this.location = location;	
	  }
	  else if(location.equalsIgnoreCase("Attic")) {
		Attic attic = new Attic();
		attic.inAttic();
	    this.location = location;	
	  }
	  else if(location.equalsIgnoreCase("ChildsRoom")) {
		System.out.println("This area is closed for beta. Proceed to attic. (= ");
		this.choosePath();
	    this.location = location;		
	  }
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