//file: Player.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 2
//Due May 11th.
//version: 1.0

import java.util.Scanner;

public class Player {
	
  private String name;
  private String weapon;
  private Scanner input;
  private String location;
  private String choice;
  private double income;
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
	  
	  //Weapon only becomes !null when input matches string
	  if(weapon.equalsIgnoreCase("Toothpick")) {
	    System.out.println("Hm. Your life rests in your hand.");
		//Sets weapon not equal to null.
		this.weapon = "Toothpick";
	  }
	  else if(weapon.equalsIgnoreCase("Bible")) {
        System.out.println("");
		//Sets weapon not equal to null.
		this.weapon = "Bible";
	  }
	}
  }
  public void choosePath()throws Exception{
	  
    while(this.location == null){
	  
	  System.out.println("You ");
	  System.out.println("There's the Kitchen, or the Attic?");
	  System.out.println("Where will you go?");
	  String location = input.nextLine();
	  
	  //Weapon only becomes !null when input matches string
      if(location.equalsIgnoreCase("Kitchen")){
		System.out.println("You venture out of your bedroom to see what horrors await.");
		System.out.println("As you slowly inch down the hallway a wretchet smell lingers into your nose.");
		System.out.println("You begin coughing and cursing to the demons that plague you until you realize,");
		System.out.println("It's your spouse's cooking.");
		//Sets location not equal to null.
	    this.location = "Kitchen";
      }	
	  else if(location.equalsIgnoreCase("Attic")) {
		System.out.println("");
		//Sets location not equal to null.
	    this.location = "Attic";	
	  }
	}
  }
  //Choice methods here (Kitchen)
  public void inKitchen(){
	System.out.print("You arrive in the kitchen and greet your spouse.");
	System.out.print("They start nagging you about the contributions that you haven't made in the past 3 years.");
	System.out.print("Wow. What a rocky relationship.");
	this.DeathCalc = DeathCalc + 2;
	endGame();
	System.out.print("Your spouse leaves the kitchen, and comes back 2 seconds later and throws down some form.");
	System.out.print("You peek at it, and your heart skips a beat.");
	doTaxes();
  }
  public void doTaxes()throws IllegalArgumentException{
	System.out.println("Your knees are weak, and your palms sweaty.");
	System.out.println("Lucky for you in the Beta, you get a freebie!");
	/*double income = input.nextDouble();
	if (income < 0) {
      throw new IllegalArgumentException(
        "Income can't be less than zero.");
    }
    this.income = income;
	getTax();*/

	System.out.println("Are you still there... Good. We all become victims of tax.");
	System.out.println("No need to be ashamed!");
	eatOrNot();
  }
  
  public void eatOrNot(){
	  
	System.out.println("Your spouse brings you a plate with... eggs and bacon?");
	System.out.println("I honestly don't know what it is... My God...Did the bacon just move?!?!");
	System.out.println("You have a long day ahead of you. And breakfast is the msot important meal of the day.");
	System.out.println("Will you eat?");
	System.out.println("1. Yes\n2. No");
	this.choice = input.nextLine();
	//Runs either statement based on user's input
	if (choice == "1") {
      System.out.print("You pick up the bacon, take a bite, and realize that it's not too bad.");
	  System.out.print("Sure. The presentation could use some work, but the meal hits the spot.");
	  this.choice = "1";
	}
	else if(choice == "2") {
	  System.out.println("That is a mistake.");
      System.out.println("Your spouse notices you haven'touched your plate and scolds you.");
	  this.DeathCalc = DeathCalc + 3;
	  this.choice = "2";
	}
	System.out.println("You made it through the morning, but you have a whole mediocre(or not) ahead of you.");
	System.out.println("You did good" + name + ".");
  }
  
  //Choice methods here (Attic)
  public void inAttic(){
	  
	System.out.println("It is dark. You switch on the flourescent light and sit down.");
	System.out.println("Your eyes begin watering and your hands begin trembling.");
	System.out.println(name + ". It has only just begun. Relax.");
	System.out.println("A mouse comes next to you. You and it lock eyes.");
	System.out.println("You decide to bring out your weapon.");
	
    //Checks for String in weapon.
	if(this.weapon == "Toothpick") {
	  System.out.println("You try to jab the mouse with your toothpick.");
	  System.out.println("It jukes your hand, and runs away.");
	  System.out.println("A few seconds later. It shows up with 2 other mice.");
	  System.out.println("They look at you for a second, then jump onto your face and start scratching.");
	  System.out.println("Haha. I feel bad.");
	  this.DeathCalc = DeathCalc + 5;
	  endGame();
	}
	else if (this.weapon == "Bible"){
	  System.out.println("You begin to read a scripture. Your eyes soften and your");
	  System.out.println("The Holy Spirit must have passed itself upon you. It's either");
	  System.out.println("that or the scripture is putting you to sleep...");
	  System.out.println("The mouse runs away. It comes back and puts cheese by you. Aww.");
	  this.DeathCalc = DeathCalc - 1;
	}
    suddenRealization();	
  }
  public void suddenRealization(){
	System.out.println("Maybe running away from your problems isn't a good idea.");
	System.out.println("Your day has just begun. You should just see it through. Don't you agree?");
	System.out.println("1. Yes\n2. No");
	this.choice = input.nextLine();
	//Search for corrent input. Increments DeathCalc until condition isn't true. 
	while (!choice.equals("1")) {
	  DeathCalc++;
	  System.out.println(name + ". You don't have much of a choice. It's my program, not yours.");
	  System.out.println("The number on the calculator reads " + DeathCalc + ".");
	  endGame();
	  suddenRealization();
	}
    this.inKitchen();
  }
  
  //Method to end DeathCalculator.jar by either lost or win / Misc Methods
  public void winGame() {
    System.out.println("Now exiting Beta DeathCalculator.jar...");
	System.out.println("Congrats. You won the beta.");
	System.out.println("Now get yourself a cup of Java, and get back to life.");
	//
	System.out.println("Your final count is: " + DeathCalc);
	System.out.println("Enter anything to exit program.");
	String choice = input.nextLine();
	//Game exits, but you are still a winner.
	System.exit(0);
  }
  public void endGame(){
	//if statement checks if DeathCalc var is at 10
	if (this.DeathCalc >= 10){
	  System.out.println("The number on the calculator reads " + DeathCalc + ".");
      System.out.println("You have exceeded the Calculator's limit.");
      System.out.println("Ending Simulation...");	
	  System.out.println("...");
	  //The game exits if the int of the Death Calculator reaches 10, or past 10
      System.exit(0);
	}
  }
  /*public void getTax() {
    if (income <= 50000) {
      income *= 0.01;
    } else if (income <= 75000) {
        income *= 0.02;
    } else if (income <= 100000) {
        income *= 0.03;
    } else if (income <= 250000) {
        income *= 0.04;
    } else if (income <= 500000) {
        income *= 0.05;
    } else
        income *= 0.06;
  }*/
  
  //Here lies all setters & getters.
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
   public double getIncome() {
	return income;
  }
  public void setIncome(double income) {
	this.income = income;
  }
}