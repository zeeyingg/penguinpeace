/***
 class MergeSort
 Implements mergesort on array of ints.
 Summary of Algorithm:
 1. Split the array into two
 2. Keep on splitting until it hits the base case: array length is 1
 3. Arrays are compared: smallest element is added to a new array
 4. Once all elements of an array are added, add extra elements from other array
 ***/

public class MergeSort
{
    /******************************************************
     * int[] merge(int[],int[])
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and
     * output array sorted in ascending order.
     ******************************************************/

    private static int[] merge( int[] a, int[] b )
    {
        int ctrA = 0, ctrB = 0, ctrAns = 0;
        int[] answer = new int[a.length + b.length];
        while (ctrA < a.length && ctrB < b.length) {
            if (a[ctrA] > b[ctrB]){
                answer[ctrAns] = b[ctrB];
                ctrAns++;
                ctrB++;
            } else {
                answer[ctrAns] = a[ctrA];
                ctrAns++;
                ctrA++;
            }
        }

        while (ctrA < a.length || ctrB < b.length){
            if (ctrB < b.length){
                answer[ctrAns] = b[ctrB];
                ctrAns++;
                ctrB++;
            } else {
                answer[ctrAns] = a[ctrA];
                ctrAns++;
                ctrA++;
            }
        }

        return answer;
    }//end merge()


    /******************************************************
     * int[] sort(int[])
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/

     public static int[] sort( int[] arr )
     {
         int LengthHalf = arr.length/2;
         if (arr.length == 1){
             return arr;
         } else {
             int[] arrA = new int[LengthHalf], arrB = new int[arr.length - LengthHalf];
             for (int i = 0; i < LengthHalf; i++){
                 arrA[i] = arr[i];
             }
             for (int j = 0; j < arr.length - LengthHalf; j++){
                 arrB[j] = arr[j + LengthHalf];
             }
         return merge( sort(arrA), sort(arrB) );
         }
     } //end sort()



     //-------------------HELPERS-------------------------
     //tester function for exploring how arrays are passed
     //usage: print array, mess(array), print array. Whaddayasee?
     public static void mess( int[] a ) {
     for( int i = 0 ; i<a.length; i++ )
     a[i] = 0;
     }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
        System.out.print("[");
        for( int i : a )
            System.out.print( i + ",");
        System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args )
    {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main()

}//end class MergeSort
