//file: PentagonArea.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 1
//Due January 26th
//version: 1.0

import java.util.Scanner;

public class PentagonArea {
  public static void main (String[] args){
  
  Scanner input = new Scanner(System.in);
  System.out.print("Type in the length of the center to the vertex:");
 
  double r = input.nextDouble();
  double s = 2 * r * Math.sin(Math.PI / 5);
  double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
 
  area = Math.round(area*100) / 100.0;
  System.out.println("The pentagon's area is " + area);
 }
}