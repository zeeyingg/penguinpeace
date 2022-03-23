// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW78 - Double up
// 2022-03-16w
// time spent : 0.8 hrs

public class DLLNode<T>
{
  //instance vars
  private T _cargo;
  private DLLNode<T> _nextNode;
  private DLLNode<T> _prevNode;

  // constructor
  public DLLNode( T value, DLLNode<T> prev, DLLNode<T> next )
  {
    _cargo = value;
    _prevNode = prev;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public T getCargo()
  {
    return _cargo;
  }

  public DLLNode<T> getNext()
  {
    return _nextNode;
  }

  public DLLNode<T> getPrev()
  {
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public T setCargo( T newCargo )
  {
    T foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<T> setNext( DLLNode<T> newNext )
  {
    DLLNode<T> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<T> setPrev( DLLNode<T> newPrev)
  {
    DLLNode<T> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo.toString();
  }


}//end class DLLNode
