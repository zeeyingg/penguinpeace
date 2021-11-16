/**
 Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
 APCS
 HW35 
 2021-11-15
 time spent: .5 hrs

 DISCO:
 - Math.random returns a floating-point number in the range 0 to less
than 1.
 - By typecasting, the result is converted to an int. Rounds the result to the nearest decimal place and gives a whole number.
 - Getting a random number between two values: Math.random() * (max - min) + min;
 - Max is exclusive, min is inclusive
 - When typecasting, the thing that's being typecasted must always be wrapped around in ().
 - If you don't specify the max value, then the array will be populated with 0's.

QCC:
 - In Java, why is there a continuity of min number being inclusive but max number
 being exclusive? Does it have something to do with starting at 0?
 - How do we generate integers excluding 0?
 - How to generate random ints from 10-20?

 */

public class Loopier {

	public static int[] randArray(int[] array) { // seems easier to take the array being modified as an argument than
		// to do so as the thing invoking the function, because I don't know how
		// to access the contents of the item invoking a method
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = (int) ( Math.random()*2 );
		}
		return newArray;
	}


	public static String printArray(int[] array) {
		String print = "{" + array[0];
		for (int i = 1; i < array.length; i++) {
			print += ", " + array[i];
		}
		return print += "}";
	}


	public static int linSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/*
	We attempted to run linSearch recursively by copying and slicing the new array, then checking to see if the 0th
	index matched the target. This didn't work for us because the method would always return the 0th index,
	not the index of that target in the original array. We abandoned this approach, but would like to revisit it
	sometime.
	 */

//	public static int linSearchR(int[] array, int target) {
//		if ( 1 > array.length) {
//			return -1;
//		} else if (array[0] == target){
//			return array[0];
//		} else {
//			int[] s;
//			s = getSlice(array, 0, array.length);
//			return (linSearchR(s, target));
//		}
//	}


	public static int linSearchR(int[] array, int target) {
		return linSearchRHelper(array, target, 0);
	}


	public static int linSearchRHelper(int[] array, int target, int i) {
		if (i >= array.length) {
			return -1;
		} else if (array[i] == target) {
			return i;
		} else {
			return linSearchRHelper(array, target, i + 1);
		}
	}


	public static int freq(int[] array, int target) {
		int freq = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				freq++;
			}
		}
		return freq;
	}


	public static int freqR(int[] array, int target) {
		if (array.length == 0) {
			return 0;
		} else {
			int[] s;
			s = getSlice(array, 1, array.length);
			return ( isIn(array[0], target) + freqR(s, target) );
		}
	}

	public static int[] getSlice(int[] array, int startIndex, int endIndex) {
		int[] s = new int[endIndex - startIndex]; // copies the existing array into a new array, s
		for (int i = 0; i < s.length; i++) {
			s[i] = array[startIndex + i]; // inserts values from original array starting from startIndex into s
		}
		return s;
	}

	public static int isIn(int a, int target) {
		if (a == target) {
			return 1;
		}
		else {
			return 0;
		}
	}


	public static void main(String[] args){
		int[] a = new int[10]; 
		a = randArray(a); 
		System.out.println(printArray(a));
		System.out.println("All targets are 1.");
		System.out.println("Linear Search Iterative: " + linSearch(a, 1));
		System.out.println("Linear Search Recursion: " + linSearchR(a, 1));
		System.out.println("Frequency Iterative: " + freq(a, 1));
		System.out.println("Frequency Recursion " + freqR(a, 1));
	}
}
