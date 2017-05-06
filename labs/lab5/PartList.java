//file: PartList.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class PartList {
  public static void main (String[] args) {
	  
	Scanner input = new Scanner(System.in);  
	
    System.out.print("Enter your list: ");
	int[] list = new int[input.nextInt()];
	for (int i = 0; i < list.length; i++) {
      list[i] = input.nextInt();
    }
    partition (list);
	System.out.print("The partitioned list is: ");
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
  }
  //Method partitions(arranges elements in a way where the elements on the left are less and the right are greater)
  public static int partition(int[] list) {
    int partition = list[0];
    int partitionLocation = 0;
    int hi = list.length-1;
   
    while(partitionLocation < hi) {
    //Swapping partition and following item
    if(partition>list[partitionLocation+1]) {
      list[partitionLocation] = list[partitionLocation+1];
      list[partitionLocation+1] = partition;
      partitionLocation++;
	//Places item at end of list.
    } else {
        int temp = list[hi];
        list[hi]=list[partitionLocation+1];
        list[partitionLocation+1] = temp;
        hi--;  
      }
    }
  return partitionLocation;
  }
}