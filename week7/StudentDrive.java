package week7;

public class StudentDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("ÕÅÈý","17671012782","1904240626");
		Student stu2 = new Student("ÕÅËÄ","17671012783","1904240624");
		stu1.displayStudent();
		stu2.displayStudent();
		stu1.setName("ÍõÎå");
		System.out.println(stu1.getName());
		System.out.println(stu1.getPhoneNumbers());
		System.out.println(stu1.getStudentNumbers());
		stu1.displayStudent();

	}

}
