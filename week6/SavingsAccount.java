package week6;

public class SavingAccount extends BankAccount{
	private double interestRate;
	
	public SavingAccount(){
		super();
	}
	
	public SavingAccount(String accountNum, double interestRate){
		super(accountNum, 0);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + this.getInterestRate()));
	}

	
	public String toString() {
		String msg;
		msg = "¿¨ºÅ: " + super.getAccountNum() + "\n";
		msg += "Óà¶î: " + super.getBalance() + "\n";
		msg += "ÔÂÀûÂÊ: " + this.getInterestRate() + "\n";
		return msg;
	}
	
}
