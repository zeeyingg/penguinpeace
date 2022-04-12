 public class Tester{

     public String toString(){
        String retStr = "FRONT->";
        LLNode<QUASAR> tmp = _head; //init tr
        for( int i=0; i <size();i++) {
            retStr += tmp.getCargo().toString();
            if(i==nextElement){
                retStr+="(NEXT)";
            } 
            retStr += "->";
            tmp = tmp.getNext();
        }
        retStr += "NULL";
        return retStr;        
    }
    
 public static void main( String[] args )
  {

    
    Queue<String> PirateQueue = new ALQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow testing peekFront()..."); 
    System.out.println( PirateQueue.peekFront() ); //for testing toString()...


    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main
 }