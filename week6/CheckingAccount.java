package week6;

public class CheckingAccount {
	private double ServiceCharge;
	
	public CheckingAccount() {
		super();
	}
	public CheckingAccount(double ServiceCharge) {
		this.ServiceCharge = ServiceCharge;
	}
	public double getServiceCharge(){
		return this.ServiceCharge;
	}	
	public void setServiceCharge(double ServiceCharge){
		this.ServiceCharge = ServiceCharge;
	}
}
