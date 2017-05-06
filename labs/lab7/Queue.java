public class Queue {
	
  private int[] elements;
  private int size;
  private int capacity = 8;
  
  
  public Queue () {
    
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