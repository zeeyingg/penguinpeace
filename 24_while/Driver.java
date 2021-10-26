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

        //test default constructor
        Coin mine = new Coin();

        //test 1st overloaded constructor
        Coin yours = new Coin("quarter");

        //test 2nd overloaded constructor
        Coin wayne = new Coin("dollar", "heads");

        //test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);

        //test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);


        yours.reset("heads", 0.5);
        wayne.reset("heads", 0.5);

        int matchCtr = 0; // current match counter

        while (matchCtr <= 65536) {
            yours.flip();
            wayne.flip();
            matchCtr++;
        }
        while ( matchCtr % 2005 != 0 ) {
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
                "\nTotal heads: " + wayne.getHeadsCtr());

    } // main
}
