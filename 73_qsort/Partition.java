<<<<<<< HEAD
// Clyde Sinclair
// APCS pd0
// HW71 -- Reading for intent, tracing for VICTORY
// 2022-03-07m
// time spent:  hrs

/***
 * class Parition (née Mysterion)
 * 
 * <h1>MYSTERION is PARTITION</h1>
 * The Mysterion method ... <YOUR TRIO'S DESCRIPTION HERE> 
=======
/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW73 - QuickSort Implementation
2022-03-09w
time spent : 1 hrs
*/

/***
 * class Parition (née Mysterion)
 *
 * <h1>MYSTERION is PARTITION</h1>
 * The Mysterion method ... <YOUR TRIO'S DESCRIPTION HERE>
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
 * <p>
 * <b>Note:</b> BLAH blah blah, yakkety schmakketty...
 * @author  Trey Parker, Matt Stone
 * @version 3.1415926535897932384626433
<<<<<<< HEAD
 * @since   2022-03-08t 
=======
 * @since   2022-03-08t
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
 *
 * algo as pseudocode:
 * ------------------------------
 *     v = arr[c]
<<<<<<< HEAD
 *     swap arr[c], arr[b]  
=======
 *     swap arr[c], arr[b]
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
 *     s = a
 *     for i in [a..b-1]
 *         if arr[i] < v
 *             swap arr[s], arr[i]
 *             s+=1
<<<<<<< HEAD
 *     swap arr[b], arr[s] 
=======
 *     swap arr[b], arr[s]
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
 **/


public class Partition
{
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
   * int partition(int[],int,int,int)
   * DESCRIP
<<<<<<< HEAD
   * 
   * @param arr input array of ints
   * @param loPos   
   * @param hiPos
   * @param pvtPos
   * @return int position of 
   *
   */
  public static int partition( int arr[], int loPos, int hiPos, int pvtPos)
  {
    int v = arr[pvtPos];

    swap( pvtPos, hiPos, arr);
    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,hiPos,arr);

    return s;
  }//end partition


  //main method for testing
  public static void main( String[] args )
  {

    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};


    // run partition on each array,
    // holding loPos & hiPos fixed, varying pvtPos...
    for( int testPIVOT = 0; testPIVOT < 5; testPIVOT++ ) {
      System.out.println("arr1: ");
      printArr(arr1);
      partition(arr1,0,4,testPIVOT);
      System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos=" 
                         + testPIVOT +"...");
      printArr(arr1);
      System.out.println("-----------------------");

      System.out.println("arr3:");
      printArr(arr3);
      partition(arr3,0,4,testPIVOT);
      System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos=" 
                         + testPIVOT +"...");
      printArr(arr3);
      System.out.println("-----------------------");

      System.out.println("arr4:");
      printArr(arr4);
      partition(arr4,0,4,testPIVOT);
      System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos=" 
                         + testPIVOT +"...");
      printArr(arr4);
      System.out.println("-----------------------");

      System.out.println("arr5:");
      printArr(arr5);
      partition(arr5,0,4,testPIVOT);
      System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos=" 
                         + testPIVOT +"...");
      printArr(arr5);
      System.out.println("-----------------------");
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
  }//end main

}//end class Partition
  
=======
   *
   * @param arr input array of ints
   * @param loPos
   * @param hiPos
   * @param pvtPos
   * @return int position of
   *
   */
   public static int partition( int arr[], int loPos, int hiPos)
 {
   int pvtPos = (hiPos + loPos) / 2;
   int v = arr[pvtPos];

   swap( pvtPos, hiPos, arr);
   int s = loPos;

   for( int i = loPos; i < hiPos; i++ ) {
     if ( arr[i] <= v) {
       swap( i, s, arr );
       s++;}
   }
   swap(s,hiPos,arr);

   return s;
 }//end partition


  // //main method for testing
  // public static void main( String[] args )
  // {
  //
  //   //init test arrays of magic numbers
  //   int[] arr1 = {8,21,17,69,343};
  //   int[] arr3 = {1,28,33,4982,37};
  //   int[] arr4 = {5,4,17,9000,6};
  //   int[] arr5 = {3,0,16,599,1024};
  //
  //
  //   // run partition on each array,
  //   // holding loPos & hiPos fixed, varying pvtPos...
  //   for( int testPIVOT = 0; testPIVOT < 5; testPIVOT++ ) {
  //     System.out.println("arr1: ");
  //     printArr(arr1);
  //     partition(arr1,0,4,testPIVOT);
  //     System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos="
  //                        + testPIVOT +"...");
  //     printArr(arr1);
  //     System.out.println("-----------------------");
  //
  //     System.out.println("arr3:");
  //     printArr(arr3);
  //     partition(arr3,0,4,testPIVOT);
  //     System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos="
  //                        + testPIVOT +"...");
  //     printArr(arr3);
  //     System.out.println("-----------------------");
  //
  //     System.out.println("arr4:");
  //     printArr(arr4);
  //     partition(arr4,0,4,testPIVOT);
  //     System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos="
  //                        + testPIVOT +"...");
  //     printArr(arr4);
  //     System.out.println("-----------------------");
  //
  //     System.out.println("arr5:");
  //     printArr(arr5);
  //     partition(arr5,0,4,testPIVOT);
  //     System.out.println("after partition w/ loPos=0, hiPos=4, pvtPos="
  //                        + testPIVOT +"...");
  //     printArr(arr5);
  //     System.out.println("-----------------------");
  //     /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  //   }
  // }//end main

}//end class Partition
>>>>>>> b11e3737ef231987cd2f00e11bc75a1b8e9c4fcf
