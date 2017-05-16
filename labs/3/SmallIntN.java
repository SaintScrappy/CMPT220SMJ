//file: SmallIntN.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

public class SmallIntN {
  public static void main(String[] args) {
   
    int n = 1;
	//Increments n while condition is true
    while (Math.pow(n, 2)<=12000) {
      n++;
    }
	//Prints both n and n^2
    System.out.println("The n is " + n);
    System.out.println("The n^2 is " + Math.pow(n, 2));
  }
}