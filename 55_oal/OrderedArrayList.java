// 3LuckyDuckies: Ziying Jian, Gloria Lee, Nora Miller
// APCS
// HW55 -- Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 2 hrs

/*

 DISCO:
- Note that worst case vs. best case is not the same as changing the size. How good or bad a case is cannot depend solely on the
  size of that case; it must refer to variation within different cases of the same size.
- With indexed collections, it is typical to have a constant execution time of O(1) because you can easily jump to an index directly.

  QCC:
- (Just to confirm) In the defintion of big-O notation, the constant M for which f(x)<= Mg(x) cannot be negative? Are there
situations in which this actually comes up?
- (completely random but) how do dictionaries work, in terms of memory structure?


*/

/*
Execution time is O(n) because as the size of the arraylist increases, the execution time of the constructor increases linearly

Since there is no difference in how this method proceeds depending on the order of the contents of the array
or anything else besides size, there is no best or worst case.
*/

import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;


  // default constructor, initializes instance variables
  /*
  Execution time is O(1) because execution time is constant because the constructor simply makes a new ArrayList whenever invoked. There is no best or worst case
  */

  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  /*
  Execution time is O(n) because for every element of the arraylist, it takes x units of time to convert it to a String.
  There is no best or worst case because for an ArrayList of size n, the toString method systematically converts each element into a String
  without consideration of what that element is.
  */
  //pass-tru functionality
  public String toString()
  {
    return _data.toString();
  }

  /*
  Execution time is O(n) in the worst case, because after removing the first element, you must shift the entire array to the left,
  making one shift per element.
  So, worst case is removing the first element.
  Best Case: Removing the last element because are no more elements to the right that need to be shifted. Thus, the function takes
  a constant amount of time, so O(1)
  */
  //pass-tru functionality
  public Integer remove( int index )
  {
    return _data.remove(index);
  }


  /* Size() proceeds in the same way for all arrays of the same size, irrespective of their differences, so there is no best or
  worst case. In all cases, it should be O(1), because it is the same as the size() method on arraylists, which is O(1).
  */
  public int size()
  {
    return _data.size();
  }

  /*
  Execution time is O(1) because for indexed collections, you can directly jump to an index to get the element at that index.
  There is no best or worst case because there is no variation in the method between arrays of the same size.
  */
  //pass-tru functionality
  public Integer get( int index )
  {
    return _data.get(index);
  }


  //modified functionality
  //insert at appropriate location to maintain sortedness
  public boolean add( Integer newVal )
  {
    //call exactly 1 of the helper methods below...  your favorite?

    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }

  /*

  Best Case: Regardless of size, the best case will be adding the index at very beginning, which will involve only one
  comparison. Therefor, it is O(1).
  Worst Case: Execution time is O(n) because the number of comparisons being made linearly increases along with size.
  Overall execution time will be O(n)
  */
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }


  /*
  Best Case: O(1). The best case would be adding a value which is equal to the current array's middle value or the average of the two middle values rounded down.
  Execution time will therefore be constant across all array sizes.

  Worst Case: O(log n). One of several possible worst cases would be the two extreme values, which require the maximum number of
  comparisons and reassignments of lo, med, and hi. In this case, for every time that size increases by a factor of 2,
  execution time increases by k. Thus, execution time should be proportional to log_2 of size, so the function is O(log n)
  */
  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
    //Q: How do you know lo is correct insertion index?
  }


  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    // testing binary search
    franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( franz );

    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
