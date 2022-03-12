<<<<<<< HEAD
//Clyde Sinclair
//APCS pd0
//HW72 -- QuickSort
//2022-03-09w
//time spent: _h
=======
/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW73 - QuickSort Implementation
2022-03-09w
time spent : 0.8 hrs
*/

/**
DISCO
- The choosing of pivots affect the run time by a lot. If we choose the worst pivot everytime, we could end up with a run time of n^2.
- If we choose the best pivot everytime, we could end up with a runtime of nlogn, which is faster than n^2.
QCC
- Choosing what index for a pivot is better than choosing the median index of the list as pivot?
**/
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
<<<<<<< HEAD
 * QSort(arr):
 *
 * 2a. Worst pivot choice and associated run time:
 *
 * 2b. Best pivot choice and associated run time:
 *
 * 3. Approach to handling duplicate values in array:
=======
 * QSort(arr): calls quickSortHelper with lo being 0 and hi being arr.length - 1
 * quickSortHelper calls on itself recursively and splits the list into halves each time and runs partition on each halve until and up to the arrays are of length 2.
 * That is when we know all the elements in that array is sorted
 *
 *
 * 2a. Worst pivot choice and associated run time:
 * Worst choice is when we choose the extreme pivot each time.
 * runtime would be n^2 because we would have to run partition about n times since we chose the extreme each time.
 *
 * 2b. Best pivot choice and associated run time:
 * Best choice would be choosing the median of the list.
 * runtime would be nlog n because we only run partition around log n times.
 *
 * 3. Approach to handling duplicate values in array:
 * You could  move elements both --equal-- and less than the pivot to the left.
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
 *
 **/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
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
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
<<<<<<< HEAD

  }

  //you may need a helper method...


  
=======
    qSortHelper(d, 0, d.length - 1); // allows us to use parameters
  }


  public static void qSortHelper(int[] d, int loPos, int hiPos) {
    if (loPos < hiPos){

      int pivotIdx = Partition.partition(d, loPos, hiPos); // returns index of newly sorted pivot

      if (hiPos - loPos <= 1) { // if the subarray only contains 2 elements, then the array is sorted
        return;
      }
      else {
        qSortHelper(d, loPos, pivotIdx - 1); // run partition recursively on left side of initial pivot
        qSortHelper(d, pivotIdx + 1, hiPos); // run partition recursively on right side of initial pivot
      }

    }
  }



>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf


  //main method for testing
  public static void main( String[] args )
  {
<<<<<<< HEAD
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
=======

>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf

    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
<<<<<<< HEAD
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
=======
        /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf

    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
<<<<<<< HEAD
=======
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
