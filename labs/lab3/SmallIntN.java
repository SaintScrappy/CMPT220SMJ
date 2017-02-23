public class SmallIntN {
  public static void main(String [] args) {
   
  int n = 1;
  while (Math.pow(n, 2)<=12000) {
   n++;
  }
  System.out.println("The n is " + n);
  System.out.println("The n^2 is " + Math.pow(n, 2));
  }
}