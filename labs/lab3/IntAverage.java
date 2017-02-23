import java.util.Scanner;

public class IntAverage {
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter an integer, the input ends if it is 0: ");
   
   int n, countNeg = 0, countPos = 0;
   float sum = 0;
  
   while ((n = input.nextInt()) != 0) {
     sum = sum + n; 
	 
     do 
     {countPos++;}
     while(n > 0);
	 
     do 
	 {countNeg++;}
     while (n < 0);
   }
 
   {
   do {
   System.out.println("No numbers are entered except 0");
   System.exit(0);
   }
   while (countPos + countNeg == 0);
   }
   System.out.println("The positive number is " + countPos);
   System.out.println("The negative number is " + countNeg);
   System.out.println("The total is " + sum);
   System.out.println("The average is " + (sum/(countPos + countNeg)));
  }
}