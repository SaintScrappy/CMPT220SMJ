import java.util.Scanner;

public class SmallestElement {
  public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];
	System.out.print("Put in ten numbers:");
	
	int i = 0;
	numbers[i] = input.nextDouble();
	
	do {i++;} 
	  while (i < numbers.length);
		  
    System.out.println("The minimum number is: " + min(numbers));
  }
	
  public static double min(double[] array){
	  
    double min = array[0];
    
	for (int i = 1; i < array.length; i++) {
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;	
  }
}

	
	