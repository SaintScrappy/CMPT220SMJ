//file: CalcFinalLetterGrade.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class CalcFinalLetterGrade {
  public static void main(String[] args) {
	  
    double midterm;
    double finalExam;
    double project;	
	double hwlabs;
	
	Scanner input = new Scanner(System.in); 
	
    System.out.print("Put your four rubric percentages. Please put spaces. (: ");
	//User inputs 4 double corresponding to received grades.
    
   
    midterm = input.nextDouble(); 
	finalExam = input.nextDouble(); 
	project = input.nextDouble(); 
	hwlabs = input.nextDouble(); 
	
	//Final grade calculated with sum of inputs / 400 * 100
	double finalgrade = ((midterm + finalExam + project + hwlabs) / 400)*100; 
	
	//Prints letter based on conditions met for final grade.
	if (finalgrade == 100.0 && finalgrade >= 95.0)
      System.out.print("A");
	  else if (finalgrade == 94.0 && finalgrade >= 90.0)
	    System.out.print("A-");
	  else if (finalgrade == 89.0 && finalgrade >= 87.0)
		System.out.print("B+");
	  else if (finalgrade == 86.0 && finalgrade >= 83.0)
	    System.out.print("B-"); 
	  else if (finalgrade == 82.0 && finalgrade >= 80.0)
	    System.out.print("C+"); 
	  else if (finalgrade == 79.0 && finalgrade >= 77.0)
	    System.out.print("C"); 
	  else if (finalgrade == 76.0 && finalgrade >= 73.0)
	    System.out.print("C-"); 
	  else if (finalgrade == 72.0 && finalgrade >= 70.0)
		System.out.print("D+"); 
	  else if (finalgrade == 69.0 && finalgrade >= 65.0)
		System.out.print("D"); 
	  else if (finalgrade == 64.0 && finalgrade >= 60.0)
		System.out.print("D-"); 
	  else if (finalgrade < 60.0)
		System.out.print("F, I don't think you should hang this one on the fridge."); 
  }
}