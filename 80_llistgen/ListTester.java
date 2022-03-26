/***
 * class ListTester
 * ...for putting your LList through its paces
 *
 * Assumes local List.java (interface),
 *  overriding List interface from standard Java library
 **/

public class ListTester
{
  public static void main( String[] args )
  {

    //instantiate... var type List, obj type LList
    List<Integer> moo = new LList<Integer>();

    System.out.println(moo);
    moo.add(1);

    System.out.println(moo);
    moo.add(2);

    System.out.println(moo);
    moo.add(3);

    System.out.println(moo);
    moo.add(4);

    System.out.println(moo);

    List<Character> boo = new LList<Character>();

    System.out.println(boo);
    boo.add('a');

    System.out.println(boo);
    boo.add('b');

    System.out.println(boo);
    boo.add('c');

    System.out.println(boo);
    boo.add('d');

    System.out.println(boo);

    List wu = new LList();

    System.out.println(wu);
    wu.add('a');

    System.out.println(wu);
    wu.add(999);

    System.out.println(wu);
    wu.add(true);

    System.out.println(wu);
    wu.add("STRING");

    System.out.println(wu);


    // for( int i=0; i<7; i++ ) {
    //   int n = (int)( moo.size() * Math.random() );
    //   Integer imposter = 999;
    //   System.out.println("adding a poser at index " + n + "...");
    //   moo.add( n, imposter );
    //   System.out.println("Updated list: " + moo);
    // }
    //
    // while( moo.size() > 0 ) {
    //   int n = (int)( moo.size() * Math.random() );
    //   System.out.println("deleting node "+ n + "...");
    //   moo.remove(n);
    //   System.out.println("Updated list: " + moo);
    // }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
