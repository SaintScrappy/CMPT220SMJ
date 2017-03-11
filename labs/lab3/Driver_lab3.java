//file: Driver_lab3.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

import java.util.Scanner;

public class Driver_lab3 {
  public static void main (String [] args) {
	  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
	
    double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double p = input.nextDouble();
	
	double res = 0.0;
	 
	 
	
	double pNorm = Math.pow((Math.pow((Math.abs(x1 - x2)),p)) + (Math.pow((Math.abs(y1 - y2)),p)),1/p);
	System.out.print(pNorm);
  }
}
	//    (   (x1-x2)^p    +    (y1-y2)^p  )^1.0/p