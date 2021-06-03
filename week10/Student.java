  
package week10;

class Student {
	private String sno;
	private String sname;
	private String gender;
	private double score;
	
	Student() {
		
	}
	
	Student(String sno, String sname, String gender){
		this.sname = sname;
		this.sno = sno;
		this.gender = gender;
		this.score = 0;
	}

	public String getSno() {
		return sno;
	}

	@Override
	public String toString() {
		return sno + "\t" + sname + "\t" + gender + "\t" + score + "\t";
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}