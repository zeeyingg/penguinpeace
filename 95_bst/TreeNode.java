/**
 * class TreeNode
 * SKELETON
 * Implements a node for use in a binary tree.
 * Only holds int cargo.
 */

public class TreeNode
{

  //instance variables / attributes of a TreeNode:
  int _cargo;        //this node's data
  TreeNode _lt, _rt; //pointers to left, right subtrees


  /**
   * default constructor
   * Construct a tree node with specified value,
   * with null left and right subtrees.
   */
  public TreeNode( int initValue )
  {
    _cargo = initValue;
    _lt = _rt = null;
  }


  /**
   * overloaded constructor
   * Construct tree node w specified value, left, and right subtrees.
   */
  public TreeNode( int initValue, TreeNode initLeft, TreeNode initRight )
  {
    _cargo = initValue;
    _lt = initLeft;
    _rt = initRight;
  }


  /**
   * Returns the left subtree of this node.
   */
  public void TreeNode getLeft()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Returns the right subtree of this node.
   */
  TreeNode getRight()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Returns the value stored in this tree node.
   */
  int getValue()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  void setLeft( TreeNode theNewLeft )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  void setRight( TreeNode theNewRight )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * Sets the value of this tree node.
   */
  void setValue( int theNewValue ) 
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }

}//end class
