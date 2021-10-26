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
        name = type;
        assignValue(type);
    }


    // 2nd overloaded constructor -
    // takes a String input to indicate denomination and
    // another String to indicate the current face
    public Coin(String type, String nowFace) {
        this(type);
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
        tailsCtr = 0;
        headsCtr = 0;
        upFace = s;
        bias = d;
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
            upFace = "heads"; // update
        } else  {
            tailsCtr++;
            upFace = "tails"; // update
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
        if (other.upFace == upFace) {
            return true; // same face
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

    // Accessors...
    // ----------------------------
    public String getUpFace() {
        return upFace;
    }

    public int getFlipCtr() {
        return flipCtr;
    }

    public double getValue() { return value; }

    public int getHeadsCtr() {
        return headsCtr;
    }

    public int getTailsCtr() {
        return tailsCtr;
    }
    // ----------------------------
} //end class

