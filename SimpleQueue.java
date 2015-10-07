import java.util.Iterator;

public class SimpleQueue<Item> implements Iterable<Item> {
	
	private Object[] queue;
	
    public SimpleQueue(){
    
    	queue = new Object[0];
    	
    }// constructor creates an empty queue
    public void enqueue(Item item){
    	
    	Object[] temp = queue;
    	queue = new Object[queue.length+1];
    	for (int i = 0; i < temp.length; i++) {
    		queue[i] = temp[i];
    	}
    	queue[queue.length - 1] = item;
    	
    }
    public Item dequeue() {
    	
    	if (queue.length == 0)
    		throw new RuntimeException("Queue is empty");
    	
    	Object[] temp = queue;
    	Object first = queue[0];
    	queue = new Object[queue.length-1];
    	for (int i = 0; i < temp.length; i++) {
    		queue[i] = temp[i+1];
    	}    	
    	
    	return (Item)first;
    	
    }
    
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		for (int i = 0; i < queue.length; i++)
			return (Iterator<Item>) queue[i];
		return null;
	}
    	
}