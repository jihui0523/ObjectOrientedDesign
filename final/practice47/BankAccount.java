
public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount() {
		owner="모름";
		balance=-1;
	}
	 
	public BankAccount(String owner, int balance) {
		this.owner=owner;
		this.balance=balance;
	}
	 
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String toString() {
		 return "		"+getOwner()+"		"+getBalance();
	}
	
	public void deposit(int m) {
		this.balance+=m;
	}
	
	public void withdraw(int m) {
		this.balance-=m;
	}
}
