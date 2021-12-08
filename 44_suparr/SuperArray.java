// Clyde "Thluffy" Sinclair
// APCS1 pd0
// HW44 -- expanding SuperArray functionality, encapsulation
// 2021-12-08
// Time Spent: 1 hr

/***
DISCO:
* If there is a meaningful 0 in the array, it does not get counted in size().
* If we try to add in elements to the array when there is already ten elements in the array, we get an
index out of bounds exception error. Do we fix this by creating a new array entirely with a new size capacity?
* How do we avoid an index out of bounds exception error in the most efficient and cleanest way possible?

QCC:
* Are there not contexts in which 0 would be considered a meaningful value? What does meaningful mean anyway?
* Not really sure what size() is for, but one working theory:
Since the capacity of our SuperArrays (this._data.length) may be greater than the size,
it useful to find the number of 'meaningful' elements
* How do we account for cases where we try to add in elements which would exceed the array size?
**/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * inserting an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
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
  public void add( int index, int newVal )
  {
    this._size = this._size + 1; // expands the size of the array by 1
    for(int i = _size - 1; i > index; i -=1) {
      // starts indexing from the back of the array until it hits the element one after the desired index
      this._data[i] = this._data[i - 1]; // copy the element from the index below you
    } // during the first iteration, the value of the last element is 0
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
    int items = 0;
    for(int i = 0; i < this._size; i++){
      if (this._data[i] != 0){
        items += 1;
      }
    } return items;
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

      /* ~~~====== TESTING ADD-INSERT ======~~~ */
      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "....expected [ 5 4 3 2 99 1 ]");
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "...expected [ 5 4 3 88 2 99 1 ]");
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield + "...expected [ 5 4 77 3 88 2 99 1 ]");

      /* ~~~====== TESTING REMOVE ======~~~ */
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield + "...expected [ 5 4 77 88 2 99 1 ]");
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield + "...expected [ 5 4 77 2 99 1 ]");

      /* ~~~====== TESTING SIZE ======~~~ */
      System.out.println("Printing SuperArray mayfield size()");
      mayfield.add(0);
      mayfield.add(121);
      mayfield.add(0);
      mayfield.add(0);
      System.out.println(mayfield + "...expected [ 5 4 77 2 99 1 0 121 0 0 ]");
      System.out.println(mayfield._size + "...expected 10");
      System.out.println(mayfield.size() + "...expected 7");
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
