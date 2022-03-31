import java.util.ArrayList;

public class ALStack{

private int _size;
private ArrayList<PANCAKE> _arr;

  //constructor
  public ALStack(int initCapacity){
    _arr = new ArrayList<PANCAKE>(initCapacity);
    _size = 0;
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty(){
    return (_arr.size() == 0);
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop(){
    return (_arr.get(size()-1));
  }

  //Pop and return top element of stack.
  public PANCAKE pop(){
    if (!isEmpty()){
      <PANCAKE> ret = _arr[size()-1];
      _arr.remove(size()-1);
      return ret;
    }
    return null;
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ){
    _arr[++size()] = s;
  }

  public String to

}
