import java.util.ArrayList;

public class Sorts {

//~~~~~~~~~~~~~~~~~~~ HELPER METHODS BEGIN ~~~~~~~~~~~~~~~~~~~
// swapping
public void swap(ArrayList<Comparable> data, int i, int j){ // i and j are indexes
  Comparable tempStorage = data.get(i);
  data.set(i, data.get(j));  // resets what's in i
  data.set(j, tempStorage);  // resets whats in i-1
}

//   moving elements within each pass
public int[] walkElement(ArrayList<Comparable> data, int index) {
  int compareCounter = 0;
  int swapCounter = 0;
 for (int i = index; i > 0; i--){
  // System.out.println(" ---------> Compares so far: " +compareCounter);
   //System.out.println(data);
   Comparable a = data.get(i);
   Comparable b = data.get(i-1);
   compareCounter+=1;
   if (b.compareTo(a) == 1){ // We are comparing consecutive elemnts. If the left element is greater than the right element, we need to swap
     swap(data, i, i-1);
     swapCounter += 1;
     //System.out.println(" ---------> Swaps so far: " +swapCounter);

    //System.out.println( " ---------> after swap: " +  data );//diag
   } else { // makes things more efficient by avoiding extra swaps
     int[] counters = {compareCounter, swapCounter};
     return counters;
   }
 }
 int[] counters = {compareCounter, swapCounter};
 return counters;
}
//~~~~~~~~~~~~~~~~~~~ HELPER METHODS END ~~~~~~~~~~~~~~~~~~~

  public int[] insertionSortV(ArrayList<Comparable> data){
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;
    //System.out.println("\n\n\n (Insertion Sort)Initial values of swap, compare, pass: "+swapCounter+ " "+compareCounter+" "+passCounter);
    for ( int partition = 1; partition < data.size(); partition++ ){ // pass both the number of elements that are sorted so far,
                                                      // and the index of the element that is about to be walked to the correct place
      int[] returned = walkElement(data, partition);
      compareCounter+= returned[0];
      //System.out.println("Compares so far: "+compareCounter);
      swapCounter += returned[1];
    //  System.out.println("swaps so far: "+swapCounter);
      passCounter+=1;
      //System.out.println("Passes so far: "+passCounter);

    //  System.out.println("index of partition (pass number): " + partition); //diag
    //  System.out.println(data); //diag
    }
   int[] counters = {compareCounter, swapCounter, passCounter};
   return counters;
}


  public int[] selectionSortV( ArrayList<Comparable> data )
  {
     // position of the greatest value
    //note: this version places greatest value at "rightmost" end
    //maxPos will point to position of SELECTION (greatest value)
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;
    //System.out.println("\n\n\n (Selection Sort)Initial values of swap, compare, pass: "+swapCounter+ " "+compareCounter+" "+passCounter);
    for(int pass = data.size()-1; pass > 0; pass--) { // refers to the index that will be sorted
    //  System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      int maxPos = pass;

        for(int i = pass-1; i > -1; i--) {
          compareCounter += 1;
          //System.out.println("Compares so far: " +compareCounter);
        	if ( data.get(maxPos).compareTo(data.get(i))==-1 ){
        		maxPos = i;
        	}
        }
        //System.out.println( "maxPos: " + maxPos );// this for loop resets maxPos to the next value
      	//System.out.println( data );//diag
        // now, we need to swap the highest value with whatever's in the highest index

        swap(data, pass, maxPos);
        swapCounter+=1;
         //System.out.println("Swaps so far: " +swapCounter);

        //System.out.println( "after swap: " +  data );//diag
        passCounter += 1;
        //System.out.println("Passes so far: "+passCounter);

    }
    int[] counters = {compareCounter, swapCounter, passCounter};
    return counters;
  }//end selectionSort


  public int[] bubbleSortV( ArrayList<Comparable> data )
    {
    int passCounter = 0;
    int compareCounter = 0;
    int swapCounter = 0;
    //System.out.println("\n\n\n (Bubble Sort)Initial values of swap, compare, pass: "+swapCounter+ " "+compareCounter+" "+passCounter);

      for (int p = 0; p < data.size() - 1; p++) {
        passCounter+=1; // iterates through each pass
        //for each pass, reset counter to 0.
        //if counter still 0 at end of loop, break because the arraylist is sorted already bc no swaps required
        boolean sorted = true; //for now, we'll assume that the thing is sorted.
                               //Once we actually compare elements, if there is an element out of order, we need to actually sorted
                               // if not, we can just end the function
        for (int i = 0; i < data.size() - passCounter; i++) { // Because elements beyond passCounter are guaranteed to be
                                                              // in the correct place, we don't need to make comparisons beyond there
            if (data.get(i).compareTo( data.get(i+1) ) > 0) {
                swap(data, i, i+1);
                sorted = false;
                swapCounter+=1;

                //System.out.println("Swaps so far: " +swapCounter);

               //System.out.println( "after swap: " +  data );//diag
            } // end if
            compareCounter+=1;
            //System.out.println("Compares so far: "+compareCounter);
        } // end second loop
        if(sorted==true){

          //System.out.println("Passes so far: "+passCounter);
          int[] counters = {compareCounter, swapCounter, passCounter};
          return counters;
        }

        //System.out.println("Passes so far: "+passCounter);
      } // end first loop
      int[] counters = {compareCounter, swapCounter, passCounter};
      return counters;
    }

}
