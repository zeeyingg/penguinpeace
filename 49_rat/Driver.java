public class Driver {

  public static void main(String[] args) {

      // removed all tests of other methods

      Comparable a = new Rational(); // we need to initialize the rats in this way so that we
                                     // know we are actually implementing the interface
      Comparable r = new Rational(2, 3);
      Comparable s = new Rational(1,2);
      Comparable t = new Rational(4, 6);
      Integer x = new Integer(4);
      Comparable y = new Integer(4);


      // testing compareTo, where it's actually a rational
      System.out.println( r.compareTo(s) + "...expected 1" ); // rationals are arrogant - they are positive only when they are a greater value than others
      System.out.println( r.compareTo(t) + "...expected 0" );
      System.out.println( s.compareTo(t) + "...expected -1" );
      System.out.println( t.compareTo(s) + "...expected 1" );


      // testing equals
      System.out.println( r.equals(s) + "...expected false" ); // rationals are arrogant - they are positive only when they are a greater value than others
      System.out.println( r.equals(t) + "...expected true" );
      System.out.println( r.equals(r) + "...expected true" );

      // testing equals, where it's not a rational
      // System.out.println( r.equals(x) );

      // testing compareTo, where it's not a rational
      System.out.println( r.compareTo(x) );
      System.out.println( r.compareTo(y) );
    }
}
