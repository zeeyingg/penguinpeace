/*

Ziying Jian, Scruffy Jr.
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06

DISCOVERIES:
* constructors essentially do 2 steps in one in this case; concise
* constructors work like methods without the header
* constructors must be on a different class wheras instance variables just need to be declared outside of a method

UNRESOLVED MYSTERIES:
* What are some of the real-world applications of constructor? What are they mainly used for?
* Are there examples of when an instance variable will be more useful than a constructor and vice versa?
* Why do constructors have to be public?

*/


public class Greet {
        public static void main (String[] args){
		String greeting;

	BigSib richard = new BigSib("Word up"); // declares and calls constructor
	greeting = richard.greet("freshman"); 
	System.out.println(greeting);

	BigSib spaceman = new BigSib("Salutation");
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
