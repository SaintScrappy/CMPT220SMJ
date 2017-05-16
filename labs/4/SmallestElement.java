//file: SmallestElement.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 4
//Due March 3rd
//version: 1.0

import java.util.Scanner;

public class SmallestElement {
  public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
	
	//Creates an array called numbers with size of 10
    double[] numbers = new double[10];
	System.out.print("Put in ten numbers:");
	
	//Catches array to not exceed size
	for (int i = 0; i < numbers.length; i++) {
     numbers[i] = input.nextDouble();
	}	  
    System.out.println("The minimum number is: " + min(numbers));
  }
  
  //Method returns smallest element in array.
  public static double min(double[] array){
	double min = array[0];
    
	for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;	
  }
}

	
	