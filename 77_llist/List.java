
/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 * 
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );
  
  //add node to an index of the list containing String input newVal
  public void add(int index, String newVal);
  
  //remove node from an index of the list
  public String remove(int index); 

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface
