//file: FutTuition.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

import java.util.Scanner;

public class FutTuition {
  public static void main(String[] args){
  
    int feePerYear = 10000;
    int totalFee = 0;
 
    for(int i = 1; i <= 14; i++) {
	  //Increase tuition 5% for each year.
      feePerYear += feePerYear * .05;
      
	  //Check if ten years have past then prints fee
      if(i == 10) {
        System.out.println("The tuition fee in ten years is $"+ feePerYear);
      }
	  //Prints fee after ten years
      if(i > 10) {
        totalFee = totalFee + feePerYear;
      }
    }
    System.out.println("The total cost of 4 year tuition after ten years is $" + totalFee);
  }
}