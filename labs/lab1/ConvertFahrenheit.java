import java.util.Scanner;

public class ConvertFahrenheit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double celsius, fahrenheit;
    System.out.print("Put in the Celsius Degrees.");
    celsius = sc.nextDouble();
    fahrenheit = 32+(celsius * 9/5);
    System.out.println(celsius +" C = " + fahrenheit + " F");
     }
}