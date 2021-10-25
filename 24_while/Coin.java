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

        private double value;
        private String upFace, name;
        private int flipCtr, headsCtr, tailsCtr;
        private double bias = 0.5;


        // default constructor
        public Coin() {
            reset("heads", 0.5);
        }


        // 1st overloaded constructor -
        // takes String to indicate denomination
        public Coin(String type) {
            this();
            assignValue(type);
        }


        // 2nd overloaded constructor -
        // takes a String input to indicate denomination and
        // another String to indicate the current face
        public Coin(String type, String nowFace) {
            this();
            upFace = nowFace;
        }

    // Accessors...
    // ----------------------------
    public String getUpFace() {
        return upFace;
    }

    public int getFlipCtr() {
        return flipCtr;
    }

    public double getValue() {
        return value;
    }

    public int getHeadsCtr() {
        return headsCtr;
    }

    public int getTailsCtr() {
        return tailsCtr;
    }
    // ----------------------------

        private double assignValue( String s ) {
            if ( name.equals("penny") ) { value = 0.01; }
            else if (name.equals("nickel") ) { value = 0.05; }
            else if (name.equals("dime") ) { value = 0.10; }
            else if (name.equals("quarter") ) { value = 0.25; }
            else if (name.equals("half dollar") ) { value = 0.5; }
            else if (name.equals("dollar") ) { value = 1.0; }
            return value;
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
            if (randDbl < bias) {
                headsCtr++;
                upFace = "heads";
            } else  {
                tailsCtr++;
                upFace = "tails";
            }
            flipCtr++;
            return upFace;
        }

        /***
         * boolean equals(Coin) -- checks to see if 2 coins have same face up
         * precond: other is not null
         * postcond: Returns true if both coins showing heads
         * or both showing tails. False otherwise.
         ***/
        public boolean equals( Coin other ) {
            return upFace.equals( other.upFace);
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
