public class Ctester{
  public static void main (String[] args) {
  C2 c2 = new C2();
  C3 c3 = new C3();

  c2 = (C2)((C1)c3);
  }
}