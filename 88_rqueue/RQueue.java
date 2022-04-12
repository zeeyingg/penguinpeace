// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW88 -- BPC Kiddies Do Not Wait in Line Either
// 2022-04-05t
// time spent : 0.5 hrs

/**
DISCO:
- We could use dequeue() in sample() to scramble to queue.
- You don't need to re-connect two parts of an linkedlist together, simply need
to shift the positions.

QCC:
- Why are we removing random elements from the queue?
- What is the point of sample()?
**/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;

  }


  public void enqueue( SWASHBUCKLE enQVal )
  {

    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);

  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE ans;
    if (_size == 1)
    {
      ans = _front.getCargo();
      _front.setCargo(null);
      _end.setCargo(null);
      return ans;
    } else
    {
      LLNode<SWASHBUCKLE> _tmp = _front;
      int random = (int) ((Math.random() * _size) - 1);

      for (int i = 0; i < random; i ++) {
        _tmp = _tmp.getNext();
      }
      ans = _tmp.getNext().getCargo();
      _tmp.setNext(_tmp.getNext().getNext());
      _size --;
      return ans;
    }

  }//O(n)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();

  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   * If this list is not empty:
   * For _size - 1 amount of times, we enqueue() into the queue an element that we dequeue() from the queue
   **/
  public void sample ()
  {
    if (!this.isEmpty()) {
      for (int i = 0; i < _size; i++) {
        this.enqueue(this.dequeue());
      }
    }

    System.out.println(this.peekFront());


  }//O(n^2)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
    String ans = "FRONT -> ";
    LLNode<SWASHBUCKLE> tmp = _front;
    while( tmp != null ) {
      ans += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    ans += " -> END";
    return ans;

  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    /~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
