public class queuetester {
  public static void main(String[] args){
	  
  Queue myqueue = new Queue();
  //Adding 50 numbers into queue.
  for(int s = 1; s <= 50; s++){
	myqueue.enqueue(s);
  }
  //Removes the added numbers and shows them.
  while(!myqueue.empty()){
    System.out.print(myqueue.dequeue() + "");
  }
  System.out.println();
  }
}