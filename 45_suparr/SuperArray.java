// Clyde "Thluffy" Sinclair
// APCS1 pd0
// HW44 -- expanding SuperArray functionality, encapsulation
// 2021-12-08
// Time Spent: 1.2 hr

/***
DISCO/Reminders to selves:
* _size = the number of elements that are visible to us
* _data.length() =  capacity
* expand() or expanding increses the length or capacity of the array (not t)
* (reading the textbook) One defining feature of abstract is that it cannot be
  instantiated. One possible way of thinking about it - an interface is sort of
  like the descriptions of our methods stated in the homework. While different
  teams' implementations will be different, they all should have the methods
  stated in the homework assignment.

QCC:
* toString method already hides values after _size that are deemed "unimportant"
* We changed the add to return void instead of boolean because the two return types were conflicting, but
  should we have changed both to return boolean instead?
* How do you test ListInt's methods and also ensure that we are not testing SuperArray's methods?
* How do we confirm that ListInt is functioning as intended?
* Possible answer: Since abstract methods have no body, the classes implementing them,
  like SuperArray, need to override them. Where else would the body of those
  functions be besides in SuperArray?
**/

/***************************
 * class SuperArray version 3.0
 * prevents the user from assigning values in a non-contiguous way
 * redefines size()
 * uses an interface
 ***************************/

public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  // note that capacity is not the same as size
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
      _size += 1;
      this._data[_size - 1] = newVal;
  }


  //inserts an item at index
  public void addAtIndex( int index, int newVal )
  {
    if(index < _size){
      this._size = this._size + 1; // expands the size of the array by 1
      for(int i = _size - 1; i > index; i -=1) {
        // starts indexing from the back of the array until it hits the element one after the desired index
        this._data[i] = this._data[i - 1]; // copy the element from the index below you
      }
    }
    // else{ _size = index;} // during the first iteration, the value of the last element is 0
    this._data[index] = newVal;

  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    for(int i = index; i <= this._size-2; i++) {
      // start at index; the last element you modify is the second to last element
      this._data[i] = this._data[i + 1]; // copy the element from the index below you
      }
    this._size = this._size - 1;
  }


  //return number of meaningful items in _data
  public int size()
  {
    return this._size;
    
    // int items = 0;
    // for(int i = 0; i < this._size; i++){
    //   if (this._data[i] != 0){
    //     items += 1;
    //   }
    // } return items;
    
  } // needs to be refactored if other data types are introduced


  //main method for testing
  public static void main( String[] args )
  {
      /* ~~~====== NEW ARRAY: curis ======~~~ */
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      /* ~~~====== TESTING SET ======~~~ */
      for( int i = 0; i < curtis._data.length; i++ ) { // loops until the last element
      curtis.set( i, i * 2 ); // sets value at index i to i multiplied by 2
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      /* ~~~====== TESTING EXPAND ======~~~ */
      for( int i = 0; i < 3; i++ ) { // loops 2 times
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }

      /* ~~~====== NEW ARRAY: mayfield ======~~~ */
      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);

      /* ~~~====== TESTING ADD ======~~~ */
      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);

      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield + "...expected [ 5 4 3 2 1 ]");
      System.out.println(mayfield._size);


      /* ~~~====== TESTING ADD-INSERT ======~~~ */
      mayfield.addAtIndex(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "....expected [ 5 4 3 2 99 1 ]");
      mayfield.addAtIndex(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "...expected [ 5 4 3 88 2 99 1 ]");
      mayfield.addAtIndex(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "...expected [ 5 4 77 3 88 2 99 1 ]");
      System.out.println(mayfield.size());

      // makes sure that you can't add elements
      mayfield.expand();
      mayfield.addAtIndex(12, 44); //
      System.out.println("Should stay the same:" + mayfield );
      System.out.println(mayfield.size());

      /* ~~~====== TESTING REMOVE ======~~~ */
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield + "...expected [ 5 4 77 88 2 99 1 ]");
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield + "...expected [ 5 4 77 2 99 1 ]");

      /* ~~~====== TESTING SIZE ======~~~ */
      System.out.println(mayfield._size + "...expected 6");
      System.out.println(mayfield.size() + "...expected 6");
      // this part is supposed to malfunction - users aren't supposed to add 0 values
      // to an array
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
