package week6;

class BankAccount {
	private String accountNum;
	private double balance;
	
	BankAccount(){
		
	}
	
	BankAccount(String accountNum, double balance){
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}