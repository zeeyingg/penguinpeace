// Team Up2U (Ziying Jian, Emily Ortiz, Kartik Vanjani, Scruffy, Applesauce, Krrish)
// APCS
// HW20 - External Audit
// 2021-10-20

/*
DISCO
* Victim's deposit method  doesn't compile with System.out.println(ba.deposit(100));
 their error shows that void type can't be compiled  
* A method must have a direct print statement or String type in order to print out text

QCC
* Does Nacho Patcho have a functionality that would allow one to view just 
the balance after a withdraw or deposit without the need to view the entire account info?
* What is the purpose of short casting in this case?
* How should authenticate be implemented?

*/

public class Teller {
	// TEST CASES, courtesy of team KLEH (pd8). Idea for casting to "short" courtesy of Clueless Cats (pd8)
	public static void main( String[] args ) {
		BankAccount ba = new BankAccount();
		ba.setName("A");
		ba.setPassword("password");
		ba.setPIN((short) 1234);
		ba.setID(123456789);
		ba.setBalance(500);
		ba.deposit(200);
		ba.withdraw(100);
		String accinfo = ba.toString();
		System.out.println(accinfo);

		System.out.println("\nDeposit test:");
		System.out.println(ba.deposit(1000) + " (should be 1100)");
		System.out.println(ba.deposit(-1000) + "(should be -900 or yield error)"); 
	}//end main()

}
