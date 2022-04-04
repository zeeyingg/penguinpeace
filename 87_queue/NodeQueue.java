// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW87 -- The English Do Not Wait In Line for Soup
// 2022-04-04m
// time spent : 0.5 hrs

/**
DISCO:
- First one that goes in leaves the queue first.
- Last one that goes in leaves the queue last.
- The points to the first node.

QCC:
- In what situations should we use queues?
- How do we utilize a tail?
**/

public class NodeQueue<QUASAR> implements Queue<QUASAR> {

  SLNode<QUASAR> _head;
  int _size = 0;

  public NodeQueue() {
      _head = null;
      _size = 0;
  }

  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    SLNode<QUASAR> tmp = _head;

    QUASAR ans;
    for(int i = 0; i < _size-2; i++) { // Get to element before first element
        tmp = tmp.getNext();
    }

    ans = tmp.getNext().getCargo();
    tmp.setNext(null);

    _size--;
    return ans;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
      SLNode<QUASAR> tmp = new SLNode<QUASAR>(x, _head);
      _head = tmp;
      _size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
      return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    SLNode<QUASAR> tmp = _head;

    QUASAR ans;
    for(int i = 0; i < _size-2; i++){ // Get to element before first element
        tmp = tmp.getNext();
    }

    ans = tmp.getNext().getCargo();

    return ans;
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

  public String toString() {
    String ans = "";

    SLNode<QUASAR> temp = _head;

    for (int i = 0; i < _size; i++){
      ans += temp.getCargo() + " "; // keep track of list of elements
      temp = temp.getNext(); // iterate through the singly linked nodes
    }
    return ans;
  }


  private class SLNode<QUASAR> {

    private QUASAR _cargo;
    private SLNode<QUASAR> _nNode;


    public SLNode( QUASAR value, SLNode<QUASAR> next ) {
    	_cargo = value;
    	_nNode = next;
    }

    public QUASAR getCargo() { return _cargo; }

    public SLNode<QUASAR> getNext() { return _nNode; }


    public QUASAR setCargo( QUASAR newCargo ) {
    	QUASAR foo = getCargo();
    	_cargo = newCargo;
    	return foo;
    }

    public SLNode<QUASAR> setNext( SLNode<QUASAR> newNext ) {
    	SLNode<QUASAR> foo = getNext();
    	_nNode = newNext;
    	return foo;
    }
  }


  public static void main(String[] args) { // for testing
      NodeQueue<String> test = new NodeQueue<String>();
      test.enqueue("Vase!");
      System.out.println(test);

      test.enqueue("Your");
      System.out.println(test);

      test.enqueue("Broke");
      System.out.println(test);

      test.enqueue("I");
      System.out.println(test);

      test.enqueue("Yes");
      System.out.println(test);

      test.dequeue();
      System.out.println(test);

      System.out.println(test.peekFront());
  }
}
