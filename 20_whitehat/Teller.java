/*

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
		System.out.println(ba.deposit(-1000) + "(should be -900)"); 
	}//end main()

}
