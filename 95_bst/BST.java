/**
 * Eddie's Fanclub :: Ziying Jian, Andrey Sokolov, Joshua Gao
 * APCS pd08
 * HW95 -- Algorithm as Data Structure
 * 2022-05-09f
 * time spent: 2 hrs
 * 
 * DISCO
 * We used the same helper for a few of the in-order and pre-order ops (think simple, think SMART)
 * 
 * QCC
 * What do we do if the value inserted is the same as the value of the root?
 */

/**
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
 * 
   1. a perfect binary tree has 2^n-1 nodes
   2. at each level, a perfect binary tree has 2^d nodes
   3. height of a complete binary tree w/ n nodes is log_2(n) + 1
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
  public BST()
  {
    _root = null;
  }

  /**
   * overloaded
   */
  public BST( int newVal )
  {
    _root = new TreeNode(newVal);
  }

  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    if(_root == null){
      _root = new TreeNode( newVal );
    } else{
      insert( _root, new TreeNode(newVal));
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    if(stRoot.getValue() < newNode.getValue()){ //check the right
      if(stRoot.getRight() == null){ // if the node is the last node
        stRoot.setRight(newNode); // stRoot: sets the value of the right to the new node
        newNode.setLeft(stRoot); // newNode: sets the value of the left to the stRoot
      } else if (stRoot.getRight().getValue() > newNode.getValue()) {
        TreeNode _temp = stRoot.getRight();
        stRoot.setRight(newNode);
        newNode.setRight(_temp);
        newNode.setLeft(stRoot);
        _temp.setLeft(newNode);
      } else {
        insert( stRoot.getRight(), newNode);
      }
    } else if(stRoot.getValue() > newNode.getValue()){ //check the left
      if(stRoot.getLeft() == null){  // if the node is the last node
        stRoot.setLeft(newNode); // stRoot: sets the value of the left to the new node
        newNode.setRight(stRoot); // newNode: sets the value of the right to the stRoot
      } else if (stRoot.getLeft().getValue() < newNode.getValue()) {
        TreeNode _temp = stRoot.getLeft(); // does the same but with extra steps if the node is not the last node
        stRoot.setLeft(newNode); 
        newNode.setLeft(_temp);
        newNode.setRight(stRoot);
        _temp.setRight(newNode);
      } else {
        insert( stRoot.getLeft(), newNode); // recurse
      }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~
  //helper traversal methods
  public void TravLeft( TreeNode _currNode ){
    System.out.print(_currNode.getValue() + " ");

    if (_currNode.getLeft() != null){
      TravLeft(_currNode.getLeft());     
    } else return; // traverse until last node is reached
  }

  public void TravRight( TreeNode _currNode ){
    System.out.print(_currNode.getValue() + " ");
  
    if (_currNode.getRight() != null){
      TravRight(_currNode.getRight());    
    } else return; // traverse until last node is reached
   }
   
  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    System.out.print(_root.getValue() + " ");
    if(_root.getLeft() != null ){
      TravLeft( _root.getLeft() );
    }
    if(_root.getRight() != null ){
      TravRight( _root.getRight() );
    }
  }
  
  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    TreeNode _temp = _root;
    while(_temp.getLeft() != null){
      _temp = _temp.getLeft();
    }
    System.out.print(_temp.getValue() + " ");
    TravRight( _temp.getRight());    
  }

  // //recurse left, recurse right, process root
  public void postOrderTrav()
  {
     TreeNode _tempLeft = _root;
    while(_tempLeft.getLeft() != null){ //goes to the left of the left subtree
      _tempLeft = _tempLeft.getLeft();
    }
    while(_tempLeft != _root) { //processes up to the root
      System.out.print(_tempLeft.getValue() + " ");
      _tempLeft = _tempLeft.getRight();
    }
    TravRight( _root.getRight());    
    System.out.print(_root.getValue() + " ");
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  //toString
//  public String toString(){
//    return "sussy";
//  }


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
      arbol.insert( 0 );
      System.out.println(arbol);

      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();
      
      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();
      
      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();
      
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      System.out.println( "\n-----------------------------");
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
