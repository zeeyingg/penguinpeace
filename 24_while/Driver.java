// ZiNo's Paradox (Ziying Jian, Nora Miller, Scruffy, <Nora's Scruffy Here>)
//APCS
//HW24 -- Get It While You Can
//2021-10-25
//time spent: 2 hrs

/*
DISCO:
- this() refers to the constructor before
- we used 2 WHILE loops to account for all cases because using && will always make one of the statements false
- you can declare multiple variables of the same type on one line
- .equal is an inherited method that compares 2 objects and their class and memory address

QCC:
- How to optimize the WHILE loop to generate a different number of matches everytime?
Currently, it only outputs the first match that fulfills the conditional.

POST-v0 MODS:
- Incorporated this() into our constructors to reduce redundancy and optimize readability
- Declared same type variables on the same line
- Optimized flip() for readability and less redundancies

 */

public class Driver {
    public static void main(String[] args) {
        Coin yours = new Coin("quarter");
        Coin wayne = new Coin("dollar", "heads");
        
        
        int matchCtr = 0// or y
        int x = 10;

        yours.reset("heads", 0.5);
        wayne.reset("heads", 0.5);
        // x heads
        while ( x >= yours.getHeadCtr() ){
            yours.flip();
            x++;
        } System.out.println("Should have " + x + "heads." + "Has: " yours.getHeadCtr() + " heads.");
        
        // test matches
        yours.reset("heads", 0.5);
        wayne.reset("heads", 0.5);
        while ( matchCtr <= 65536 | matchCtr % 2005 != 0 ) {
            yours.flip();
            wayne.flip();
            if (yours.equals(wayne)) {
                matchCtr++;
//              System.out.println("Matchee matchee!");
            } else {
//              System.out.println("No match. Firestarter you can not be.");
              }
        }
        System.out.println("Total flips: " + yours.getFlipCtr() +
                "\nTotal matches: " + matchCtr +
                "\nTotal heads: " + yours.heasCtr());

    } // main
}
