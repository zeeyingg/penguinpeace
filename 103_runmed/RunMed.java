/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW103 -- Erica's Friends, Hugo, and The One in the Middle
 * 2022-05-18
 * time spent: 1 hrs
 * 
 * DISCO
 * It's much easier to do this with two heaps as compared to working all in one 
 * We had to implement an accessor size() method in both of our Heaps, to our surprise
 * 
 * QCC
 * Would mergesort actually be much slower?
 * How do we visualize what's happening here in a more pretty manner?
 * 
 * ALGO
 * (refer to RunMed.algo)
 **/

import java.util.ArrayList;
import java.util.NoSuchElementException;

 public class RunMed{
     ALHeapMin bigVals;
     ALHeapMax lilVals;

     public RunMed(){
         bigVals = new ALHeapMin();
         lilVals = new ALHeapMax();
     }

     public int getMedian(){
         if (lilVals.size() == 0 && bigVals.size() == 0) throw new NoSuchElementException();
         else if (lilVals.size() > bigVals.size()){
             return lilVals.peekMax();
         } else if  (bigVals.size() > lilVals.size()){
             return bigVals.peekMin();
         } else{
             return ( bigVals.peekMin() + lilVals.peekMax() ) / 2;
         }
     }

     public void add(Integer newVal){
         if (lilVals.isEmpty() && bigVals.isEmpty()){
             lilVals.add(newVal);
         } else if (newVal < lilVals.peekMax()){
             lilVals.add(newVal);
         } else {
             bigVals.add(newVal);
         }
         balance();
         return;
     }

     public void balance(){
         while ( Math.abs(lilVals.size() - bigVals.size()) >= 2 ){
            if (bigVals.size() > lilVals.size()){ 
                lilVals.add(bigVals.removeMin());
            } else {
                bigVals.add(lilVals.removeMax());
            }
         }
     } 
    
 }