//file: FinanceMgmt.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 1
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class FinanceMgmt {
  public static void main(String[] args) {
    double subtotal;
	double gratuityrate;
	double gratuity; 
	double total;
    System.out.print("Put your subtotal and gratuity rate. Please space between your numbers. (:");
    Scanner input=new Scanner(System.in); 
    subtotal = input.nextDouble(); 
    gratuityrate = input.nextDouble(); 
	
	gratuity= (gratuityrate/100) * subtotal;
	total = gratuity+subtotal;
	
    
    System.out.println( "The subtotal is "+ subtotal+ " and the gratuity rate is "+gratuityrate+" The gratuity is "+gratuity+" the total is "+total);
  }
}