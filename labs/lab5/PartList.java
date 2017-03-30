//file: PartList.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

import java.util.Scanner;

public class PartList {
  public static void main (String [] args) {
	  
    Scanner input = new Scanner(System.in);
	int[] list = new int[input.nextInt()];
  
  }
  public static int partition(int[] list) {
    int partition = list[0];
    int partitionLocation = 0;
    int hi = list.length-1;
   
    while(partitionLocation < hi) {
    
    if(partition>list[partitionLocation+1]) {
      list[partitionLocation] = list[partitionLocation+1];
      list[partitionLocation+1] = partition;
      partitionLocation++;
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