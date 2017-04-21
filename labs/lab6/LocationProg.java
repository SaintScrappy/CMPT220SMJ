//file: LocationProg.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0 

import java.util.Scanner;

public class LocationProg {
  public static void main (String[] args) {
	  
    System.out.print("Enter the rows and enter the columns: ");
    Scanner input = new Scanner(System.in);
  
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] s = new double [row][column];
	
	System.out.print("Put in the array: ");
    for(int i = 0; i < s.length; i++){ 
      for(int k = 0; k < s[i].length; k++){ 
        s[i][k] = input.nextDouble();		
      } 
	}
	Location location = Location.locateLargest(s);
	System.out.println("The location of the largest element is: "
		+ location.maxValue + " at (" + location.row + ", " + location.column + ").");
  }
}
