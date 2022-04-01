// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW86 -- What a Racket // Scheme stuff
// 2022-04-01f
// time spent : 0.5 hrs

/**
DISCO:
- We might need another stack to unload the operation in the parenthesis.

QCC
- Why did we need to typecast the return of evaluate? Shouldn't the element popped from parenNum be a string?
**/

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{

private ArrayList<PANCAKE> _arr;

  //constructor
  public ALStack(){
    _arr = new ArrayList<>();
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return (_arr.size() == 0);
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    if (!isEmpty()){
      return (_arr.get(_arr.size()-1));
    }
    return null;
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    if (!isEmpty()){
      return (_arr.remove(_arr.size() - 1));
    }
    return null;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _arr.add(x);
  }

}
