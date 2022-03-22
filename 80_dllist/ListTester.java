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
    List<Integer> wu = new LList<Integer>();

    System.out.println(wu);
    wu.add(1);

    System.out.println(wu);
    wu.add(2);

    System.out.println(wu);
    wu.add(3);

    System.out.println(wu);
    wu.add(4);

    System.out.println(wu);
    wu.add(5);

    System.out.println(wu);
    wu.add(6);

    System.out.println(wu);
    wu.add(7);

    System.out.println(wu);
    wu.add(8);

    System.out.println(wu);

    for( int i=0; i<7; i++ ) {
      int n = (int)( wu.size() * Math.random() );
      Integer imposter = 999;
      System.out.println("adding a poser at index " + n + "...");
      wu.add( n, imposter );
      System.out.println("Updated list: " + wu);
    }

    while( wu.size() > 0 ) {
      int n = (int)( wu.size() * Math.random() );
      System.out.println("deleting node "+ n + "...");
      wu.remove(n);
      System.out.println("Updated list: " + wu);
    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class
