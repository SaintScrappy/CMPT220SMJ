//file: bmitester.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 7
//Due April 27th
//version: 1.0

public class bmitester {
  public static void main (String[] args) {
	
    //Creates new BMI object and print BMI and Status.	
    BMI j = new BMI("Joseph", 19, 140, 5, 7);
    System.out.println(j.getName() + ": BMI is " + j.getBMI() + " " + j.getStatus());
	
  }
}