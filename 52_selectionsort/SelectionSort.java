// 3 Lucky Duckies: Gloria Lee, Nora Miller, Ziyinig Jian
// APCS pd8
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: 0.9 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO: Traverses through each index of the ArrayList in descending order. Swaps value at that index with the maximum value
 * in the ArrayList in range of index 0 to current index considered.
 *
 * DISCO: Instead of treating pass as the number of times we trasverse the array, we coded pass to be the current index considered.
 * We also realized while coding that the only purpose for the second for loop is to reset maxPos
 * The maxPos must be reset for each time we loop. This is to account for the narrowing of the range in which we can find the maximum value
 * each time. We should be finding the maximum in that range, not in the entire ArrayList, because it is more efficient

 * QCC: In what contexts would it be better to do selectionSort, versus bubbleSort considering that the worst case scenario
 * of each takes pretty much the same amount of time?

 * q0: How many passes to sort n elements?
 * a0: At most, n-1 passes

 * q1: What do you know after pass p?
 * a1: After pass p, it is guaranteed that the highest p elements of the array are each in their correct places

 * q2: How do you know if sorted?
 * a2: The array list is in ascending order or the first for loop comes to an end.

 * q3: What does a pass boil down to?
 * a3: A pass is essentially putting the nth greatest value in the nth position from the right of the array.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
     // position of the greatest value
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)


    for(int pass = data.size()-1; pass > 0; pass--) { // refers to the index that will be sorted
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      int maxPos = 0;

        for(int i = pass; i > -1; i--) {
        	if ( data.get(maxPos).compareTo(data.get(i))==-1 ){
        		maxPos = i;
        	}
        }
        System.out.println( "maxPos: " + maxPos );// this for loop resets maxPos to the next value

      	System.out.println( data );//diag
        // now, we need to swap the highest value with whatever's in the highest index

      	// Comparable a = data.get(i);
      	// Comparable b = data.get(maxPos);
      	// data.set(i, b);
      	// data.set(maxPos, a);
        Comparable tempMax = data.get(maxPos); // store the value at maxPos, to be copied over
        data.set(maxPos, data.get(pass)); // copy over the value from the highest index
        data.set(pass, tempMax);

        System.out.println( "after swap: " +  data );//diag
        //maxPos = 0;
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    //===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
    // ============================================

    //==========for AL-returning methods==========
      glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );

  //============================================

  }//end main

}//end class SelectionSort
