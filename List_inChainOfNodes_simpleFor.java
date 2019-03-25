/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_simpleFor{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_simpleFor(){
	headReference = null;
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
	int counter = 0;
	for (Node node = headReference; node != null; node = node.getReferenceToNextNode())
	    counter++;
	return counter;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	String output = "elements [";
	for (Node node = headReference;
	     node != null;
	     node = node.getReferenceToNextNode())
	    output += node.getCargoReference() + ",";
	return output += "]";
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 Node head = new Node(val, headReference);
	 headReference = head;
	 return true;
     }

	public Object get (int index){
		int counter = 0;
		for (Node node = headReference;
	     node != null;
	     node = node.getReferenceToNextNode()){
			if (counter == index)
				return node.getCargoReference();
			else
				counter++;
		}
		return null;
	}

	public Object set(int index, Node newNode){
		Object saveForReturn = get(index);
		
	}
}
