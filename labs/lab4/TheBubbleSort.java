import java.util.Scanner;

public class TheBubbleSort{
  public static void main (String[] args) {
	  
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];
	System.out.print("Put in ten numbers:");
	
	for (int s = 0; s < speed.length; s++){
	  numbers [s] = input.nextDouble();
	}
	bubbleSort(numbers);
  }
  
  public static void bubbleSort(double[] list){
	  for (int s = 0; s < speed.length; s++){
	    for (int j = 0; j < speed.length-1; j++) {
	    if(speed[j]>speed[s+j])  
	      swap speed, j, s+j;
        }
      }
  }
}
	
	