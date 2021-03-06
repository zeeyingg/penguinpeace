/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW72 - implementing an algorithm to find the yth smallest element in a list
2022-03-08t
time spent : 1.2 hrs

ALGO
<<<<<<< HEAD
We run relativeSort with middle element of the list as its pivot. 
If this pivot's index is equal to the (yth smallest element on the list we are looking for) - 1, we return the pivot.
Else, since we know that the pivot is sorted, and that the elements to the left of the pivot is smaller than the pivot, 
if the pivot's index is smaller than the (yth smallest element on the list we are looking for) - 1, we call fastSelect() recursively
with the higher bound being the pivot's index.
if the pivot's index is greater than the (yth smallest element on the list we are looking for) - 1, we call fastSelect() recursively
with the lower bound being the pivot's index. 


BEST CASE SCENARIO
When the target is at the middle of the list. 

WORST CASE SCENARIO
When the target is not found.  

DISCO
When we return s in relativeSort(), we return the index of the pivot.  
=======
We run relativeSort with middle element of the list as its pivot.
If this pivot's index is equal to the (yth smallest element on the list we are looking for) - 1, we return the pivot.
Else, since we know that the pivot is sorted, and that the elements to the left of the pivot is smaller than the pivot,
if the pivot's index is smaller than the (yth smallest element on the list we are looking for) - 1, we call fastSelect() recursively
with the higher bound being the pivot's index.
if the pivot's index is greater than the (yth smallest element on the list we are looking for) - 1, we call fastSelect() recursively
with the lower bound being the pivot's index.


BEST CASE SCENARIO
When the target is at the middle of the list.

WORST CASE SCENARIO
When the target is not found.

DISCO
When we return s in relativeSort(), we return the index of the pivot.
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf

QCC
How will we use fastSelect() to sort the list?

Big Oh Notation of our Algorithm

<<<<<<< HEAD
O(nlogn) because we break the list into halves with each recursive call, which is O(logn) into fastSelect, 
=======
O(nlogn) because we break the list into halves with each recursive call, which is O(logn) into fastSelect,
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
and we use relativeSort, which is O(n). n * log n = nlogn
*/




