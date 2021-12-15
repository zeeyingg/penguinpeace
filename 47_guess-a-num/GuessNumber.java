// 3 Lucky Duckies: Gloria Lee, Nora Miller, Ziying Jian
// APCS pd8
// HW47 -- Guess Again
// 2021-12-14
// time spent: 1 hr

/***
    DISCO:
    - You can't use break without it being in a while loop or a for loop.
    - (Reminder to selves: you can declare multiple variables of the same type and visibility together)
    - In a void method, return (without anything after it) just exits the method, rather than actually returning anything.

    QCC:
    - We still have a lot to learn about the nature of the try/catch block?
    - Is the way that we generate a random target number correct?
    - Is there a categorical way of dealing with execptions that isn't a try-catch loop (or extraordinarily long?)
    - Why would have an if/else statement not have accomplished to the same degree as the try/catch block?
 ***/
import java.util.Scanner;

public class GuessNumber
{
  
  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 0;
    //pick random number in range [a,b]
    _target = (int)(Math.random()*(b+1-a)+ a );
    //diagonistic print statement
    System.out.println("Target: " +_target);
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
    public void playRec()
  {

    int guess = 0;
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    _guessCtr +=1;


    try{
      guess = sc.nextInt();
    }
    catch (Exception e){
      System.out.print("Please rerun this program using an integer value.");
      return;//exits method
    }

    if(guess == _target){
      System.out.println("Correct! It took you "+ _guessCtr + " tries");
      return;
    }
    if(guess > _target){
      _hi = guess - 1;
      System.out.println("Too high.");
      playRec();
    } else {
      _lo = guess +1;
      System.out.println("Too low.");
      playRec();
    }

  }//end playRec()


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess = 0;

    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");

    try {
         guess = sc.nextInt();
         _guessCtr++;
  } catch (Exception e){
        System.out.println("Please rerun this program using an integer value.");
        return; //exits method
  }
    if (guess == _target) {
      System.out.println("Correct! It took " + _guessCtr + " guesses");
      return;
    } else if (guess < _target) { // this is the case in which the user should look above their guess
      _lo = guess + 1;
      System.out.println("Too low");
    } else { // the user should now be looking below their guess
      _hi = guess - 1;
      System.out.println("Too high");
    }
  }//end while
}//end playIter


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    playRec();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();
  }

  
}//end class GuessNumber
