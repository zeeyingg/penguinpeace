import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue<QUASAR>{

    private LinkedList<QUASAR> _arr;

    public LLQueue(){
        _arr = new LinkedList<QUASAR>();
    }
//~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
      return _arr.remove(0);
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
      _arr.add(_arr.size(), x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
      return _arr.isEmpty();
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
      return _arr.get(0);
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

  public String toString(){
      return _arr.toString();
  }

}