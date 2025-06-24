 package Constructor;

class BankAccount {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount(int accountNumber,String accountHolder,double balacne){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public double getbalacne() {
		return balance;
	}
	
	public void dispalydetails() {
		System.out.println("Account Number:"+accountNumber+", Account Holder Name:"+accountHolder+", Account Bablance:"+balance);
	}
}

class SavingsAccount extends BankAccount{
	SavingsAccount(int accountNumber,String accountHolder,double balance){
		super(accountNumber,accountHolder,balance);
	}
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(1234567890,"pulkit",10000000000.0);
		sa.dispalydetails();
	}
}
