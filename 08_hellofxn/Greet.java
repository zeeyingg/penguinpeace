/*
Ziying Jian, Scruffy Jr.
APCS
HW08 -- Refactor Freshie Zero/Java/Using string concatenation to greet
2021-10-01



DISCOVERIES:
- cocatenate strings using "+" operand
- java class names are case-senstive and must align with the file name in order to be compiled and run
- cannot print a string twice in two different fxn calls (i.e. System.out.println in main and System.out.println in greet)
- replacing void with String changes the method to only output a string, the output identifier  doesn't have to align with the parameter type
- you make block comments using /* message * / 

UNRESOLVED QUESTIONS:
I know there is a shorter, more efficient way of cocatenating strings using f-strings. How would we implement that in here?
*/


public class Greet {
	public static void main (String[] args){
	//	System.out.println("No hablo queso");
		System.out.println(greet("Ziying"));
		System.out.println(greet("Kartic"));
		System.out.println(greet("Ari"));
	}				

	public static String greet (String name){
		return("Why, hello there, " + name + ". How do you do?");
	}
}
