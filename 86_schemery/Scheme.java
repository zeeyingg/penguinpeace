// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW86 -- What a Racket // Scheme stuff
// 2022-04-01f
// time spent : 0.5 hrs

/**
DISCO:
- We might need another stack to unload the operation in the parenthesis.

QCC
- Why did we need to typecast the return of evaluate? Shouldn't the element popped from parenNum be a string?
**/

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Convert the String into a list of Strings.
 *   2. Have a for loop that keeps running until we iterate through the entire list. 
 *   3. In each repetition of the for loop : 
 *   4. Push the String into parenNums if the String is a number or open parenthesis.
 *   5. Push the String into operators if the String is a operator
 *   6. If we run into a closed parenthesis, we check whatever operator is on the top of the operators. 
 *   7. Then we create a new stack called numbers.
 *   8. We keep pushing the top element of parenNums into numbers until we hit a open parenthesis.
 *   9. We then run unload() with checked operator and numbers.
 *
 * STACK OF CHOICE: ALStack by Mister George
 * b/c 
 * we chose it by random. 
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    ALStack parenNums = new ALStack();
    ALStack operators = new ALStack();

    String[] arr = expr.split("\\s+"); 

    for (String element : arr) {

      if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")) {
        operators.push(element); 
      } 
      else if (isNumber(element) || element.equals("(")) {
        parenNums.push(element); 
      } 
      else {
        ALStack numbers = new ALStack(); 
          if (operators.peekTop().equals("+")) {
            while (!(parenNums.peekTop().equals("("))) {
              numbers.push(parenNums.pop());
            }
            parenNums.pop();
            parenNums.push(unload(1, numbers));
            operators.pop(); 

          } else if (operators.peekTop().equals("-")) {
            while (!(parenNums.peekTop().equals("("))) {
              numbers.push(parenNums.pop());
            }
            parenNums.pop();
            parenNums.push(unload(2, numbers));
            operators.pop(); 

          } else if (operators.peekTop().equals("*")) {
            while (!(parenNums.peekTop().equals("("))) {
              numbers.push(parenNums.pop());
            }
            parenNums.pop();
            parenNums.push(unload(3, numbers));
            operators.pop();         

          } else {
            while (!(parenNums.peekTop().equals("("))) {
              numbers.push(parenNums.pop());
            }
            parenNums.pop();
            parenNums.push(unload(4, numbers));
            operators.pop(); 
          }
      }
    }

    return "" + parenNums.pop();

  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, ALStack<String> numbers )
  {
        int temp = Integer.parseInt(numbers.peekTop());
        numbers.pop();
        while (!(numbers.isEmpty())) {

          if (op == 1) {

            int tempAdd = Integer.parseInt(numbers.peekTop());
            temp = temp + tempAdd;
            numbers.pop();

          } else if (op == 2) {

            int tempSubtract = Integer.parseInt(numbers.peekTop());
            temp = temp - tempSubtract;
            numbers.pop();

          } else if (op == 3) {

            int tempMultiply = Integer.parseInt(numbers.peekTop());
            temp = temp * tempMultiply;
            numbers.pop();

          } else {
            int tempDivide = Integer.parseInt(numbers.peekTop());
            temp = temp / tempDivide;
            numbers.pop();
          }
        }

        return "" + temp; 

  }//end unload()



  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
    return false;
    }
  }



  //main method for testing
  public static void main( String[] args )
  {


      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
                /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
