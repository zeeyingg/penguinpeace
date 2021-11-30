/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays

// 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
// APCS pd8
// HW40 -- 2D arrays
// 2021-11-30

Time Spent: 1hr

DISCO:

* To go through each element of the 2d array, you can use for loops
to first go through each array in the 2d array and secondly, go through
each element in that array. Each for loop goes through a "dimension"

* As shown by int[][]m3, you can have 2d arrays with different numbers of elements
in each array, so you can have arrays with two or three elements at the same time,
as long as it's intialized in the beginning.

* a.length works as expected, even if a is an array of arrays. This is very convenient!


QCC: Is there a built in method to get the index of an array in a 2d array?
Is syntax like new int[][5] or new int[5][] valid?
******************************/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i = 0; i < a.length; i++) {
      System.out.print("Line " + i + ": { ");
      // print the array in here
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("} ");
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  { //int counter = 0;
    for (int[] arr : a ){
      //System.out.print("\nLine "+ counter +": ");
      System.out.print("{ ");
      //counter +=1;
      for(int element : arr){
        //
        System.out.print(element + " ");
      }
      System.out.println("}");
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum = 0;
    for (int[] arr : a ){
      for(int element : arr){
        sum += element;
      }
    }
    return sum;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m ) {
    int totalSum = 0;
    for (int i = 0; i < m.length; i++){
      totalSum += sumRow(i , m);
    }
    return totalSum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
      int sum = 0;
      for (int j = 0; j < a[r].length; j++) {
        sum += a[r][j];
      }
      return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
    for(int element : m[r]) {
      summer += element;
    }
    return summer;
  }


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);

      print2(m1);
      print2(m2);
      print2(m3);

      System.out.print("\ntesting sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2)); // expecting 27
      System.out.println("sum m3 : " + sum1(m3)); // expecting 21

      System.out.print("\ntesting sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));


    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
