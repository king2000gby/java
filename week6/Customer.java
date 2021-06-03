package week6;

public class Customer {
	private String ssn;
	private String name;
	private SavingAccount savingAccount;
	private CheckingAccount checkingAccount;

	Customer() {

	}

	Customer(String ssn, String name, CheckingAccount checkingAccount) {
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
	}

	Customer(String ssn, String name, SavingAccount savingAccount) {
		this.ssn = ssn;
		this.name = name;
		this.savingAccount = savingAccount;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public String toString() {
		String msg;
		msg = "SSNºÅ: " + this.ssn + "\n";
		msg += "ÐÕÃû: " + this.name + "\n";
		if (savingAccount != null)
			msg += savingAccount.toString();
		else
			msg += checkingAccount.toString();
		return msg;
	}
}