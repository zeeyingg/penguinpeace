public class Driver{

  public static void main(String[] args){
    //main method for testing
      LList piper = new LList();

      System.out.println( piper );
      // System.out.println( "size: " + piper.size() );

      piper.add("pickled peppers");
      System.out.println( piper );
      System.out.println( "size: " + piper.size() );

      piper.add("pickled a peck of");
      System.out.println( piper );
      // System.out.println( "size: " + piper.size() );

      piper.add("Peter");
      System.out.println( piper );
      // System.out.println( "size: " + piper.size() );

      System.out.println( "2nd item is: " + piper.get(1) );

      piper.set( 1, "got" );
      System.out.println( "...and now 2nd item is: " + piper.set(1,"got") );

      System.out.println( piper );
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

}
}
