/*
Ziying Jian, Scruffy Jr.
APCS
HW09 -- What Are BigSibs Good For?/Java/Invoking a class in a different method
2021-10-01

DISCOVERIES:
- BigSib is a class that stores the method greet; can be compiled without the main() method
- Syntax is class:method(input); - inputs into method in class
- Because greet is a public method in a public class, it can be accessed by other classes

UNRESOLVED QUESTIONS:
Currently, both Greet.java and BigSib.java are situated in the same directory. Will this file be executable if these two files are not in the same directory?
How do these methods interact?
How do these permissions change when switched to private? What is the use of private?
*/


public class Greet {
	public static void main (String[] args){
	//	System.out.println("No hablo queso");
		BigSib.greet("Ziying");
		BigSib.greet("Kartic");
		BigSib.greet("Ari");
	}				

}
