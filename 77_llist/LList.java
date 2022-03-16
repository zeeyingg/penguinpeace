/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW77 -- Insert|Remove
2022-03-15t
time spent : 1 hr
*/

/*
DISCO:
- We can make another LLNode that contains the part of the list that is modified
and use setNext() the list back together.
- Because we are using an alias to refer to the list, we don't need to account for
stuff before the index we wanted to remove because that is maintained in the _head
- In our remove() method, by switching the cargo from the removed value to the next value,
rather than shifting the rest of the elements, we are removing the desired link and
linking the previous node to the next node.

QCC:
- Is it possible to achieve O(1) with the new ADD and REM algorithms?
- What are the advantages and disadvantages of LinkedLists when compared to ArrayLists?

ALGO ADD:
- Create an alias for _head called tmp.
- If we want to add to beginning of list, we can just use our old add().
- Traverse to index that we want to add the newVal at in tmp.
- Create an LLNODE called restOfList that contains the current Node of tmp + the rest of the tmp's nodes.
- Set the current node to be newVal.
- Lastly, set the next node of tmp to be restOfList.

ALGO REM:
- Create an alias for _head called tmp.
- Traverse to the index of the node that we are trying to remove.
- Store that node.
- Replace current cargo with cargo of the next node
- Replace everything else after the current cargo with everything else after the next cargo.
- Return the node we removed.
*/


public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  // Adds at a specific index
  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }

   public void add( int index, String newVal)
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;

    if (_size == 0){ // special case if _size = 0
        add(newVal);
    }

    else {
      for (int i = 0; i < index; i++)
      {
        temp = temp.getNext();
      }

      // Creates another node and subsequent nodes after that
      LLNode restOfList = new LLNode(temp.getCargo(),temp.getNext());

      temp.setCargo(newVal);
      temp.setNext(restOfList);
    }
    _size++;
  }


  public String remove( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head;
    String rV;

    //Traverse to Node
    for( int i=0; i < index; i++ ){
      tmp = tmp.getNext();
    }
    //Store the Cargo we are removing
    rV = tmp.getCargo();

    //Set current cargo to be the cargo of the next node
    //Set the next node of the current cargo to be the second node after the current cargo
    tmp.setCargo(tmp.getNext().getCargo()); // replaces the cargo of the current node from the cargo of the next node
    tmp.setNext(tmp.getNext().getNext()); // replaces the rest of the current node with the rest of the next node
    _size--;
    return rV;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    // Testing add at index

    james.add(2, "i");
    System.out.println( james );

    // Testing remove at index

    james.remove(2);
    System.out.println( james );
  }

}//end class LList
