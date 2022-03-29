/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO:
    - pop and push run in constant time

    QCC:
    - How to read an arry full of 'null'?

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;
  private int maxSize;

  //constructor
  public Latkes( int initCapacity )
  {
    maxSize = initCapacity;
     _stack = new String[maxSize];
    _stackSize = -1;
  }// O(1) -- the first item in the stack would set size to 0


  //means of insertion
  public void push( String s )
  {
    _stackSize++;
    if (!isFull()){
      for (int i = _stackSize-1; i > -1; i--){
        _stack[i+1] = _stack[i]; // pushes all elements up
    }

  } else if (isFull()){
      String[] _retArr = new String[maxSize * 2];
      copy(_retArr, _stack);
      _stack = _retArr;
      for (int i = _stackSize-1; i > -1; i--){
        _stack[i+1] = _stack[i]; }
    }
    _stack[0] = s;
    System.out.println(this); // diag print statemnent
}// O(n) -- using a for loop


  //means of removal
  public String pop( )
  {
    // String[] _retArr = _stack;
    String removedItem = _stack[0];
    if (!isEmpty()) {
      for (int i = 1; i <_stackSize + 1; i++){
        _stack[i-1] = _stack[i];
      }
    _stack[_stackSize]= null;
    _stackSize--;
    System.out.println(this);
    return removedItem;
  } return null;
 }// O(?)

  public String[] copy(String[] copier, String[] copyOff){
    for (int i = 0; i < copyOff.length; i++){
      copier[i] = copyOff[i];
    } return copier;
  }

  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
  }// O(?)


  //chk for fullness
  public boolean isFull()
  {
    return (_stackSize == maxSize);
  }// O(?)


  public String toString(){
    String retVal = "{" + _stack[0];
    for (int i = 1; i < _stack.length; i++){
      retVal = retVal + "," +  _stack[i];
    }
    retVal = retVal + "}";
    return retVal;
  }

  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);
    // System.out.println( tastyStack.isFull() );

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
