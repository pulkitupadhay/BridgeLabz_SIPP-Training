package keyworddemo.staticfinalthis;

public class BankAccount {
	static String BankName="State Bank Of India";
	static int totalaccounts=0;
	
	final int accountNumber;
	String accountHolder;
	
	BankAccount(int accountNumber,String accountHolder){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		totalaccounts++;
	}
	
	static int getTotalAccounts() {
		return totalaccounts;
	}
	
	void display() {
		if(this instanceof BankAccount) {
			System.out.println("Bank: "+BankName);
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Account Holder: "+accountHolder);
		}
	}
	
	public static void main(String[] args) {
		BankAccount ba1=new BankAccount(1001,"Bob");
		BankAccount ba2=new BankAccount(1002,"Alice");
		
		ba1.display();
		ba2.display();
		System.out.println(BankAccount.getTotalAccounts());
		
	}
}
