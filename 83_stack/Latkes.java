/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO

    QCC

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    String[] _stack = new String[initCapacity];
    _stackSize = -1;
  }// O(?) -- the first item in the stack would set size to 0


  //means of insertion
  public void push( String s )
  {
    _stackSize++;
    String[] _retArr = _stack;
    int index = 1;
  if (isFull() == false){
    for (int i = 0; i < _stackSize-1; i++){
      _retArr[index] = _stack[i];
      index++;
    }

    _retArr[0] = s;
  }
  }// O(?)


  //means of removal
  public String pop( )
  {
    int index = 1;
    String removedItem = _stack[0];
    String[] _retArr = _stack;
  if (!isEmpty()){
    for (int i = 0; i <_stackSize+1; i++){
      _retArr[i] = _stack[index];
      index++;
    }
    _stackSize--;
    return removedItem;
  } return "NULL";
  }// O(?)


  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == -1);
  }// O(?)


  //chk for fullness
  public boolean isFull()
  {
    return (_stack[_stackSize] != null);
  }// O(?)


  //main method for testing
  public static void main( String[] args )
  {


    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
