/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW99 -- Some Are More Equal Than Others, Codified
 * 2022-05-13f
 * time spent: 1 hrs
 */

public interface PriorityQueue
{
    public void add( int x );

    public boolean isEmpty();

    public int peekMin();
    
    public int removeMin();        
}

