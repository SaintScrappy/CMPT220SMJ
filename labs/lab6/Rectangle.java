public class Rectangle {
	
  double width;
  double height;
  
  public Rectangle() {
    this.width = 1.0;
	this.height = 1.0;
  }
  public Rectangle2() {
	  
  }
  public double getArea() {
    return this.width * this.height;
  }
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
}