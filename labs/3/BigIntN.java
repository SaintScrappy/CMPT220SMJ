//file: BigIntN.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: lab 3
//Due February 23rd
//version: 1.0

public class BigIntN {
  public static void main(String[] args) {
   
    int n = 1;
	//Increments n while condition is true
    while (Math.pow(n, 3) <= 12000) {
      n++;
    }
	//For less then 12000
    n--;
	//Prints both n and n^3
    System.out.println("The n is " + n);
    System.out.println("The n^2 is " + Math.pow(n, 3));
  }
}