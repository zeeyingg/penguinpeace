/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  public String cargo;
  public LLNode next;

  // constructor
  public LLNode( String value, LLNode next )
  {
    this.cargo = value;
    this.next = null;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return this.cargo;
  }

  public LLNode getNext()
  {
    return this.next;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    return this.cargo = newCargo;
  }

  public LLNode setNext( LLNode newNext )
  {
    return this.next = newNext;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    String s = "";
    s = "(" + this.cargo + " " + this.next + ")";
    return s;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );
    System.out.println( (first) + " ...should be (cat null)" );

    //Create a new node after the first
    first.setNext(new LLNode( "dog", null));
    System.out.println( (first) + " ...should be (cat (dog null))" );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );
    System.out.println( (first) + " ...should be (cat (dog (cow null)))" );
    

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?

    //...so better: ?
    //
    //
    //

  }//end main

}//end class LLNode

