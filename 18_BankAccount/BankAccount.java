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
    private String name;
    private String password;
    private int pin;
    private int accNumber;
    private double balance;

    public void setFullName(String nameInput){
        name = nameInput;
    }

    public void setPassword(String passwordInput){
        password = passwordInput;
    }

    public void setPin(int pinInput){
        pin = pinInput;
        // consider adding a char limit to pin
    }

    public void setAccNumber(int accInput){
        accNumber = accInput;
    }

    public void accountInfo(){
        System.out.println("BANK ACCOUNT INFO");
        System.out.println("Name: " + name);
        System.out.println("Account #: "+ accNumber);
        System.out.println("Balance: " + balance);
    }

    /* EXPECTED OUTPUT:

    BANK ACCOUNT INFO
    Name: Rich Rick
    Account #: 1
    Balance: 100.0

    */

    public void withdraw(double amount, int pinInput, String passwordInput){
        if (pinInput == pin && passwordInput == password) { // requires both PIN and pswrd to be correct
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

    account.name = "Rich Rick";
    account.password = "123456";
    account.pin = 123456;
    account.accNumber = 1;
    account.balance = 100.0;

    account.accountInfo();

    System.out.println();
    System.out.println("Depositing: ");
    account.deposit(100, 123456);
    System.out.println("Depositing with negative amount: ");
    account.deposit(-100,123456);
    System.out.println("Depositing with wrong PIN: ");
    account.deposit(100, 0000);
    System.out.println("Depositing with wrong password: ");
    account.deposit(100, "wrongPass");

    System.out.println();
    System.out.println("Withdraw: ");
    account.withdraw(100, 123456, "123456");
    System.out.println("Withdrawing with negative amount: ");
    account.withdraw(600, 123456, "123456");
    System.out.println("Withdrawing with wrong PIN: ");
    account.withdraw(2, 0000, "123456");
    System.out.println("Withdrawing with wrong password: ");
    account.withdraw(2, 123456, "wrongPass");

    }
}
