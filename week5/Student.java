package week5;

public class Student {
	private String studentid;
	private String firstname;
	private String lastname;
	
	public Student() {
		super();
	}	
	public Student(String studentid,String firstname,String lastname){
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getId(){
		return this.studentid;
	}
	
	public void setId(String studentid){
		this.studentid = studentid;
	}
	
	public String getfirstName(){
		return this.firstname;
	}
	
	public void setfirstName(String firstname){
		this.firstname = firstname;
	}
	
	public String getlastName(){
		return this.lastname;
	}
	
	public void setlastName(String lastname){
		this.lastname = lastname;
	}
	
	public String toString(){
		return studentid + "\t" + lastname;
	}
}