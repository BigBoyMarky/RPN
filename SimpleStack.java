public class SimpleStack<Item> {
	private Object[] objects;
    public SimpleStack(){
    	objects = new Object[0];
    	
    }           //Construct empty stack
    public int size(){
    	return objects.length;
    }              //Return the number of items in the stack.
    public void push(Item item){

    	Object[] temp = objects;
    	objects = new Object[size()+1];
    	for (int i = 0; i < temp.length; i++) {
    		objects[i] = temp[i];
    	}
    	objects[size() - 1] = item;

    }    //Add the item to the stack.
    public Item pop(){
    
    	if (size() == 0)
    		throw new RuntimeException("Stack is empty");
    	
    	Object[] temp = objects;
    	Object last = objects[size() - 1];
    	objects = new Object[size() - 1];
    	for (int i = 0; i < size(); i++) {
    		objects[i] = temp[i];
    	}
    	return (Item)last;
    }              //Delete and return the item most recently added to the stack..
}