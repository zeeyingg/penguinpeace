// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent : 0.5 hrs

/**
DISCO:
- offer() - inserts the element in the first position unless it violates capacity restrictions
- poll() - retrives and removes the first element at the first position; returns null if deck is empty
- these two methods basically do the same thing as add() and remove(), just with more safety checks
- addLast() == add()

QCC:
- Why can't AL be converted to QQKachoo? We keep getting this error even though we 
initialized the AL the same way in our previous homework.
- How do we throw other exceptions? 

**/

import java.util.*;
import java.lang.*;

public class QQKachoo<Card> implements Deque<Card>{

private LinkedList<Card> _arr;

public QQKachoo(){
    _arr = new LinkedList<Card>();
}

public void addFirst(Card e){
    if (e == null){
        throw new NullPointerException();
    }
    _arr.add(_arr.size()-1, e);
}

public void addLast(Card e){
    if (e == null){
        throw new NullPointerException();
    }
    _arr.add(e);
}

public Card removeFirst(){
    if (_arr.size() < 1){
        throw new NoSuchElementException();
    }
    return _arr.remove(0);
}

public Card removeLast(){
    if (_arr.size() < 1){
        throw new NoSuchElementException();
    }
    return _arr.remove(_arr.size()-1);
}

public Card peekFirst(){
    if (_arr.size() < 1){
        return null;
    }
    return _arr.get(0);
}

public Card peekLast() {
    if (_arr.size() < 1){
        return null; 
    }
    return _arr.get(_arr.size()-1);
}

public String toString(){
    return _arr.toString();
}

}