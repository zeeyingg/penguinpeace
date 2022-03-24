/**
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW81 -- Thank You, Next
time spent : 0.5 hrs

DISCO:
* Iterator is like a for-each loop and Scanner class hashed together.
* The object type of the variable we create is ArrayList.
* Primitives cannot be used to parametrize LList.
* All generic types are converted to Object through the Java compiler.

QCC:
* In which applications is Iterator most used for?
* How does Iterator read from files?
* Perusing the API subset, what are Sets and Maps?
* Are there any instance or specific examples of where an object cannot be
typecasted? What do we do if that happens? More importantly, what does Java do?
* What are the limitations of Iterator?
* What are the advantages of intializing a return type with List but a variable
type of ArrayList?
* What are the advantages of using a Iterator versus a for-each loop? Disadvantages?
* What is iterator()? Why isn't it listed on the subset?

**/

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for( Integer x : L){
      if (x.equals(key)){
        return true;
      }
    } return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()) {
      Integer x = (Integer) it.next();
      if (x.equals(key)) {
        return true;
      }
    }
    return false;
  }

   //using FOREACH loop
   //returns a list containing the odd numbers in L
   public static List<Integer> oddsA( List<Integer> L )
   {
     List<Integer> answer = new ArrayList<Integer>();
     for (Integer x : L) {
       if (x % 2 != 0) {
         answer.add(x);
       }
     }
     return answer;
   }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> arr = new ArrayList<Integer>();
    Iterator it = L.iterator();
    while (it.hasNext()){
      Integer x = (Integer) it.next();
      if (x % 2 != 0){
         arr.add(x);
      }
    } return arr;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator it = L.iterator();
    while (it.hasNext()){
      Integer x = (Integer) it.next();
      if ( x % 2 == 0){
        it.remove();
    }
  }
}


  public static void main( String [] args )
  {


    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ ){
      L.add(i);
    }

/*  TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    for (Integer x : L) {
      System.out.println(x);
    }

    // b) explicitly using an iterator
    Iterator it = new L.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
*/

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );
    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
