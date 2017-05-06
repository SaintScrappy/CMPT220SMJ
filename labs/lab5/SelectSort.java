//file: SelectSort.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class SelectSort {
  public static void main (String[] args) {
	  
    Scanner input = new Scanner(System.in);  
	
    int[] select = new int[10];
	System.out.print("Put in ten numbers: ");
	
	for(int s = 0; s < select.length; s++) {
      select[s] = input.nextInt();
	}
	System.out.print("Here is the sorted list: ");
	  selectionSort(select);
	for(int s = 0; s < select.length; s++) {
      System.out.print(select[s] + " ");
	}
  }
   //Method sorts array in accendin order.
  public static void selectionSort(int[] list) {
    //Locates the max index in the list  
    for (int s = list.length-1; s > 0; s--) {
      int currentMax = list[s];
      int currentMaxIndex = s;
 
     for (int j = 0; j < s; j++) {
       if (currentMax < list[j]) {
       currentMax = list[j];
       currentMaxIndex = j;
       }
     }
	 //statement swaps list s with currentMax if needed
     if (currentMaxIndex != s) {
       list[currentMaxIndex] = list[s];
       list[s] = currentMax;
     }
    }
  }
}