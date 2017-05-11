//file: BubSort.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 4
//Due March 3rd
//version: 1.0

import java.util.Scanner;

public class BubSort {
  public static void main(String[] args) {
	  
    Scanner input = new Scanner(System.in);
	
	//Create an array called number with a size of ten.
    double[] numbers = new double[10];
	System.out.print("Put in ten numbers:");
	
	//Make sure array doesn't exceed size
	for (int s = 0; s < numbers.length; s++){
	  numbers [s] = input.nextDouble();
	}
	
	//Calls method with numbers as argument
	bubbleSort(numbers);
	for (int s = 0; s < numbers.length; s++) {
	  System.out.println(numbers[s]);
  }
  }
  
  //Bubble sorts.
  public static void bubbleSort(double[] list){
    int j = list.length - 1;
    while (j != 0) {
      int s;
      for ( s = 0; s < j; s++) {
        if (list[s] > list[s + 1]) {
          double temp = list[s];
          list[s] = list[s + 1];
          list[s + 1] = temp;
       }
      }
    j = s-1;
    } 
 }
}
	
	