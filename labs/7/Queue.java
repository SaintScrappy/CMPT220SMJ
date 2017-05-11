//file: Queue.java
//author: Shawn M Joseph
//course: CMPT 220
//assignment: Lab 7
//Due April 27th
//version: 1.0

public class Queue {
	
  private int[] elements;
  private int size;
  private static final int DEFAULT_CAPACITY = 8;
  
  public Queue () {
	elements = new int[DEFAULT_CAPACITY];
  }
  
  public void enqueue(int v) {
  //adds v into the queue
    if(size >= elements.length){
	  int[] temp = new int[elements.length * 2];
	  System.arraycopy(elements, 0, temp, 0, elements.length);
	  elements = temp;
	}
	elements[size++] = v;
  }
  public int dequeue() {
  //removes return element from queue
    int v = elements[0];
    int[] temp = new int[elements.length];
    elements = temp;
    size--;
    return v;
  }
  public boolean empty () {
  //return true if queue is empty (loop)
    return size == 0;
  }
  
  //Setters & Getters
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