/**
<<<<<<< HEAD
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW96 -- BSTs is the Perfect Place for Shade
 * 2022-05-10f
 * time spent: 1 hrs
 */

/**
=======
>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    _root = null;
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );

    if ( _root == null ) {
      _root = newNode;
      return;
    }
    insert( _root, newNode );
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if ( newNode.getValue() < stRoot.getValue() ) {
      //if no left child, make newNode the left child
      if ( stRoot.getLeft() == null )
        stRoot.setLeft( newNode );
      else //recurse down left subtree
        insert( stRoot.getLeft(), newNode );
      return;
    }
    else { // new val >= curr, so look down right subtree
      //if no right child, make newNode the right child
      if ( stRoot.getRight() == null )
        stRoot.setRight( newNode );
      else //recurse down right subtree
        insert( stRoot.getRight(), newNode );
      return;
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
	    return;
    System.out.print( currNode.getValue() + " " );
    preOrderTrav( currNode.getLeft() );
    preOrderTrav( currNode.getRight() );
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav( _root );
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    inOrderTrav( currNode.getLeft() );
    System.out.print( currNode.getValue() + " " );
    inOrderTrav( currNode.getRight() );
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav( _root );
  }
<<<<<<< HEAD
  
=======
>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154
  public void postOrderTrav( TreeNode currNode )
  {
    if ( currNode == null )
      return;
    postOrderTrav( currNode.getLeft() );
    postOrderTrav( currNode.getRight() );
    System.out.print( currNode.getValue() + " "  );
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
<<<<<<< HEAD
    	return search(_root, target);
    }

    TreeNode search (TreeNode stRoot, int target){
      if(stRoot == null){ // if the target is the root
        return null;
      } else if (stRoot.getValue() == target){ // if the target does not exist
        return stRoot;
      } 

      if (target < stRoot.getValue()){ // recurse the left
        return search(stRoot.getLeft(), target);
      } else if (target > stRoot.getValue()){ // recurse the right
        return search(stRoot.getRight(), target);
      }
      return null; //unreachable
=======
    	/*** YOUR IMPLEMENTATION H*** YOUR IMPLEMENTATION HERE ***/
>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154
    }

    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
      TreeNode _currNode = _root;
      int leftCount = 0, rightCount = 0;
    	while (_currNode != null){
          leftCount++;
          _currNode = _currNode.getLeft();
      }
      _currNode = _root;
      while (_currNode != null){
        rightCount++;
        _currNode = _currNode.getRight();
      }
      return Math.max(leftCount, rightCount);
    }


    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
<<<<<<< HEAD
      return numLeaves( _root );
    }

    public int numLeaves(TreeNode stRoot){
      if (stRoot == null){
        return 0;
      } else if (stRoot.getLeft() == null && stRoot.getRight() == null){
        return 1;
      }
      return numLeaves(stRoot.getLeft()) + numLeaves(stRoot.getRight());
    }

=======
    	TreeNode _currNode = _root;
      int countLeaves = 0;
      while (_currNode != null){
        _currNode = _currNode.getLeft();
      }
      countLeaves++
      _currNode = _root;
      while (_currNode != null){
        _currNode = _currNode.getRight();
        countLeaves++;
      }
      return countLeaves + 1;
    }


>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154
  //main method for testing
  public static void main( String[] args )
  {
    BST arbol = new BST();

    //PROTIP: sketch state of tree after each insertion
    //        ...BEFORE executing these.
    arbol.insert( 4 );
    arbol.insert( 2 );
    arbol.insert( 5 );
    arbol.insert( 6 );
    arbol.insert( 1 );
    arbol.insert( 3 );
<<<<<<< HEAD
    arbol.insert( 0 );
    arbol.insert( 2 );
    arbol.insert( 4 );
=======
>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154

    System.out.println( "\n-----------------------------");
    System.out.println( "pre-order traversal:" );
    arbol.preOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "in-order traversal:" );
    arbol.inOrderTrav();

    System.out.println( "\n-----------------------------");
    System.out.println( "post-order traversal:" );
    arbol.postOrderTrav();

    System.out.println( "\n-----------------------------");
<<<<<<< HEAD

    System.out.println("Testing numLeaves().....");
    System.out.print(arbol.numLeaves()); // expected 3

    System.out.println( "\n-----------------------------");

    System.out.println("Testing search().....");
    System.out.println(arbol.search(2).getValue()); 
    System.out.println(arbol.search(7)); //expected null 

=======
>>>>>>> 151f68e632a68542a2cce48c076fb4fb29e73154
    /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



    /**
       EXPECTED OUTPUT:
       -----------------------------
       pre-order traversal:
       4 2 1 3 5 6 
       -----------------------------
       in-order traversal:
       1 2 3 4 5 6 
       -----------------------------
       post-order traversal:
       1 3 2 6 5 4 
       -----------------------------
    */
  }

}//end class
