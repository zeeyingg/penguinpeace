/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW99 -- Some Are More Equal Than Others, Codified
 * 2022-05-13f
 * time spent: 1 hrs
 */

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
    private ArrayList<Integer> Q;

    public ArrayPriorityQueue(){
        Q = new ArrayList<Integer>();
    }

    public void add( int cargo ) {
        Integer superCargo = cargo;
        Q.add(position(cargo), cargo);
    } //O(n)

    //pre-req: cargo is defined
    public int position(Integer cargo){
        int i = 0;
        while (i < Q.size() && cargo.compareTo(Q.get(i)) > 0) {
            i++;
          }
          return i;        
    } //helper

    public boolean isEmpty() {
        return Q.isEmpty();
    } //O(1)

    public int peekMin() {
        return Q.get( Q.size() - 1 );
    } //O(1)
    
    public int removeMin() {
        return Q.remove( Q.size() - 1 );
    } //O(1)

    public String toString(){
        return Q.toString();
    }

    public static void main(String[] args){
        ArrayPriorityQueue poo = new ArrayPriorityQueue();
        poo.add(5);
        poo.add(3);
        poo.add(4);
        poo.add(7);
        poo.add(8);
        poo.add(1);
        System.out.println("poo: "+  poo);

        System.out.println();
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());

        System.out.println();
        System.out.println("poo: "+  poo);
    }

}