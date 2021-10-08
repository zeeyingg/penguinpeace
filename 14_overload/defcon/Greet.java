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
	public static void main(String[] args){
	String greeting;

	BigSib richard = new BigSib();
	BigSib grizz = new BigSib();
	BigSib dotCom = new BigSib();
	BigSib tracy = new BigSib();

        greeting = richard.greet("freshman");
        System.out.println(greeting);

        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);

        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);

        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    } // end main()
} // end Greet
