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
    double[] Vector1 = new double[n];
	
	System.out.print("Enter your second array size.");
	int j = input.nextInt();
    double[] Vector2 = new double[j];
	
	int k = 0;
	System.out.print("Enter the elements: ");
	for (k = 0; k < Vector1.length; k++) {
      Vector1[k] = input.nextDouble();
    }
	
	int i = 0;
	System.out.print("Enter the elements: ");
	for (i = 0; i < Vector1.length; i++) {
      Vector2[i] = input.nextDouble();
    }
	double[] p = convolveVectors(Vector1, Vector2);
	//System.out.print(Math.round(p[i]));
	//for loop result vect p
	for (i = 0; i < p.length; i++) {
      System.out.print(Math.round(p[i]));
    }
  }
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
	 
   double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
   
   for(int idx = 0; idx < vResult.length; idx++) {
     for(int shift = 0; shift < vSecond.length; shift++){
       if(((idx-shift) >= 0) && (idx-shift < vFirst.length)) {
         vResult[idx] = (vFirst[idx - shift] * vSecond[shift]);
	   }
	 }
   }
   return vResult;  
  }
}