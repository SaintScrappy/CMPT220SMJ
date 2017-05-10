//file: Rectangle.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0

public class Rectangle {
	
  private double width;
  private double height;
  
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
  public double getWidth(){
    return this.width;
  }
  public void setWidth (double width){
    this.width = width;
  }
  public double getHeight(){
    return this.height;
  }
  public void setHeight (double height){
    this.height = height;
  }
}