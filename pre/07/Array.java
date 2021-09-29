import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        double[] b = {1, 2, 3, 4};
        System.out.println("Exercise 1a");
        System.out.println(Arrays.toString(powArray(b, 2)));

        System.out.println();
        System.out.println("Exercise 1b");
        histogram(10, 10);

        System.out.println();
        System.out.println("Exercise 4");
        System.out.println(Arrays.toString(randomArray(2)));
        System.out.println(indexOfMax(2));

        System.out.println();
        System.out.println("Exercise 5");
        System.out.println(Arrays.toString(nGeneration(10)));
        System.out.println(Arrays.toString(sieve(10)));
        System.out.println(Arrays.toString(sieveActual(10)));
    }


    // exercise 1.1
    // takes a double array and returns a new array that contains the elements of a squared
    public static double[] powArray(double[] a, int exponent) {
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], exponent); // raises the value of a[i] to the exponent
        }
        return a;
    }

    // exercise 1.2
    // takes an array of scores from 0-100 & returns a histogram of 100 counters
    public static void histogram(int size, int counters) {
        int[] values = randomArray(size);
        int[] counts = new int[100];
        int interval = 100 / counters;
        System.out.print("(" + inRange(values, 0, interval + 1));
        int original = interval;
        for (int i = 1; i < counters; i++) {
            counts[i] = inRange(values, interval, interval + original + 1);
            System.out.print(", " + counts[i]);
        }
        System.out.println(")");
    }

    // helper function for histogram()
    // generates an array with random values
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size]; // creates an empty array with size
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(size);  // inserts random integers
        }
        return a;
    }

    // helper function for histogram
    // returns the count in the range
    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) { // if a value exists between low and high
                count++; // count it
            }
        }
        return count;
    }


    // exercise 4
    // returns the index of the largest element
    public static int indexOfMax(int a){
        int[] n = randomArray(a); // generates random array
        int biggestValue = 0; // current biggest value
        int i = 0;
        for (i = 0; i < n.length; i += 1){
            if (n[i] > biggestValue) n[i] = biggestValue; // replaces the biggest value with the index
            else {
                biggestValue = biggestValue;
            }
        } return i; // returns the index
    }
    // no, enhanced for loops are not helpful when referring to the index.
    // even if you can do it, it doesn't mean you should.


    // exercise 5, goes with isPrime() and nGeneration
    public static boolean[] sieve(int n) {
        int[] a = nGeneration(n); // creates a list from 0 to n-1
        boolean[] result = new boolean[n]; // creates a boolean array
        for (int i = 0; i < n; i++) {
            result[i] = isPrime(a[i]); // replaces the tfoutput from isPrime to the result array
        } return result;
    }


    public static boolean[] sieveActual(int n) {
        boolean[] result = new boolean[n]; //establishes the boolean array that will be returned, with a size of n
        for(int i = 2; i < n; i++){          // turns all values to true
            result[i] = true; }
            for(int i=2; i<Math.sqrt(n); i++) { //for loop-- starts at 2(first prime #; thus skiping indexes 0 and 1) , stops upon reaching sqrt of n, increases by 1
                if (result[i]==true){             //if -- checks to see if the current index is true(aka the default, aka viewed as prime) this index will stay true(prime) but...
                    for(int j=i*i; j<n; j=j+2){  //... further multiples of it will be turned false(composite) through this for loop*
                                                // the loop starts at the current index being looked at(i) and squaring that (i^2) (cuz math reasons), then runs through all of the multiples of the prime number
                                                // currently being looked at(the number at index i). the loop then turns all of the multiples of the prime number false, marking them as composite.
                        result[j]=false;
                    }
                }
            }
            return result;
        }

/*

when the for first loop finishes with index 2, it will check for index 3, find that it is true(prime) and proceed...
when it goes to check index 4, the loop will find that 4 is already marked as false(composite) curtosy of
the second loop. Thus the loop will skip index 4 and directly go to index 5.

*/

    // creates a list from 0 to n-1
        public static int[] nGeneration(int n) {
        int[] a = new int[n];
        int value = 0;
        for (int i = 0; i < n; i++) {
            a[i] = value++;
        }
        return a;
    }


    public static boolean isPrime (int v){
        if ( v == 1) { // exception for 1
            return false;
        } else if (v == 2) { // exception for 2
            return true;
        } else if (v % 2 == 0) { // if v is even
            return false;
        } else {
            double w = Math.sqrt(v); // stores the square root of v in 'w'
            for (int ifOdd = 3; ifOdd <= w; ifOdd += 2){ // update checks every odd number, starts at 3
                // checks the odd divisors from 3 up to square root
                if (v % ifOdd == 0) { // if any odd number gives a 0 remainder, return false
                    return false;
                }
            }
        } return true; // return true if none of this applies
    }
}
