// Mister George, Ziying, Diana, Weichen

import java.util.*;
import java.lang.*;

public class ListDeque<Card> implements Deque<Card>{

private ArrayList<Card> _arr;

public ListDeque(){
    _arr = new ArrayList<Card>();
}

public void addFirst(Card e){
    if (e == null){
        throw new NullPointerException();
    }
    _arr.add(0, e);
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