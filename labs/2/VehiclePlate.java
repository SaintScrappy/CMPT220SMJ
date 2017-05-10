//file: VehiclePlate.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 2
//Due February 9th
//version: 1.0

import java.util.Scanner;

public class VehiclePlate {
  public static void main(String[] args) {
   
	//Generates threee random uppercase letters
    char letter1 = (char) ((int)(Math.random()*26+65));
    char letter2 = (char) ((int)(Math.random()*26+65));
    char letter3 = (char) ((int)(Math.random()*26+65));
   
    //Generates four random digits
    int numbers =  (int)(Math.random()*10000);
    String sNumbers = String.format("%04d" ,numbers );
   
    //Displays the plate's number
    System.out.println("Vehicle Plate - " + letter1 + letter2 +letter3 + sNumbers);
  }
}