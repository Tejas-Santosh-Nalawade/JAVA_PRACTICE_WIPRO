package Hello;

public class BankAccount {

	int accountNumber = 0;
	String accountHolder = "";
	int balance = 0;
	
	BankAccount(int acc, String acch, int bal){
		this.accountNumber = acc;
		this.accountHolder = acch;
		this.balance = bal;		
	}
	
	public BankAccount() {
		// Default Constructor
	}

	public void deposit(int cash) {
		this.balance += cash;
	}
	
	public void withdraw(int cash) {
		if(this.balance < cash) {
			System.out.println("Insufficent Balance");
		}
		else {
			this.balance -= cash;
			System.out.println("Current Balance: " + (balance));
		}
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: " + this.balance);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(12514551, "Naresh", 1);
		b1.deposit(1);
		b1.withdraw(10000);
		b1.checkBalance();
		
	}

}
