/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW95 -- Algorithm as Data Structure
 * 2022-05-09f
 * time spent: 1 hrs
 */


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
  public TreeNode getLeft()
  {
    return this._lt;
  }


  /**
   * Returns the right subtree of this node.
   */
  public TreeNode getRight()
  {
    return this._rt;
  }


  /**
   * Returns the value stored in this tree node.
   */
  public int getValue()
  {
    return this._cargo;
  }


  /**
   * Sets the value of the left subtree of this node.
   */
  public void setLeft( TreeNode theNewLeft )
  {
    this._lt = theNewLeft;
  }


  /**
   * Sets the value of the right subtree of this node.
   */
  public void setRight( TreeNode theNewRight )
  {
    this._rt = theNewRight;
  }


  /**
   * Sets the value of this tree node.
   */
  public void setValue( int theNewValue ) 
  {
    this._cargo = theNewValue;
  }

}//end class
