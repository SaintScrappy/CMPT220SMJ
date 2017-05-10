//file: ConvertFahrenheit.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 1
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class ConvertFahrenheit {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
	
    double celsius, fahrenheit;
	
    System.out.print("Put in the Celsius Degrees.");
	//User inputs double representing Celsius
    celsius = sc.nextDouble();
	
    fahrenheit = 32 + (celsius * 9/5);
    System.out.println(celsius +" C = " + fahrenheit + " F");
  }
}