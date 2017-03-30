//file: MergeLists.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class MergeLists {
  public static void main (String[] args) {
	  
	System.out.print("Enter the first list: ");  
	Scanner input = new Scanner(System.in);  
	int[] list1 = new int[input.nextInt()];
	
	for (int i = 0; i < list1.length; i++) {
    list1[i] = input.nextInt();
    }
    
	
	System.out.print("Enter the second list: ");
	int[] list2 = new int[input.nextInt()];
	
	for (int i = 0; i < list2.length; i++) {
    list2[i] = input.nextInt();
    }
	int [] list3 = merge (list1, list2);
	System.out.print("The merged list: ");
	
	for (int i = 0; i < list3.length; i++) {
	  System.out.print(list3[i] + " ");	
	}
  }
  public static int[] merge(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];
    int s = 0, j = 0;
    for (int i = 0; i < list3.length; i++) {
      if (j < list2.length&&list1[s] > list2[j] ) {
      list3[i] = list2[j];
      j++;
      } else if (s < list1.length) {
      list3[i] = list1[s];
      s++;
      }
    }
	return list3;
  }
}