/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW76 - implementing LList
2022-03-14m
time spent : 0.8 hrs
*/

/*
DISCO
- We recursively contain a node in a node. 
QCC
- In what ways can we utilize linked lists so that it is more efficient than an array. 
*/

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  public String cargo;
  public LLNode nextN;

  // constructor
  public LLNode( String value, LLNode nextN )
  {
    this.cargo = value;
    this.nextN = null;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return this.cargo;
  }

  public LLNode getNext()
  {
    return this.nextN;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String prev = getCargo();
    this.cargo = newCargo; 
    return prev; 
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode prev = getNext();
    this.nextN = newNext;
    return prev; 
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    String s = "";
    s = "(" + this.cargo + " " + this.nextN + ")";
    return s;
  }

/* 
//add node to list, containing input String as its data
   public boolean add( String x ){
       // IMPLEMENTATION 
   }


  //return length of list
  public int size(){
      int size = 1; 
      LLNode currentList = this;
      while (this.next != null){
          currentList = this.next;
          size++;
      }
      return size;
  }
*/

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
    //  System.out.println( "The size of the list is: " + first.size() + "...should be 3");
    

    // //A naive list traversal, has side effects.... ??
    //    while( first != null ) {
    //    System.out.println( first );
    //    first = first.getNext();
    //    }

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: Original node is no longer assigned as first. 

    //...so better: ?
    String nextC = first.getCargo();
    LLNode nextN = first.getNext();
    System.out.println(nextC);
    
    while(nextN != null){
      nextC = nextN.getCargo();
      nextN = nextN.getNext();
      System.out.println(nextC);
    }
    //
    //
    //
  }//end main

}//end class LLNode

