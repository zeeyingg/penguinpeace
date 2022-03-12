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

//   //add node to list, containing input String as its data
//   public boolean add( String x ){
      /* IMPLEMENTATION */
//   }

//   //return data in element at position i
//   public String get( int i ){
       /* IMPLEMENTATION */
//   }

//   //overwrite data in element at position i
//   public String set( int i, String x ){
      /* IMPLEMENTATION */
//   }

  //return length of list
  public int size(){
      int size = 1; 
      LLNode current = this;
      while (this.next != null){
          current = this.next;
          size++;
      }
      return size;
  }

  public static void main(String[] args){
      
    //Create a node
    LLNode first = new LLNode( "cat", null );
    System.out.println( (first) + " ...should be (cat null)" );
    // System.out.println( "The size of the list is: " + first.size() + "...should be 1");

    //   Uncomment these once you've coded them
    //   System.out,println( first.get(0) );
    //   System.out.println( first.add("dog") );
    //   System.out.println( first.set(0, "cow") )

    //Create a new node after the first
    first.setNext(new LLNode( "dog", null));
    System.out.println( (first) + " ...should be (cat (dog null))" );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );
    System.out.println( (first) + " ...should be (cat (dog (cow null)))" );
    System.out.println( "The size of the list is: " + first.size() + "...should be 3");
    

    // //A naive list traversal, has side effects.... ??
    //    while( first != null ) {
    //    System.out.println( first );
    //    first = first.getNext();
    //    }

    //Q: when head ptr moves to next node in list, what happens to the node it just left?

    //...so better: ?
    //
    //
    //
  }//end main

}//end class LLNode

