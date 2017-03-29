//file: SelectSort.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 5
//Due March 30th
//version: 1.0

public class SelectSort {
  public static void main (String[] args) {
	  
    double [] select = {10.0, 5.0, 6.0, 25.0, 7.0, 8.0, 9.0, 10.1};
  
  }
   public static void selectionSort(int[] list) {
  for (int i = list.length-1; i > 0; i--) {
   int currentMax = list[i];
   int currentMaxIndex = i;
 
   for (int j = 0; j < i; j++) {
    if (currentMax < list[j]) {
     currentMax = list[j];
     currentMaxIndex = j;
    }
   }
  }
 }
}