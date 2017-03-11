//file: IntAverage.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

import java.util.Scanner;

public class IntAverage {
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
   
    //int n = input.nextInt();
	int [] userInput = new int [5];
	
	  for (int i = 0; i < userInput.length; i++)
    {
        System.out.println("Please enter number");
        userInput[i] = input.nextInt();
    }
	
    int countNeg = 0;
    int countPos = 0;
    float sum = 0;
    for (int j=0; j<userInput.length;j++)
	{
	if (userInput[j]>0){	
    do {
	countPos++;
    } while (j<userInput.length);
	}
	if(userInput[j]<0){
	do {countNeg++;}
	while(j<userInput.length);
	}
	}
      if (countPos + countNeg == 0) {
      System.out.println("No numbers are entered except 0");
      System.exit(0);
      }
   
   System.out.println("The positive number is " + countPos);
   System.out.println("The negative number is " + countNeg);
   System.out.println("The total is " + sum);
   System.out.println("The average is " + (sum/(countPos + countNeg)));
  }
}

