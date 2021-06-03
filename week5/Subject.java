package week5;

public class Subject {
	private String subjectid;
	private String subjectname;
	
	public Subject() {
		super();
	}
	
	public Subject(String subjectid, String subjectname) {
		super();
		this.subjectid = subjectid;
		this.subjectname = subjectname;
	}
	
	public String getId() {
		return subjectid;
	}
	public void setId(String subjectid) {
		this.subjectid = subjectid;
	}
	public String getName() {
		return subjectname;
	}
	public void setName(String subjectname) {
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "课程代码:" + subjectid + "\t 课程名:" + subjectname;
	}
		
}
