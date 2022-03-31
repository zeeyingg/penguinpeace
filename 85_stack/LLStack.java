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

import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

  private LinkedList<PANCAKE> _ll;

  //constructor
  public LLStack() {
    _ll = new LinkedList<>();
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return (_ll.size() == 0);
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    if (!isEmpty()) {
      return _ll.getLast();
    }
    return null;
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    if (!isEmpty()) {
      return _ll.removeLast();
    }
    return null;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _ll.add(x);
  }
}
