package week7;

public class Student {
	private String name;
	private String phoneNumbers;
	private String studentNumbers;
	
	public Student(){
		
	}
	
	public Student(String name,String phoneNumbers,String studentNumbers){
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.studentNumbers = studentNumbers;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setPhoneNumbers(String phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}
	public String getPhoneNumbers(){
		return this.phoneNumbers;
	}
	
	public void setStudentNumbers(String studentNumbers){
		this.studentNumbers = studentNumbers;
	}
	public String getStudentNumbers(){
		return this.studentNumbers;
	}
	
	public void displayStudent(){
		System.out.println("name:"+this.name+"   phoneNumbers:"+this.phoneNumbers+"   studentNumbers:"+this.studentNumbers);
		
	}

}
