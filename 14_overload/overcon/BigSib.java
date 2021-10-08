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

public class BigSib {   

	// instanced var
	private String helloMsg; 

	// default constructor
	public BigSib(){
		helloMsg = "Word up";
	}

	// overloaded constructor 
	public BigSib (String msg){		
		 helloMsg = msg;
	}

        public String greet (String name){
		return(helloMsg + " " +  name);

        }
}
