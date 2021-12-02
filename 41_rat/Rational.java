/******************************


// 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
// APCS pd8
// HW41 Rational -- 2D arrays
// 2021-12-1

Time Spent: 1.2hr

DISCO:

* The compiler appears to be running toString when System.out.println(t) is invoked - see commented line

* this can be used to reference instance variables of the instance invoking a given method.
For the inst vars: use this.<instVar>


QCC: Why is the first DISCO item true?

Is there a way to refer to instance methods of the object running a method?
******************************/


public class Rational {

  private int num;
  private int denom;

  public Rational(){
    num = 0;
    denom = 1;

  }


  public  Rational(int a, int b){
    this();
    if (b == 0) {
      System.err.println("Error: Denominator is 0. Set to 1.");
    } else {
    num = a;
    denom = b;
    }
  }


  public double floatVal(){
    return ( (double) this.num /  this.denom );
  }


  public String toString(){
    return ( num + "/" + denom + " or " + floatVal()) ;
  }


/*
multiply
takes 1 Rational object as a parameter and multiplies it by this Rational object
does not return any value
should modify this object and leave the parameter alone (see below for example)
need not reduce the fraction
*/

  public void multiply(Rational a) {
     this.num *= a.num; // this.num is the num of the instance of Rational invoking this method
     this.denom *= a.denom;
   }


   public void divide(Rational b) {
      this.num *= b.denom; //
      if (b.num != 0){
        this.denom *= b.num;
      } else {
        System.out.println("Error: you can't divide by 0");
      }
    }


  public static void main(String[] args) {

    Rational a = new Rational();
    Rational r = new Rational(2, 3);
    Rational s = new Rational(1,2);
    Rational t = new Rational(3,0);



    System.out.println( "//============testing constructors===========" );
    System.out.println( "Default constructor: " + a + "...expecting 0/1");
    System.out.println("Testing overwritten constructor error message:" + t + "...expecting 0/1\n");


    System.out.println( "//============testing multiply/divide methods===========" );
    System.out.println("Original r: " +r + "...expecting 2/3"); // expected 2/3
    System.out.println("Original s: " +s + "expecting 1/2 \n"); // expected 1/2

    r.multiply(s);
    System.out.println("AFTER MULTIPLYING r*s....");
    System.out.println("r: " + r + "...expecting 2/6 or 0.333"); // expected 2/6
    System.out.println("s: " + s + "expecting 1/2 or 0.5\n"); // expected 1/2


    System.out.println("\nOriginal a: " +a + "...expecting 0/1 or 0.0");
    r.multiply(a);
    System.out.println("AFTER MULTIPLYING AGAIN....");
    System.out.println("New value of r * a:");
    System.out.println(r + "...expecting 0/6 or 0.0"); // expected 0/6
    System.out.println(a + "...expecting 0/1 or 0.0\n"); // expected 0/1


    Rational p = new Rational(8,5);
    Rational q = new Rational(1,3);
    System.out.println("Original p: "+p);
    System.out.println("Original q: "+q);
    q.divide(p);
    System.out.println("q after q/p: " + q + "...expecting 5/24"); // expected 24/5

    Rational n = new Rational(); // should be 0
    n.divide(p);
    System.out.println(n + "...expecting 0");

    q.divide(n);
    System.out.println(n + "...expecting an error");


  }

}//end class
