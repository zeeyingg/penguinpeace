/*
Nacho Patcho | Gabriel Thompson, Faiza Huda, Jacob Ng, Truthful Tom, Iggy, PreGuac
APCS
HW19 -- Mo Money Mo Problems ...MORE AWESOME
2021-10-18
*/

/*
DISCO:
 - If you want to make an argument to a function be of the "short" type, it must be manually cast to "short"
 - We discovered that we don't need a constructor for this asssignment
 - As well as writing methods to set things like the password, you can also just run something like
   ba.accPassword = "password123", and this will set the variable.
QCC:
 - How can you do formatted strings (like printf) without printing? i.e. how could you apply the same formatting to
   a string literal, or a variable, without using System.out.printf?
 - Is there an easier way to accept an input value of the short primitive type, without writing it as an integer
   literal and casting to short?
 - What is the purpose of a mutator? Is it just a colloquial term for a method that changes the value of a variable
   and returns the old value of the changed variable?
 - What's the point of writing a setPassword, setID, etc. method when you could just do ba.accPassword = "password"?
*/

public class BankAccount {
	// initializes instance variables
	private String accHolderName;
	private String accPassword;
	private double balance;
	private short pin;
	private int accID;

	// default constructor, which sets blank values for all instance variables (if no params are given)
	public BankAccount() {
		accHolderName = "";
		accPassword = "";
		balance = 0.0;
		pin = (short) 0;
		accID = 0;
	}

	public String setName( String name ) {
		accHolderName = name;
		return name;
	}

	public void setID( int id ) {
		if (100000000 <= id && id <= 999999998) {
			accID = id;
		} else {
			accID = 999999999;
			System.out.println("Error: ID (" + id + ") not a valid 9-digit number. The ID is now 999999999");
		}
	}

	public void setBalance( int bal ) {
		balance = bal;
	}

	public void setPassword( String pwd ) {
		accPassword = pwd;
	}

	public void setPIN( short pinNum ) {
		if ((short) 1000 <= pinNum && pinNum <= (short) 9998) {
			pin = pinNum;
		} else {
			pin = 9999;
			System.out.println("Error: PIN (" + pinNum + ") is not a valid 4-digit number. The PIN is now 9999");
		}
	}

	// prints out values of all instance variables. we added extra whitespace so everything aligns.
	public String toString() {
		String output = "";
		output += "=======================\n"; // divider to distinguish between other text
		output += "Account holder name: " + accHolderName + "\n";
                output += "Account password:    " + accPassword + "\n";
                output += "Account balance:     " + balance + "\n";
                output += "PIN number:          " + pin + "\n";
                output += "Account ID:          " + accID + "\n";
		output += "=======================\n";
		return output;
	}

	// function to add a given amount of money to the balance
	public void deposit( double amount ) {
		balance += amount;
	}

	// function to remove a given amount of money from the balance
	public boolean withdraw( double amount ) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			System.out.printf("Your account does not have enough money ($%.2f) to withdraw $%.2f.\n", balance, amount);
			return false;
		}
	}

	public boolean authenticate( int id, String password ) {
		return (id == accID) && (password == accPassword);
	}

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
		// our test cases for authenticate() and withdraw error messages
		System.out.println("\nAuthentication tests:");
		System.out.println("Authentication: " + ba.authenticate(123456789, "password") + " (should be true)");
		System.out.println("Authentication: " + ba.authenticate(347934573, "bigchungus") + " (should be false)");
		System.out.println("\nWithdrawal test:");
		System.out.println(ba.withdraw(1000) + " (should yield error)");
	}//end main()

}
