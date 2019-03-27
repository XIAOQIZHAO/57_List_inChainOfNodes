/**
 Test list features.
 */
public class UserOfList_simpleFor {
    public static void main( String[] args ) {
        List_inChainOfNodes_simpleFor list = new List_inChainOfNodes_simpleFor();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

	System.out.println( "get element 0: " + list.get(0)
                          + System.lineSeparator());
	System.out.println( "get element 2: " + list.get(2)
                          + System.lineSeparator());
	System.out.println( "get element 3: " + list.get(3)
                          + System.lineSeparator());
	System.out.println( "get element 10: " + list.get(10)
                          + System.lineSeparator());

	System.out.println( list.set(0, "KLDSJFL"));
	System.out.println( "set element 0 to KLDSJFL: " + list
                          + System.lineSeparator());
	System.out.println( list.set(2, "KLDSJFL"));
	System.out.println( "set element 2 to KLDSJFL: " + list
                          + System.lineSeparator());
	System.out.println( list.set(3, "KLDSJFL"));
	System.out.println( "set element 3 to KLDSJFL: " + list
                          + System.lineSeparator());

	list.add(0, "ADDED TO ELEMENT0");
	System.out.println( "add to element0: " + list
                          + System.lineSeparator());
	list.add(3, "ADDED TO ELEMENT3");
	System.out.println( "add to element3: " + list
                          + System.lineSeparator());
	list.add(5, "ADDED TO ELEMENT5");
	System.out.println( "add to element5: " + list
                          + System.lineSeparator());
	

	list.remove(0);
	System.out.println( "remove element0: " + list
                          + System.lineSeparator());
	list.remove(1);
	System.out.println( "remove element1: " + list
                          + System.lineSeparator());
	list.remove(3);
	System.out.println( "remove element3: " + list
                          + System.lineSeparator());
    }
}
