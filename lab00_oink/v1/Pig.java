import java.util.Scanner;

/*
 * Team Frog Hats -- Ziying Jian, Abdullah Faruque, Kevin Cheng
 * APCS
 * L00 -- v0
 * 2021-11-08
 * time spent: 1 hr
 *
 * DISCO:
 * If the return type is boolean, you can return the boolean expression.
 * How to have the scanner check for a next line and use that next line. 
 *
 * QCC:
 * Is the Scanner method implemented in Pig.java or a new class file?
 * How are we supposed to read in.words from the file directly without copying it into the command line?
 * 
 * HOW WE UTILIZED SCANNER DEMO (v1)
 * If the program is capable of reading another line of text from the command line,
 * while (in.hasNext())
 * Then the program will print the text converted into pig latin.
 * System.out.println(engToPig(in.next()))
 * 
 * NEW IN V1:
 * A rudimentary pig latin translator that takes no special scenarios into account.
 * Input from the command line.
 */

public class Pig
{
   private static final String VOWELS = "aeiouAEIOU";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";


   public static boolean hasA( String w, String letter )
    {
        for(int i = 0; i < w.length()-1; i++){
            if ( w.substring(i, i+1).equals(letter) ){
                return true;
            }
        } return false;
    }//end hasA()


   public static boolean isAVowel( String letter ) {
        return VOWELS.indexOf( letter ) != -1;
    }


   public static int countVowels( String w ) {
        return allVowels(w).length();
    }


   public static boolean hasAVowel( String w ) {
        return countVowels(w) > 0;
    }

   public static String allVowels( String w )
    {
        String vowelStorage = "";
        for (int i = 0; i < w.length() - 1; i++){
            if ( isAVowel(w.substring(i, i+1)) ){
                vowelStorage += w.substring(i,i+1);
            }
        } return vowelStorage;
    }

   public static String firstVowel( String w ) {
        String ans = "";
        if (hasAVowel(w)) ans = allVowels(w).substring(0,1);
        return ans;
   }

   public static boolean beginsWithVowel( String w ) {
        return isAVowel( w.substring(0,1) );
    }

   public static boolean isPunc( String symbol ) {
        return PUNCS.indexOf( symbol ) != -1;
    }

   public static boolean isUpperCase( String letter ) {
        return CAPS.indexOf(letter) != -1;
    }

    public static boolean hasPunc( String w ) {
        for (int i = 0; i<w.length();i++) {
	    boolean test = isPunc(w.substring(i, i+1));
            if (test) {
                return test;
            }
        }
        return false;
    }

       public static boolean beginsWithUpper( String w ) {
        return isUpperCase(w.substring(0,1) );
    }

       public static String engToPig( String w ) {

        String ans = "";

        if ( beginsWithVowel(w) || ((w.substring(0,1).equals("y") || w.substring(0,1).equals("Y")) && w.substring(1,2).indexOf(VOWELS) != -1))
            ans = w + "way";

	else {
            int vPos = w.indexOf( firstVowel(w) );
            ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
        }

        return ans;
    }

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    while (in.hasNext()) {
		    System.out.println(engToPig(in.next()));
	    }

//        System.out.println(isPunc(".")); /* TRUE */
//        System.out.println(isPunc("b")); /* FALSE */
//
//        System.out.println(isUpperCase("a"));/* FALSE */
//        System.out.println(isUpperCase("A")); /* TRUE */
//
//        System.out.println(hasPunc("cat.")); /* TRUE */
//        System.out.println(hasPunc("cat"));/* FALSE */
//
//        System.out.println(beginsWithUpper("Apple")); /* TRUE */
//        System.out.println(beginsWithUpper("apple"));/* FALSE */
//
//        System.out.println(hasA("cat", "p") + "...should be false");
//        System.out.println(hasA("applesauce scruffy krrish", "p") + "...should be true");
//
//        System.out.println(isAVowel("a") + "...should be true");
//        System.out.println(isAVowel("p") + "...should be false");
//
//        System.out.println(countVowels("meatball") + "...should be 3");
//        System.out.println(countVowels("many vowels here") + "...should be 5");
//
//        System.out.println(hasAVowel("meatball") + "...should be true");
//        System.out.println(hasAVowel("bcd") + "...should be false");
//
//        System.out.println(allVowels("meatball") + "...should be eaa");
//        System.out.println(allVowels("PIG LATIN") + "...should be IAI");

        System.out.println(engToPig("cat") + "...should be atcay");
        System.out.println(engToPig("apple") + "...should be appleway");
    }//end main()

}//end class Pig
