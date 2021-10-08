/*

TNPG: ziggy's fishball amoebaly rangers (Emily Ortiz - Applesauce; Ziying Jian - Scruffy; Faiza Huda - Turthful Tom; Nina Jiang - Alpaca)
APCS
HW14 - Customize Your Creation
2021-10-07

DISCO:
* The default constructor can be overwritten
* Default constructor doesn't take a paramter
* Overloaded constructor takes in a parameter

QCC:
* What is the purpose of a default constructor vs. overloaded constructor?
* WHen would one be used over the other?

*/


public class Greet {
        public static void main (String[] args){
		String greeting;

	BigSib richard = new BigSib("Word up"); // declares and calls constructor
	greeting = richard.greet("freshman"); 
	System.out.println(greeting);

	BigSib spaceman = new BigSib("Salutations");
	greeting = spaceman.greet("Dr.Spaceman");
	System.out.println(greeting);

	BigSib kong = new BigSib("Hey ya");
	greeting = kong.greet("Kong Foey");
	System.out.println(greeting);

	BigSib mom = new BigSib("Sup");
	greeting = mom.greet("mom");
	System.out.println(greeting);        
	}                               

}
