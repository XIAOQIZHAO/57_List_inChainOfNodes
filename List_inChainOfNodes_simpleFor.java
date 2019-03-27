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

    
    private Node getNode (int index){
	int counter;
	Node node;
	for (node = headReference, counter = 0;
	     node != null && counter < index;
	     node = node.getReferenceToNextNode(), counter++){}
	return node;
    }
    

    public Object get (int index){
	if (getNode(index) == null)
	    return null;
	return getNode(index).getCargoReference();
    }

    public Object set (int index, Object cargo){
	Node oldNode = getNode(index);
	Node newNode = new Node(cargo, oldNode.getReferenceToNextNode());
	if (index == 0)
	    headReference = newNode;
	else
	    getNode(index - 1).setReferenceToNextNode(newNode);
	return oldNode.getCargoReference();
	
	// Object oldCargo = get(index);
	// getNode(index).setCargoReference(index, cargo);
	// return oldCargo;
    }

    public boolean add (int index, Object cargo){
	if (index == 0)
	    return addAsHead(cargo);
	else {
	    // Node addedNode = new Node(null, null);
	    // getNode(size() - 1).setReferenceToNextNode(addedNode);
	    // for (int idx = index;
	    //      idx < size() + 1;
	    // 	 idx++){
	    // 	set(idx + 1, set(idx, getNode(index).getCargoReference()));
	    // }
	    
	    Node node = new Node(cargo, getNode(index));
	    getNode(index - 1).setReferenceToNextNode(node);
	    return true;
	}
    }

    public Object remove(int index){
        if (index == 0)
	    headReference = getNode(index).getReferenceToNextNode();
	else if (index == size() - 1)
	    getNode(index - 1).setReferenceToNextNode(null);
	else
	    getNode(index - 1).setReferenceToNextNode(getNode(index + 1));
	return getNode(index);
    }

    /*
    private Node setNode(int index, Node newNode){
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

*/

}
