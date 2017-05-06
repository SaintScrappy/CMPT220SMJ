public class Queue {
	
  private int[] elements;
  private int size;
  private int capacity = 8;
  
  
  private Queue () {
    
  }
  public static enqueue(int v) {
  //adds v into the queue
    if(size >= elements.length){
	  int[] temp = new int[];
	}
  }
  public static dequeue() {
  //removes return element from queue
  }
  public static empty () {
  //return true if queue is empty (loop)
    return size == 0;
  }
  public int[] getElements() {
    return elements;
  }
  public void setElements(int[] elements){
    this.elements = elements;
  }
  public int getSize() {
	return size;
  }
  public void setSize() {
    this.size = size;
  }
}