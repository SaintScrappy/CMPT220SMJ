//file: VectConvolution.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 1
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class VectConvolution {
  public static void main (String [] args) {
	  
    Scanner input = new Scanner(System.in);
    int [] Vector1 = input.nextDouble();
	int [] Vector2 = input.nextDouble();
	
	}
 public static double[] convolveVectors(double[] Vector1, double[] Vector2) {
   double[] Result = new double[(vFirst.length + vSecond.length) - 1];
   
   for(int idx = 0; idx < vResult.length; idx++) {
     for(int shift = 0; shift < vSecond.length; shift++){
       if(((idx-shift) >= 0) && (idx-shift < vFirst.length))
         vResult[idx] = sum (vFirst[idx - shift] * vSecond[shift]);
	 }
   }
   return Result;  
  }
}