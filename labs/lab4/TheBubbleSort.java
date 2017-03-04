public class TheBubbleSort{
  public static void main (String[] args) {
    for (int s = 0; s < speed.length; s++){
	  for (int j = 0; j < speed.length-1; j++) {
	    if(speed[j]>speed[s+j])  
	      swap speed, j, s+j;
	  }
	}
	printArr(speed);
  }
}
	
	