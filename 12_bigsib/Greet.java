/*

Ziying Jian, Scruffy Jr.
APCS
HW12 -- On Elder Individualty and the Elimination of Radio Fuzz
2005-10-05

DISCOVERIES:
* an instance variable can be tied to a class
* System.out.print requires a VOID type
* return requires the type of value it is (i.e. int, String, etc.)
* You declare an instance varibale using "class varName = new class();"

UNRESOLVED MYSTERIES:
* What is an instance variable?
* How do we implement the first part of the homework without getting a static err?

*/


public class Greet {
        public static void main (String[] args){
		String greeting;

	BigSib richard = new BigSib(); // instance var
	richard.setHelloMsg("Word up"); 

	greeting = richard.greet("freshman"); 
	System.out.println(greeting);
        }                               

}
