//file: MultiDimens.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class MultiDimens {
  public static void main (String []args) {
	  
	System.out.print("Enter the rows and enter the columns: ");
    Scanner input = new Scanner(System.in);
	
	int s = input.nextInt();
    int j = input.nextInt();
	double[][] multilist = new double[s][j];
	
	System.out.print("Enter your array: ");
	for (int x = 0; x < s; x++) {
      for (int y = 0; y < j; y++) {
        multilist[x][y] = input.nextDouble();
	  }
	}
	
	int[] result = locateLargest(multilist);
	System.out.print("The largest element's location is ("+ result[0]+", "+result[1]+")");
  
  }
  public static int[] locateLargest(double[][] z) {
	double max = 0;
	int[] largestint = new int [2];
    for(int s=0; s < z.length; s++){
	  for (int s2 = 0; s2 < z[s].length; s2++) {
        if (z[s][s2] > max) {
          max = z[s][s2];
          largestint[0] = s;
          largestint[1] = s2;
        }
      }
    }
	return largestint;    
  }
}


// 1 3 4 3 2 4 2 4 
// 3 4 3 10 2 4 4 5

//Column 4, Row 2 (4, 2)