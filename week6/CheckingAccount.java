package week6;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;
	
	public CheckingAccount(){
		super();
	}
	
	public CheckingAccount(String accountNum, double serviceCharge){
		super(accountNum, 0);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	public void accessServiceCharge() {
		super.setBalance(super.getBalance() - this.getServiceCharge());
	}
	
	public String toString() {
		String msg;
		msg = "¿¨ºÅ: " + super.getAccountNum() + "\n";
		msg += "Óà¶î: " + super.getBalance() + "\n";
		msg += "ÔÂ·þÎñ·Ñ: " + this.getServiceCharge() + "\n";
		return msg;
	}
}