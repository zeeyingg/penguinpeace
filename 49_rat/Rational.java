/******************************


 // 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
 // APCS pd8
 // HW42 -- Be More Rational
 // 2021-12-07

 Time Spent: 1hr

 DISCO:
 * Since Comparable is an interface, it cannot be declared as an object type
 *

 QCC:
 * What are other methods that we can add to enrich Rational.java?
 * (Why) would a try-catch loop not be acceptable here?
* When would throwing an ClassCastException or any exception be useful for us?
 *

 ******************************/

public class Rational implements Comparable {

    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }


    public  Rational(int a, int b){
        this();
        if (b == 0) {
            System.err.println("Error: denominator is 0. Set to 1.");
            numerator = a;
        } else {
            this.numerator = a;
            this.denominator = b;
        }
    }


    public double floatVal(){
        return ( (double) this.numerator /  this.denominator );
    }


    public String toString(){
        return ( numerator + "/" + denominator + " or " + floatVal()) ;
    }


    public void multiply(Rational a) {
        this.numerator = this.numerator * a.numerator; // this.numerator is the numerator of the instance of Rational invoking this method
        this.denominator = this.denominator * a.denominator;
    }


    public void divide(Rational b) {
        this.numerator = this.numerator * b.denominator;
        this.denominator = this.denominator * b.numerator;
    }


    public void add(Rational rat){
        int commonDenom = this.denominator * rat.denominator;
        this.numerator = this.numerator * rat.denominator; // this.numerator is multiplied
        int reset = rat.numerator;
        rat.numerator = rat.numerator * this.denominator;
        this.numerator = this.numerator + rat.numerator;
        this.denominator = commonDenom; // denominator is set to common multiple
        rat.numerator = reset; // resets parameter object to its original value

    }


    public void subtract(Rational rat){
        int commonDenom = this.denominator * rat.denominator;
        this.numerator = this.numerator *  rat.denominator;
        int reset = rat.numerator;
        rat.numerator = rat.numerator * this.denominator;
        this.denominator = commonDenom;
        this.numerator = this.numerator - rat.numerator;
        rat.numerator = reset; // resets parameter object to its original value

    }

    public int gcd( int numerator, int denominator ){
        while (numerator != denominator){
            if (numerator > denominator) {
                numerator-=denominator; // a = a - b
            } else {
                denominator-=numerator;
            }
        } return numerator;
    }

    public void reduce(){

        int gcd = gcd(this.numerator, this.denominator);

        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;

    }

/*
================================================================================
=============THE ONLY REALLY IMPORTANT PART OF THE HW BEGINS HERE===============
================================================================================
*/
    public int compareTo(Object rat){ // should be a rational; we have to deal with it separately if it isn't
      if (rat instanceof Rational) {
        Rational workingRat = (Rational)(rat);
        Rational diff = new Rational(this.numerator, this.denominator);
        diff.subtract(workingRat);
        if (diff.floatVal() == 0) {
          return 0;
        } else if(diff.floatVal()>0){
          return 1;
        } else {
          return -1;
        }
      } else {
        ClassCastException notARat = new ClassCastException("\ncompareTo() input not a Rational");
        throw notARat;
      }
   }



}//end class
