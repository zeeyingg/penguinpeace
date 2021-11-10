/*
 * Team Frog Hats -- Kevin Cheng, Ziying Jian, Abdullah Faruque
 * APCS
 * L00 -- Etterbay Odingcay Oughthray Ollaborationcay
 * 2021-11-09
 * Time spent: .3 hours
 *
 * DISCO:
 * One way to test to see if Y is a vowel or consonant in a given word
 *
 * QCC:
 * Where is the best location for this separation to occur? It doesn't work if Y is not the first letter in this case
 * What methods are there to allow for the capitalization of certain letters in a string?
 * 
 * NEW IN v2:
 * One edit to an if statement that Y to be separated into either vowel or consonant only if it's the first letter in a word.
 * Implemented the Scanner class and ran the plaintext file in.words 
 */

import java.util.Scanner;

public class Pig {
private static final String VOWELS = "aeiouAEIOU";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";

	public static boolean isAVowel(String letter) {
		return VOWELS.indexOf(letter) != -1;
	}

	public static String allVowels(String w) {
                String vowelList = "";
                final String y = "yY";

                if (w.length() != 0) {
                        String letter = w.substring(0, 1);
                        //In order for y to be a vowel, the next letter must be a consonant
                        boolean yCheck = (y.indexOf(letter) != -1 && (w.length() == 1 || VOWELS.indexOf(w.substring(1, 2)) == -1));
                        if (yCheck || isAVowel(letter)) vowelList += letter;

                        vowelList += allVowels(w.substring(1));
                }
                return vowelList;
        }

	public static int countVowels(String w) {
		return (allVowels(w)).length();
	}

	public static boolean hasAVowel(String w) {
		return countVowels(w) > 0;
	}

	public static String firstVowel(String w) {
		if (hasAVowel(w)) return allVowels(w).substring(0, 1);
		return "";
	}

	public static boolean beginsWithVowel(String w) {
		return isAVowel(w.substring(0, 1));
	}

	public static boolean isPunc(String symbol) {
		return PUNCS.indexOf(symbol) != -1;
	}

	public static boolean isUpperCase(String letter) {
        	return CAPS.indexOf(letter) != -1;
	}

	public static boolean hasPunc( String w ) {
        	for (int i = 0; i<w.length();i++) {
			boolean test = isPunc(w.substring(i, i+1));
			if (test) return test;
		}
		return false;
        }
	

       public static boolean beginsWithUpper( String w ) {
        return Character.isUpperCase(w.charAt(0) );
    }
	
	
    public static String engToPig(String w) {
    String ans = "";
    String ansC = "";

    if (beginsWithVowel(w) || ((w.substring(0, 1).equals("y") || w.substring(0, 1).equals("Y")) && w.substring(1, 2).indexOf(VOWELS) != -1))
        ans = w + "way";
    /* fly returns flyway, but its supposed to return 
               yflay, style returns styleway instead of ylestay*/

    else {
        int vPos = w.indexOf(firstVowel(w));
        ans = w.substring(vPos) + w.substring(0, vPos) + "ay";
    }
    if (beginsWithUpper(w)) {
        ansC = (ans.substring(0, 1).toUpperCase() + (ans.substring(1)).toLowerCase());
        return ansC + " ";
    }
    return ans + " ";
}

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    while (in.hasNext()) {
		    System.out.print(engToPig(in.next()));
	    }
    }//end main()

}//end class Pig
