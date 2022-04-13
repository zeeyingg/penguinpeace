// Mister George, Ziying, Diana, Weichen

import java.util.*;
import java.lang.*;

public class ListDeque<Card> implements Deque<Card>{

private ArrayList<Card> _arr;

// constructor that initalizes a new AL
public ListDeque(){
    _arr = new ArrayList<Card>();
}

// inserts the specified element 
// at the front of this deque if it is possible to do so
public void addFirst(Card e){
    if (e == null){
        throw new NullPointerException();
    }
    _arr.add(0, e);
}

// inserts the specified element 
// at the end of this deque if it is possible to do so
public void addLast(Card e){
    if (e == null){
        throw new NullPointerException();
    }
    _arr.add(e);
}

// removes the specified element 
// at the front of this deque if it is possible to do so
public Card removeFirst(){
    if (_arr.size() < 1){
        throw new NoSuchElementException();
    }
    return _arr.remove(0);
}

// removes the specified element 
// at the end of this deque if it is possible to do so
public Card removeLast(){
    if (_arr.size() < 1){
        throw new NoSuchElementException();
    }
    return _arr.remove(_arr.size()-1);
}

// returns the first element of the deque
public Card peekFirst(){
    if (_arr.size() < 1){
        return null;
    }
    return _arr.get(0);
}

// returns the last element of the deque
public Card peekLast() {
    if (_arr.size() < 1){
        return null; 
    }
    return _arr.get(_arr.size()-1);
}

// toString() method
public String toString(){
    return _arr.toString();
}

}