package week6;

public class Customer {
	private String name;
	private String ssn;
	
	public Customer() {
		super();
	}
	public Customer(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public String getname(){
		return this.name;
	}	
	public void setname(String name){
		this.name = name;
	}
	public String getssn(){
		return this.ssn;
	}	
	public void setssn(String ssn){
		this.ssn = ssn;
	}

}
