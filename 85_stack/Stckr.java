// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW85 -- Leon Leonwood Stack
// 2022-03-31t
// time spent : 0.5 hrs

/**
DISCO:
- Z needs to be changed to Comparable.
- We do not need to keep track of size() as ArrayList and LinkedList do that for us already.
- We can use the various methods built in the different types of Collections to implement stacks more easily.

QCC
- Why does Z need to be changed to Comparable?
- What other methods will we be implementing for stacks?
**/

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below

    Stack<Comparable> cakes = new ALStack<Comparable>();
    //Stack<Comparable> cakes = new LLStack<Comparable>();
    System.out.println("peek: " + cakes.peekTop()); // should print "null"
    System.out.println("isEmpty: " + cakes.isEmpty()); // should print "true"
    cakes.push(1);
    cakes.push(2);
    cakes.push("Happy");
    System.out.println("isEmpty: " + cakes.isEmpty()); // should print "false"
    System.out.println("peek: " + cakes.peekTop()); // should print "Happy"
    System.out.println("pop: " + cakes.pop()); // should print "Happy"
    System.out.println("peek: " + cakes.peekTop()); // should print 2
    System.out.println("pop: " + cakes.pop()); // should print 2
    System.out.println("pop: " + cakes.pop()); // should print 1
    System.out.println("pop: " + cakes.pop()); // should print "null"
    System.out.println("isEmpty: " + cakes.isEmpty()); // should print "true"
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class
