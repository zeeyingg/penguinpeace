/*

Ziying Jian, Scruffy Jr.
APCS
HW12 -- On Elder Individualty and the Elimination of Radio Fuzz
2021-10-05

DISCOVERIES:
* an instance variable can be tied to a class
* System.out.print requires a VOID type
* return requires the type of value it is (i.e. int, String, etc.)
* You can declare an instance varibale using "class varName = new class();"

UNRESOLVED MYSTERIES:
* What is an instance variable?
* Why does the variable require static?

*/

public class Greet {
        public static void main (String[] args){
		String greeting;

	BigSib richard = new BigSib(); // instance var
	richard.setHelloMsg("Word up"); 

	greeting = richard.greet("freshman"); 
	System.out.println(greeting);

	BigSib spaceman = new BigSib();
	spaceman.setHelloMsg("Salutations");
	System.out.println(spaceman.greet("Dr.Spaceman"));

	BigSib kong = new BigSib();
	kong.setHelloMsg("Hey ya");
	System.out.println(kong.greet("Kong Foey"));

	BigSib mom = new BigSib();
	mom.setHelloMsg("Sup");
	System.out.println(mom.greet("mom"));        
	}                               

}
