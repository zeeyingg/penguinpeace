// 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
// APCS pd8
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07 
// Time Spent: 0.5 hr

/*
DISCO:
  *(reminder to selves: When resetting a value to some newly initialized object,
   make sure to set the instance of the class to the new object! Otherwise, the existing
  object won't be printed out.)
  * You can change the value of an index by doing array[index] = newValue;
  * toString overwrites print method

QCC:
  * What other test cases need to be considered?
  * How can we store data types other than ints in this array using SuperArrays?
  * Why is there not a constructor in which you can initialize SuperArray with specific values?
 */

 /***************************
  * class SuperArray
  * Wrapper class for array. Facilitates resizing,
  * getting and setting element values.
  ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    this._size = 10;
    this._data = new int[_size];
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String str = "[ ";
    for(int i = 0; i < _data.length; i++){
      str += _data[i] + " ";
    }
    str += "]";
    return str;
  }


  //double capacity of SuperArray
  private void expand()
  {
    /*
    this._size = this._size * 2;
    int[] newData = new int[this._size];
    //this._data = new int[this._size]; // should _data be a new or existing array
    for(int i = 0; i < this._data.length; i++){
      newData[i] = this._data[i];
      */
    this._size = this._size * 2;
    System.out.println(this._size);
    int[] newData = new int[this._size];
    //this._data = new int[this._size]; // should _data be a new or existing array
    for(int i = 0; i < this._data.length; i++){
      newData[i] = this._data[i];
    }
    this._data = newData;
    System.out.println("new size: " + this._data.length);
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
    int old = this._data[index];
    this._data[index] = newVal; // replaces the element with a new value
    return old;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis ); // [ 0 0 0 0 0 0 0 0 0 0 ]

      for( int i = 0; i < curtis._data.length; i++ ) {
        curtis.set( i, i * 2 ); // [ 0 2 4 6 8 10 12 14 16 18 20 ]
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis); // [ 0 2 4 6 8 10 12 14 16 18 20 ]

      for( int i = 0; i < 3; i++ ) {
        curtis.expand();
        System.out.println("Printing expanded SuperArray curtis...");
        System.out.println(curtis); // should contain 80 items now
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()
}//end class
