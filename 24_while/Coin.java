// ZiNo's Paradox (Ziying Jian, Nora Miller, Scruffy, <Nora's Scruffy Here>)
//APCS
//HW23 -- What Does Equality Look Like?
//2021-10-26
//1.1 hrs

/*
DISCO:
- to.String() can be invoked using System.out.println
- Math.round rounds to the nearest integer
- Objects can be compared to one another through methods
- Precond is what the method intakes, postcond is what the method returns

QCC:
- How is to.String() invoked? Is it through any System class, or only though System.out.print methods?
- How should bias be used? Should bias be manually set? Is the method asking that there only be two numbers, 1.0 and 0.0?
 */

import java.util.Random;
import static java.lang.Math.*;

public class Coin {

    private double value;       // monetary worth
    private String upFace;     // face
    private String name;       // "penny", "nickel", etc.
    private int flipCtr;       // number of times this coin has been flipped
    private int headsCtr;     // number of times heads-up
    private int tailsCtr;     // number of times tails-up
    private double bias;     // likelihood of landing heads-up


        // default constructor
        public Coin() {
           name = null;
           upFace = "heads";
        }


        // 1st overloaded constructor -
        // takes String to indicate denomination
        public Coin(String type) {
            name = type;
            upFace = "heads";
        }


        // 2nd overloaded constructor -
        // takes a String input to indicate denomination and
        // another String to indicate the current face
        public Coin(String type, String nowFace) {
            name = type;
            upFace = nowFace;
        }


        private double assignValue( String s ) {
            if (s == "penny"){
                value = 1;
            } else if (s == "nickel"){
                value = 5;
            } else if (s == "dime"){
                value = 10;
            } else if (s == "quarter"){
                value = 25;
            } else if (s == "dollar") {
                value = 100;
            } return 0; // error
        }


        /***
         reset() -- initialize a Coin
         precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
         postcond: Coin's attribs reset to starting vals
         ***/
        public void reset( String s, double d ) {
            flipCtr = 0;
            headsCtr = 0;
            tailsCtr = 0;
            bias = d;
            upFace = s; // coins are heads by default
        }


        /***
         * String flip() -- simulates a Coin flip
         * precond:  bias is a double on interval [0.0,1.0]
         * (1.0 indicates always heads, 0.0 always tails)
         * postcond: upFace updated to reflect result of flip.
         * flipCtr incremented by 1.
         * Either headsCtr or tailsCtr incremented by 1, as approp.
         * Returns "heads" or "tails"
         ***/
        public String flip() {
            double randDbl = Math.random();
            if (round(bias) <= 1) {
                headsCtr++;
                upFace = "heads"; // update
                return "heads";
            } else  {
                tailsCtr++;
                upFace = "tails"; // update
                return "tails";
            } return flipCtr++;
        }

        /***
         * boolean equals(Coin) -- checks to see if 2 coins have same face up
         * precond: other is not null
         * postcond: Returns true if both coins showing heads
         * or both showing tails. False otherwise.
         ***/
        public boolean equals( Coin other ) {
            if (other.upFace == upFace) {
                return true; // same f  ace
            } return false; // unequal face
        }


        /***
         * String toString() -- overrides toString() provided by Java
         * precond: n/a
         * postcond: Return String comprised of name and current face
         ***/
        public String toString() {
            String rtr = (name + " -- " + upFace);
            return rtr;
        }

    } //end class


