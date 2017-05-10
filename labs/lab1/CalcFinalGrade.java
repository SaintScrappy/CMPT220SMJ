//file: CalcFinalGrade.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 1
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class CalcFinalGrade {
  public static void main(String[] args) {
	  
    double midterm;
    double finalExam;
    double project;	
	double hwlabs;
	
	Scanner input = new Scanner(System.in); 
	
    System.out.print("Put your four rubric percentages. Please put spaces. (:");
    
    //User inputs four ints representing grades for each variable
    midterm = input.nextDouble(); 
	finalExam = input.nextDouble(); 
	project = input.nextDouble(); 
	hwlabs = input.nextDouble(); 
	
	//Calculates final grade with sum of int inputs / 400 * 100
	double finalgrade = ((midterm + finalExam + project + hwlabs) / 400)*100; 
	
	//Print final grade as percentage
    System.out.println("Your finalgrade is "+ finalgrade+"%");
  }
}