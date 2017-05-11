//file: TempConversion.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 4
//Due March 3rd
//version: 1.0

public class TempConversion {
  public static void main(String[] args) {
	 
    double celsius = 40;
    double fahrenheit = 104;
    double celsiusnext = 48.89;
    double fahreinheitnext = 120;
  
    //Creates temperature chart
    System.out.println ("Celsius\t\tFahreinheit\t|\tFahreinheit\tCelsius");
    System.out.println ("-----------------------------------------------------------------");
    System.out.printf("%.1f\t\t%.1f", celsius, fahrenheit);
    System.out.printf("\t\t|\t%.1f\t\t%.2f", fahreinheitnext, celsiusnext);
  
    double celsius1 = 39;
    double fahrenheit1 = 102.2;
    double celsiusnext1 = 43.33;
    double fahreinheitnext1 = 110;
    
	//Adds to character chart and inputs values within specified space.
    System.out.printf("\n%.1f\t\t%.1f", celsius1, fahrenheit1);
    System.out.printf("\t\t|\t%.1f\t\t%.2f", fahreinheitnext1, celsiusnext1);
  
    System.out.println("\n...");
  
    double celsius2 = 32;
    double fahrenheit2 = 89.6;
    double celsiusnext2 = 4.44;
    double fahreinheitnext2 = 40;
  
    System.out.printf("%.1f\t\t%.1f", celsius2, fahrenheit2);
    System.out.printf("\t\t|\t%.1f\t\t%.2f", fahreinheitnext2, celsiusnext2);
  
    double celsius3 = 31;
    double fahrenheit3 = 87.8;
    double celsiusnext3 = -1.11;
    double fahreinheitnext3 = 30;
  
    System.out.printf("\n%.1f\t\t%.1f", celsius3, fahrenheit3);
    System.out.printf("\t\t|\t%.1f\t\t%.2f", fahreinheitnext3, celsiusnext3);
  }
  
  //Computes celsius to fahreinheit conversion
  public static double celsiusToFahrenheit(double celsius) {
	double fahrenheit = (9.0 / 5) * celsius + 32;
	return fahrenheit;
  }
  
  //Computes fahreinheit to celsius conversion
  public static double fahrenheitToCelsius(double fahrenheit) {
	double celsius = (5.0 / 9) * (fahrenheit - 32);
	return celsius;
  }
}