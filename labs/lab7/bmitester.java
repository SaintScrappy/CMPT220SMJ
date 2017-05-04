public class bmitester {
  public static void main (String [] args) {
    BMI j = new BMI("Joseph", 19, 140, 5, 7);
    System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
    j.getName(), j.getAge(), j.getWeight(), j.getFeet(), j.getInches());
  }
}