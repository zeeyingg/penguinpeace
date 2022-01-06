// 3 Lucky Duckies: Nora Miller, Ziying Jian, Gloria Lee
// APCS pd8
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: 1 hr

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * Always starting from the first position, an element would be compared to the element before it.
 * If the element is less, it is swapped. This operation repeats until the element cannot be swapped
 * anymore, at which point the pass is incremented by 1.
 *
 *
 * DISCO:
 * To make things more efficient, in walkElement, you can break the loop once you have reached a point where
 * you aren't swapping anything. This is because once you start swapping consecutive elements to 'walk' an element into place,
 * you will only stop once it is in its place - when the element to its right is less
 * than it and the element to its right is greater than it. At this point, it is no longer necessary to make any subsequent
 * comparisons.
 *
 *
 * QCC: What is the best/worse case scenario for insertionSort?
 * Out of the three sort methods we've learned so far, which one is the most time efficient for different
 * cases? In what scenarios is it advantageous to use each sort?
 *
 *
 * q0: How many passes to sort n elements?
 * a0: size - 1 passes.
 * q1: What do you know after pass p?
 * a1: The first p+1 elements in the ArrayList will be sorted.
 * q2: How will you know when sorted?
 * a2: When every element has been incorporated into the sorted (index < pass) section of the ArrayList
 * q3: What constitues a pass?
 * a3: Considering an element of the unsorted paritioned part of the ArrayList, inserting it into the
 * correct position in the sorted partitioned part, and moving on to the next element of the unsorted part.
 * q4: What must you track?
 * a4: The index of partition between the sorted part of the array and unsorted.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }


  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }



//~~~~~~~~~~~~~~~~~~~ HELPER METHODS BEGIN ~~~~~~~~~~~~~~~~~~~

// swapping
public static void swap(ArrayList<Comparable> data, int i){ // here, swap means to swap stated index with the one below it
  Comparable tempStorage = data.get(i);
  data.set(i, data.get(i-1));  // resets what's in i
  data.set(i-1, tempStorage);  // resets whats in i-1
}

//   moving elements within each pass
public static void walkElement(ArrayList<Comparable> data, int index) {
 for (int i = index; i > 0; i--){
   Comparable a = data.get(i);
   Comparable b = data.get(i-1);
   if (b.compareTo(a) == 1){ // We are comparing consecutive elemnts. If the left element is greater than the right element, we need to swap
     swap(data, i);
   } else {
     break; // makes things more efficient - see DISCO
   }
 }
}

//~~~~~~~~~~~~~~~~~~~ HELPER METHODS END ~~~~~~~~~~~~~~~~~~~


public static void insertionSortV(ArrayList<Comparable> data){
  for ( int pass = 1; pass < data.size(); pass++ ){ // pass both the number of elements that are sorted so far,
                                                      // and the index of the element that is about to be walked to the correct place
      walkElement(data, pass);
      System.out.println("pass: " + pass); //diag
      System.out.println(data); //diag
  }
}


public static ArrayList<Comparable> insertionSort(ArrayList<Comparable> data){
  //declare and initialize empty ArrayList for copying
  ArrayList<Comparable> newData = new ArrayList<Comparable>();

  //copy input ArrayList into working ArrayList
  for( Comparable o : data )
    newData.add( o );

  //sort working ArrayList
  insertionSortV( newData );
  return newData;

}
  public static void main( String [] args )
   {
         /*===============for NON-VOID methods=============*/
       System.out.println("\n*** Testing sort-in-place (void) version... *** ");
       ArrayList glen = new ArrayList<Integer>();
       glen.add(7);
       glen.add(1);
       glen.add(5);
       glen.add(12);
       glen.add(3);
       System.out.println( "\nArrayList glen before sorting:\n" + glen );
       insertionSortV(glen);
       System.out.println( "\nArrayList glen after sorting:\n" + glen );

        /*===============for VOID methods=============*/
       ArrayList coco = populate( 10, 1, 1000 );
       System.out.println( "\nArrayList coco before sorting:\n" + coco );
       insertionSortV(coco);
       System.out.println( "\nArrayList coco after sorting:\n" + coco );


     /*==========for AL-returning methods==========*/
       System.out.println( "*** Testing non-void version... *** " );
       glen = new ArrayList<Integer>();
       glen.add(7);
       glen.add(1);
       glen.add(5);
       glen.add(12);
       glen.add(3);
       System.out.println( "\nArrayList glen before sorting:\n" + glen );
       ArrayList glenSorted = insertionSort( glen );
       System.out.println( "\nsorted version of ArrayList glen:\n"
       + glenSorted );
       System.out.println( "\nArrayList glen after sorting:\n" + glen );

       coco = populate( 10, 1, 1000 );
       System.out.println( "\nArrayList coco before sorting:\n" + coco );
       ArrayList cocoSorted = insertionSort( coco );
       System.out.println( "\nsorted version of ArrayList coco:\n"
       + cocoSorted );
       System.out.println( "\nArrayList coco after sorting:\n" + coco );
       System.out.println( coco );


   }//end main
}//end class
