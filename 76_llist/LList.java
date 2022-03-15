/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW76 - implementing LList
2022-03-14m
time spent : 0.8 hrs
*/

/*
DISCO
- We should check if the list already has an element while adding elements to the linked list. 
QCC
- How should we print the linked list?
*/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList()
  {
    _head = new LLNode(null, null);
    _size = size();
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode temp = _head;

    // If we dont have a cargo yet
    if (temp.getCargo() == null){
      temp.setCargo(newVal);
    }
    
    // If we already have a cargo
    else{
      for (int i = 1; i < size(); i++){
        temp = temp.getNext();
      }
      temp.setNext(new LLNode(newVal, null));
    }

    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
 
    // Create alias so we don't lose data
    LLNode temp = _head;
    
    // Traverse through Linked list
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }

    // Return the Cargo
    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    // Create alias so we don't lose data
    LLNode temp = _head;

    // Traverse through Linked List
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }

    // Sets cargo to newVal
    return temp.setCargo(newVal);
  }


  //return number of nodes in list
  public int size()
  {
    int i = 0;
    LLNode temp = _head;
    if( _head.getCargo() != null ) {
        i ++;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            i++; 
        }
    }
    return i; 
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String ans = "";
    LLNode temp = _head;
    for (int i = 0; i < size() && _head != null; i++){ 
      ans = temp.getCargo() + " " + ans;
      temp = temp.getNext();
    }
    return ans;
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
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
