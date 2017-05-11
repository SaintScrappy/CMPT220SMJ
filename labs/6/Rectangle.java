//file: Rectangle.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0

/*   Rectangle       */
/*   width: double   */
/*   height: double  */
/*   Rectangle()     */
/*   Rectangle(newWidth: double, newHeight: double)   */
/*   getArea(): double  */
/*   getPerimeter(): double  */

public class Rectangle {
	
  private double width;
  private double height;
  
  //Default constructor; creates default rectangle
  public Rectangle() {
    this.width = 1.0;
	this.height = 1.0;
  }
  //Creates rectangle with specified width and height
  public Rectangle(double newWidth, double newHeight) {
    this.width = newWidth;
    this.height = newHeight;	
  }
  //Method computes area
  public double getArea() {
    return this.width * this.height;
  }
  //Method computes perimeter
  public double getPerimeter() {
    return this.width * 2 + this.height * 2;
  }
  
  //Setters and getters
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