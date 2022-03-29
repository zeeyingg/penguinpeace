// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW83 -- Stack: What Is It Good For?
// 2022-03-30w
// time spent : 0.5 hrs

/*
QCC:
- What is a practical use of allMatched?
- Why can't we just use substring() to flip the string?

DISCO:
- Is there a faster way to implement allMatched?
- We can use the .split() to turn a string into an array of strings.

*/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes pancake = new Latkes(s.length());
    String ans = "";

    //
    for (String str : s.split("")) {
      pancake.push(str);
    }

    int size = pancake.getStackSize();

    // pop list into new list
    for (int i = 0; i < size; i++) {
      ans += pancake.pop();
    }
    return ans;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes waffle = new Latkes(s.length());

    String[] arr = s.split("");

    for (String str : arr) {
      if (arr[0].equals(")") || arr[0].equals("}") || arr[0].equals("]")) {
        return false;
      }
      else if (str.equals("(") || str.equals("{") || str.equals("[") ) {
        waffle.push(str);
      }
       else {
        if (str.equals(")") && waffle.peek().equals("(")) {
          waffle.pop();
        } else if (str.equals("}") && waffle.peek().equals("{")) {
          waffle.pop();
        } else if (str.equals("]") && waffle.peek().equals("[")) {
          waffle.pop();
        }
      }
    }

    return (waffle.getStackSize() == 0);

  }


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
