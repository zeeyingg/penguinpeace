/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW101 -- Heap o'Trouble
 * 2022-05-16f
 * time spent: 1 hrs


 DISCO:
 * Heapify is just a way of recursively swapping elements!
 * The visualizer was amazing for this assignment and should def be utilized more
 * The array places all the elements on each level

 QCC:
 * How do we get heapify to work?
 * What is the purpose of some of these helper methods if we don't utilize them?

 */

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */


import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();
  }//O(?)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    for(int i=0; i < _heap.size(); i++){
      if(_heap.get(i) != null) return false;
    } return true;
  }//O(n)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0); // gets index 0
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * 1. Add the node in the next available spot
   * 2. Compare the node to its parent node
   * 3. If the parent node is bigger than the child node, swap
   * 4. Keep swapping until this condition is false and the node reaches the right spot
   */
  public void add( Integer addVal )
  {
    if(_heap.isEmpty()) _heap.add(addVal);
    else {
        _heap.add(addVal);
        int index = _heap.size()-1;
        int parent_index = ((index-1)/2);
        while( _heap.get(index) < _heap.get(parent_index) ){
          swap(index, parent_index);
          index = parent_index;
          parent_index = ((index-1)/2);
        }
      }
    }
    //O(n)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * 1. Remove the smallest element
   * 2.
   *
   */

  public Integer removeMin()
  {
    if (isEmpty()) return -1;
    Integer removed = _heap.get(0);
    _heap.set(0, _heap.size()-1);
    heapify(0);
    return removed;
  }//O(?)

  public void heapify(int pos)
  {
    int leftChild = pos*2;
    int rightChild = pos*2+1;
    if ( _heap.get(pos) > _heap.get(leftChild) || _heap.get(pos) > _heap.get(rightChild) ){
      // if any child is less than the parent
      if ( _heap.get(leftChild) < _heap.get(rightChild) ){
        // keep checking and swapping
        swap(pos, leftChild);
        heapify(leftChild);
      }
      else {
        swap(pos, rightChild);
        heapify(rightChild);
      }
    }
  }

  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    int leftChild = pos*2;
    int rightChild = pos*2+1;
    if (_heap.isEmpty() || ((_heap.get(leftChild) == null) && (_heap.get(rightChild) == null))) return -1;
    else if (_heap.get(leftChild) == null) return rightChild;
    else if (_heap.get(rightChild) == null) return leftChild;
    else if ( _heap.get(leftChild).compareTo(_heap.get(rightChild)) < 0 ){
      return leftChild;
    } else return rightChild;
  }//O(1)



  // //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  // swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
