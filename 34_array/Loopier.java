/**
 Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
 APCS
 HW34 -- intro to arrays
 2021-11-14
 time spent: 2 hrs

 QCC: Can the linear search method be done recursively using getSlice? What is the most efficient way to linear search recursively through an array and the most
 efficient way to return the number of occurences of a target in an array recursively?

 DISCO: We tried to use recursion to slice the array in our recursive linear search method by reducing the array length by one every time we went through the
 recursion, but this didn't work because instead of returning the index of the first occurence in the original array, it returned the first occurence index in the new
 sliced array. We didn't know how to fix this, so we couldn't use this method. Instead, we used a helper method which we recursively ran through, but we aren't sure
 if that also counts as recursion.

 - Reminder to self: generation of random stuff is a static method - you need to create a random generator first.
 - It seems like I can't redefine items in an array within a loop.
 */

import java.util.Random; 

public class Loopier {

	public static int[] randArray(int[] array) { // seems easier to take the array being modified as an argument than
		// to do so as the thing invoking the function, because I don't know how
		// to access the contents of the item invoking a method
		Random randomGen = new Random();
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = randomGen.nextInt(5); // it didn't specify the range for the number, but 100 is prob good for now?
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
		System.out.println("All targets are 2.");
		System.out.println("Linear Search Iterative: " + linSearch(a, 2));
		System.out.println("Linear Search Recursion: " + linSearchR(a, 2));
		System.out.println("Frequency Iterative: " + freq(a, 2));
		System.out.println("Frequency Recursion " + freqR(a, 2));
	}
}