public class FastSelect
<<<<<<< HEAD
{    
=======
{
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

<<<<<<< HEAD
  //print input array 
=======
  //print input array
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }
<<<<<<< HEAD
    
=======

>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int relativeSort(int[],int,int,int)
   * DESCRIPTION
   * Array is partitioned into two subarrays with a split(element of index splitter).
   * Elements to the left of split is less than split.
<<<<<<< HEAD
   * Elements to the right of split is greater than split. 
   * Split is adjusted to where it should be. 
=======
   * Elements to the right of split is greater than split.
   * Split is adjusted to where it should be.
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
   *
   *
   * @param arr
   * @param a -- lo -- The beginning index we use for partitioning
<<<<<<< HEAD
   * @param b -- hi -- The end index we use for partitioning 
   * @param c -- splitter -- The index of element that we compare the rest of the elements of the list to. 
   * @return int 
=======
   * @param b -- hi -- The end index we use for partitioning
   * @param c -- splitter -- The index of element that we compare the rest of the elements of the list to.
   * @return int
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
   *
   */
  public static int relativeSort( int[] arr, int lo, int hi, int splitter)
  {
    int split = arr[splitter];
<<<<<<< HEAD
    
    swap(splitter, hi, arr); // split is moved to the end
    
    int s = lo;
    
=======

    swap(splitter, hi, arr); // split is moved to the end

    int s = lo;

>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    for (int i = lo; i < hi; i++){
      if (arr[i] < split){ // compares elements of the list to split
        swap(s, i, arr);
        s += 1;
      }
    }
<<<<<<< HEAD
    
    swap(hi, s, arr); // split put back into place
    
    return s; // returns # of elements before splitIndex
  }//end relativeSort

  public static int fastSelect(int[] arr, int lo, int hi, int y) { 
=======

    swap(hi, s, arr); // split put back into place

    return s; // returns # of elements before splitIndex
  }//end relativeSort

  public static int fastSelect(int[] arr, int lo, int hi, int y) {
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf

    int splitterIndex = relativeSort(arr, lo, hi, (lo + hi) / 2 );

    if (splitterIndex == y - 1) {
<<<<<<< HEAD
      return arr[splitterIndex]; 
    } 
    else if (splitterIndex > y - 1) {
      return fastSelect(arr, lo, splitterIndex, y);
=======
      return arr[splitterIndex];
    }
    else if (splitterIndex > y - 1) {
      return fastSelect(arr, lo, splitterIndex, y);

>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    } else {
      return fastSelect(arr, splitterIndex, hi, y);
    }

  }


  //main method for testing
  public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {3,2,1,4,5};
    int[] arr3 = {33,28,1,4982,37};
    int[] arr4 = {5,4,17,9000,6};
<<<<<<< HEAD
    int[] arr5 = {5,4,3,2,1};

    // Best Case Scenario 
    // Splitter is on the target
    System.out.println(fastSelect(arr3, 0, 4, 1)); // smallest element in arr3
    System.out.println(fastSelect(arr1, 0, 4, 1)); // smallest element in arr1

    // Worst Case Scenario
    // Splitter is on opposite ends with the target
    System.out.println(fastSelect(arr5, 0, 4, 1)); // smallest element in arr5
=======
    int[] arr5 = {4,3,2,1};

    System.out.println("-----------------------");
    printArr(arr1);
    System.out.println(fastSelect(arr1, 0, 4, 1) + "...should be 1"); // smallest element in arr1
    System.out.println(fastSelect(arr1, 0, 4, 2) + "...should be 2");
    System.out.println(fastSelect(arr1, 0, 4, 3) + "...should be 3");
    System.out.println(fastSelect(arr1, 0, 4, 4) + "...should be 4");

    System.out.println("-----------------------");
    printArr(arr3);
    System.out.println(fastSelect(arr3, 0, 4, 1) + "...should be 1"); // smallest element in arr3
    System.out.println(fastSelect(arr3, 0, 4, 2) + "...should be 28");
    System.out.println(fastSelect(arr3, 0, 4, 3) + "...should be 33");
    System.out.println(fastSelect(arr3, 0, 4, 4) + "...should be 37");

    // System.out.println("-----------------------");
    // printArr(arr5);
    // System.out.println(fastSelect(arr5, 0, 3, 0) + "...should be 1"); // smallest element in arr5
    // System.out.println(fastSelect(arr5, 0, 3, 1) + "...should be 2");
    // System.out.println(fastSelect(arr5, 0, 3, 2) + "...should be 3");
    // System.out.println(fastSelect(arr5, 0, 3, 3) + "...should be 4");
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf


        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // run relativeSort on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr1: ");
    printArr(arr1);
    relativeSort(arr1,0,4,testC);
<<<<<<< HEAD
    System.out.println("after relativeSort w/ a=0,b=4,c=" 
=======
    System.out.println("after relativeSort w/ a=0,b=4,c="
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    + testC +"...");
    printArr(arr1);
    System.out.println("-----------------------");

    System.out.println("arr3:");
    printArr(arr3);
    relativeSort(arr3,0,4,testC);
<<<<<<< HEAD
    System.out.println("after relativeSort w/ a=0,b=4,c=" 
=======
    System.out.println("after relativeSort w/ a=0,b=4,c="
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    + testC +"...");
    printArr(arr3);
    System.out.println("-----------------------");

    System.out.println("arr4:");
    printArr(arr4);
    relativeSort(arr4,0,4,testC);
<<<<<<< HEAD
    System.out.println("after relativeSort w/ a=0,b=4,c=" 
=======
    System.out.println("after relativeSort w/ a=0,b=4,c="
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    + testC +"...");
    printArr(arr4);
    System.out.println("-----------------------");

    System.out.println("arr5:");
    printArr(arr5);
    relativeSort(arr5,0,4,testC);
<<<<<<< HEAD
    System.out.println("after relativeSort w/ a=0,b=4,c=" 
=======
    System.out.println("after relativeSort w/ a=0,b=4,c="
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    + testC +"...");
    printArr(arr5);
    System.out.println("-----------------------");
    }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Mysterion
