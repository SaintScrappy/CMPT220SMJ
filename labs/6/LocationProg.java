//file: LocationProg.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0 

import java.util.Scanner;

public class LocationProg {
  public static void main (String[] args) {
	  
	Scanner input = new Scanner(System.in);
	  
    System.out.print("Enter the rows and enter the columns: ");
  
    int row = input.nextInt();
    int column = input.nextInt();
	//Creates a matrix from user input into two-dimensional array
    double[][] s = new double [row][column];
	
	System.out.print("Put in the array: ");
    for(int i = 0; i < s.length; i++){ 
      for(int k = 0; k < s[i].length; k++){ 
        s[i][k] = input.nextDouble();		
      } 
	}
	//Creates instance of location
	Location location = Location.locateLargest(s);
	//Prints location of largest element in array
	System.out.println("The location of the largest element is: "
		+ location.getmaxValue() + " at (" + location.getRow() + ", " + location.getColumn() + ").");
  }
}
