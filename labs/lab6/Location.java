//file: Location.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 6
//Due April 20th
//version: 1.0 

public class Location {
	
  private int row;
  private int column; 
  private double maxValue;
  
  public Location (int row, int column, double maxValue) {
    this.row = row;
	this.column = column;
	this.maxValue = maxValue;
  }
  public int getRow() {
    return this.row;
  }
  public void setRow(int row) {
    this.row = row;
  }
  public int getColumn() {
    return this.column;
  }
  public void setColumn(int column) {
    this.column = column;
  }
  public double getmaxValue() {
    return this.maxValue;
  }
  public void setmaxValue(double maxValue) {
    this.maxValue = maxValue;
  }
  //Gets largest element
  public static Location locateLargest(double[][]a) {
	int row = 0;
	int column = 0;
	double maxValue = a[row][column];
	
    for(int s = 0; s < a.length; s++){
	  for (int s2 = 0; s2 < a[s].length; s2++) {
        if (maxValue < a[s][s2]) {
          maxValue = a[s][s2];
          row = s;
          column = s2;
        }
      }
    }
	return new Location(row, column, maxValue);   
  }
}