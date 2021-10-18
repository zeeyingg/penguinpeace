// Team Up2U (Ziying Jian, Emily Ortiz, Kartik Vanjani, Scruffy, Applesauce, Krrish)
// APCS
// HW18 - Bank Account
// 2021-10-17

/*
DISCOVERIES:
- Only static methods are executable


QCC:
- Can you invoke a method in the same class without using static?

Team Up2U's Latest and Greatest Q2 Response:
When an object is created or an instance of a class is generated through new ClassName();
a constructor is created.

Team Up2U's Latest and Greatest Q3 Response:
Create an object using className objName = new className, running
System.out.println(objName), and checking whether there is a valid output in the terminal.
*/


public class BankAccount {
    // instance vars    
    private String name;
    private String password;
    private int pin;
    private int accNumber;
    private double balance;

    // methods
    public String setFullName(String nameInput){
       return  name = nameInput;
    }

    public String  setPassword(String passwordInput){
       return  password = passwordInput;
    }

    public int setPin(int pinInput){
       return  pin = pinInput;
        // consider adding a char limit to pin
    }

    public int setAccNumber(int accInput){
       checkAccNumber(accInput);
	return  accNumber = accInput;
    }

	// helper function to check whether account # are correct digits
	public void checkAccNumber(int accInput){
	if (100000000 <= accInput <= 99999998) {
		return accInput;
	} else { 
		accNumber = 99999999;
		return ("Your number must be a 9-digit value.");	
		}
	}

    public String accountInfo(){
	String retStr = "\nAccount info: \n=============";
	retStr += "\n Name: " + name;
	retStr = retStr + "\nPassword: " + password;
   	 retStr = retStr + "\nPIN: " + pin;
   	 retStr = retStr + "\nAccount Number: " + accNumber;
   	 retStr = retStr + "\nBalance: " + balance;
   	 retStr = retStr + "\n=======================";
   	 return retStr;
    }

    /* EXPECTED OUTPUT:

    BANK ACCOUNT INFO
    Name: Rich Rick 
    Account #: 1
    Balance: 100.0

    */
    
    // withdraws amt if PIN & pswrd are both correct 
    public void withdraw(double amount, int pinInput, String passwordInput){
        if (pinInput == pin && passwordInput == password) { 
            if (amount > balance) { // checks for exceeding amounts
                System.out.println("Your amount is invalid. Please retry.");
            } else {
                balance -= amount;
                System.out.println("Your new balance is " + balance);
            }
        }
        else {
            System.out.println("Invalid PIN or password. Please retry.");
        }
    }

    // deposits amt if PIN is correct
    public void deposit(double amount, int pinInput){
        if (pinInput == pin){ // requires only PIN to be correct
            if (amount < 0) { // checks for negative amounts
                System.out.println("Your amount is invalid. Please retry.");
            } else {
                balance += amount;
                System.out.println("Your new balance is " + balance);
            }
        }

        else {
            System.out.println("Invalid PIN. Please retry.");
        }
    }

    // deposits amt if pswrd is correct
    public void deposit(double amount, String passwordInput){
        if (passwordInput == password){ // requires only psswrd to be correct
            if (amount < 0) {
                System.out.println("Your amount is invalid. Please retry.");
            } else {
                balance += amount;
                System.out.println("Your new balance is " + balance);
            }
        }

        else {
            System.out.println("Invalid password. Please retry.");
        }
    }

    public static void main(String[] args) {
    BankAccount account = new BankAccount();

	account.setFullName("Rich Rick");
	account.setPassword("123456");
	account.setPin(1234);
	account.setAccNumber(1); // invoking a method through an object
				// inspired by Team Nacho Patcho

    System.out.println(account.accountInfo());

    System.out.println();
    System.out.println("Depositing: ");
    account.deposit(100.0, 1234);
        
    System.out.println("Depositing with negative amount: ");
    account.deposit(-100,1234);
        
    System.out.println("Depositing with wrong PIN: ");
    account.deposit(100, 0000);
        
    System.out.println("Depositing with wrong password: ");
    account.deposit(100, "wrongPass");

    System.out.println();
    System.out.println("Withdraw: ");
    account.withdraw(100, 1234, "123456");
        
    System.out.println("Withdrawing with negative amount: ");
    account.withdraw(600, 1234, "123456");
        
    System.out.println("Withdrawing with wrong PIN: ");
    account.withdraw(2, 0000, "123456");
        
    System.out.println("Withdrawing with wrong password: ");
    account.withdraw(2, 123456, "wrongPass");

    }
}
