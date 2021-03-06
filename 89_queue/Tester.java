/*
Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
APCS pd08
HW89 - Queue Two Ways
2022-03-111f
time spent : 0.8 hrs
*/

/*
DISCO
- ALQueue wraps ArrayList
- LLQueue wraps LinkedList
- You don't need a _size variable -- List already has them

QCC
- Are these methods extended from List?

*/

 public class Tester{
    
 public static void main( String[] args )
  {
    
    Queue<String> PirateQueue = new ALQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue.toString() ); //for testing toString()...

    System.out.println("\nnow testing peekFront()..."); 
    System.out.println( PirateQueue.peekFront() ); //for testing toString()...


    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue + "\n");

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main
 }