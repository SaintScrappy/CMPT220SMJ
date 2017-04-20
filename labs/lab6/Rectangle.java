//file: Rectangle.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due March 30th
//version: 1.0

public class Rectangle {
	
  public double width;
  public double height;
  
  public Rectangle() {
    this.width = 1.0;
	this.height = 1.0;
  }
  public Rectangle(double newWidth, double newHeight) {
    this.width = newWidth;
    this.height = newHeight;	
  }
  public double getArea() {
    return this.width * this.height;
  }
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
}