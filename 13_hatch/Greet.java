/*

Ziying Jian, Scruffy Jr.
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06

DISCOVERIES:
* constructors essentially do 2 steps in one; a more concsie way of writing code
* constructors work like methods without the header

UNRESOLVED MYSTERIES:
* Are there examples of when an instance variable will be more useful than a constructor?
* Why do constructors have to be public?
* Constructors must be on a different class wheras instance variables just need to be declared outside of the method.
*/


public class Greet {
        public static void main (String[] args){
		String greeting;

	BigSib richard = new BigSib("Word up"); 
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
