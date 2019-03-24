/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursion{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_recursion(){
	headReference = null;
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
	if (headReference == null)
	    return 0;
	else {
	    headReference = headReference.getReferenceToNextNode();
	    return 1 + size();
	}
	
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	String output = "elements [";
	if (headReference == null)
	    return output += "]";
	else {
	    headReference = headReference.getReferenceToNextNode();
	    return output + headReference.toString();
	}
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
}

