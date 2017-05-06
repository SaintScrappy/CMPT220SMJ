public class DeathCalculator {
	private int DeathCalc;
	//Linking hp bar?
	public DeathCalculator(){
	  this.DeathCalc = 0;
	}
	
  public void Calculation() {
	if (DeathCalc >= 10)
    System.exit(0);
    System.out.println("The number on the calculator reads " + DeathCalc + ".");  
  }
}