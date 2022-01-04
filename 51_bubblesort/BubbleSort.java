// Clyde "Thluffy" Sinclair
// APCS pd0
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent:  hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Using two nested for loops, one to repeat the operation a certain number of passes and
 * one to traverse the array. We started the transversal from the front and compared the first
 * element with its adjacent element. If the adjacent element is less than the first element
 * then, a swap is conducted. If not, nothing changes and the loop moves onto the next index.
 * Once the entire array is tranversed, a pass is incremented.
 *
 * DISCO
 * We generally use size() instead of length() to refer to the no. of elements in an ArrayList
 * p - 1 < size() is different from p < size() -1
 *
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The list is sorted
 * q1: After pass p, what do you know?
 * a1: A change has occured
 * q2: How many passes are necessary to completely sort?
 * a2: The number of elements in the array minus one
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{


    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond:  lo < hi && size > 0
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
    public static void shuffle( ArrayList al )
    {
        int randomIndex;
        //setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    { for (int p = 0; p < data.size() - 1; p++) {
        for (int i = 0; i < data.size() - 1; i++) {
            Comparable a = data.get(i); //gets value at index i
            Comparable b = data.get(i + 1);
            if (a.compareTo(b) > 0) {
                data.set(i, b);
                data.set(i + 1, a);
            } // end if
        } // end second loop
    } // end first loop
    }


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
        //can't shallow copy, so copy manually
        ArrayList<Comparable> newInput = new ArrayList<Comparable>();
        for(int i = 0 ; i < input.size() ; i++){
            newInput.add(input.get(i));
        }
        bubbleSortV(newInput);
        return newInput;
    }


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
        bubbleSortV(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        bubbleSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );


        //==========for AL-returning methods==========
        glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        ArrayList glenSorted = bubbleSort( glen );
        System.out.println( "sorted version of ArrayList glen:\n"
                + glenSorted );
        System.out.println( "ArrayList glen after sorting:\n" + glen );
        coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        ArrayList cocoSorted = bubbleSort( coco );
        System.out.println( "sorted version of ArrayList coco:\n"
                + cocoSorted );
        System.out.println( "ArrayList coco after sorting:\n" + coco );
    }//end main

}//end class BubbleSort
