//file: VectConvolution.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Project 1
//Due March 30th
//version: 1.0

import java.util.Scanner;
import java.lang.Math;

public class VectConvolution {
  public static void main (String [] args) {
	  
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your array size: ");
	int n = input.nextInt();
    int[] Vector1  = new int[n];
	
	int k = 0;
	System.out.print("Enter the elements: ");
	for (k = 0; k < Vector1.length; k++) {
      Vector1[k] = input.nextInt();
    }
	
	System.out.print("Enter your second array size.");
	int j = input.nextInt();
    int[] Vector2 = new int[j];
	
	int i = 0;
	System.out.print("Enter the elements: ");
	for (i = 0; i < Vector1.length; i++) {
      Vector1[i] = input.nextInt();
    }
	double[]p = convolveVectors(Vector1, Vector2);
	  System.out.print(Math.round(p[i]));
	}
 public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
	 
   double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
   
   for(int idx = 0; idx < vResult.length; idx++) {
     for(int shift = 0; shift < vSecond.length; shift++){
       if(((idx-shift) >= 0) && (idx-shift < vFirst.length)) {
         vResult[idx] = sum(vFirst[idx - shift] * vSecond[shift]);
	   }
	 }
   }
   return vResult;  
  }
}