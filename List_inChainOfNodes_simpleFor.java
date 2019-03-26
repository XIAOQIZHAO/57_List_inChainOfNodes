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

    
    public Node getNode (int index){
	int counter = 0;
	for (Node node = headReference;
	     node != null;
	     node = node.getReferenceToNextNode()){
	    if (counter == index)
		return node;
	    else
		counter++;
	}
	return null;
    }

    public Object get (int index){
	if (getNode(index) != null)
	    return getNode(index).getCargoReference();
	return null;
    }

    public Node setNode(int index, Node newNode){
	Node saveForReturn = getNode(index);
	newNode.setReferenceToNextNode(saveForReturn.getReferenceToNextNode());
	for (Node node = headReference;
	     node != null;
	     node = node.getReferenceToNextNode()){
	    if (node.getReferenceToNextNode() == saveForReturn)
		node.setReferenceToNextNode(newNode);
	}
	return saveForReturn;
    }

    public Object set(int index, Object cargo){
	if (getNode(index) != null){
	    Node node = new Node(cargo, getNode(index).getReferenceToNextNode());
	    return setNode(index, node);
	}
	else
	    return null;
    }

    public Node add(int index, Node newNode){
	Node old = getNode(index);
	newNode.setReferenceToNextNode(old.getReferenceToNextNode());
	old.setReferenceToNextNode(newNode);
	return newNode;
    }

    public boolean add(int index, Object cargo){
	if (getNode(index) != null){
	    add(index, new Node(cargo, getNode(index).getReferenceToNextNode()));
	    return true;
	}
	return false;
    }

    public Object remove(int index){
	Node removedNode = getNode(index);
	for (Node node = headReference;
	     node != null;
	     node = node.getReferenceToNextNode()){
	    if (node.getReferenceToNextNode() == removedNode)
		node.setReferenceToNextNode(removedNode.getReferenceToNextNode());
	}
	return removedNode.getCargoReference();
    }
}
