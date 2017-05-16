//file: SqLocate.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 7
//Due April 27th
//version: 1.0

import java.math.BigDecimal;

public class SqLocate {
  public static void main (String[] args){
    
    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
	long start = (long) Math.sqrt(Long.MAX_VALUE);
	BigDecimal s = new BigDecimal(start);
	int count = 0;
	
	//Find first ten square numbers while condition is true
	while(count < 10){
      BigDecimal squared = s.multiply(s);
	  if(squared.compareTo(longMaxValue) > 0){
	    count++;
	    System.out.println(count+": " + s + "^2 = " + squared);	
	  }
	  s = s.add(BigDecimal.ONE);
    }
  }
}