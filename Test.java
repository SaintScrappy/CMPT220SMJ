import java.util.ArrayList;

public class Test extends A { 
  public static void main(String[] args) {
    String[] array = {"red", "green", "blue"};
ArrayList list = new ArrayList<>(Arrays.asList(array));
list.add(0, "red");
System.out.println(list);
  }
}
