package week5;

import java.util.Scanner;

public class Drive {
	
	private static ClassList list = null;
	
	public static void main(String[] args) {
		int choose = menu();
		while(choose != 3){
			switch(choose){
			case 1:createList();break;
			case 2:printList();break;
			default:System.out.println("Error!");
			}
			choose = menu();
		}
		System.out.println("Wellcome!");
		
	}
	
	public static int menu(){
		int choose = 0;
		System.out.println("=========Menu=========");
		System.out.println("1.createList.");
		System.out.println("2.printList.");
		System.out.println("3.Exit.");
		System.out.println("Choose:1-3.");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
	
	public static void createList(){
		Scanner scan = new Scanner(System.in);
		if(list != null) {
			System.out.print("已创建！是否重创？(y/n)");
			String again = scan.next();
			if(again.equalsIgnoreCase("n")){
				return;
			}
		}
		
		System.out.print("输入学年:");
		int year = scan.nextInt();
		System.out.print("输入学期(1, 2):");
		int semester = scan.nextInt();
		System.out.print("输入课程代码:");
		String subjectid = scan.next();
		System.out.print("输入课程名称:");
		String subjectname=scan.next();
		
		Subject subj = new Subject(subjectid,subjectname);
		
		System.out.print("please input the stu1's Id:");
		String studentid1=scan.next();
		System.out.print("Please input the stu1's firstname1:");
		String firstname1=scan.next();
		System.out.print("Please input the stu1's lastname1:");
		String lastname1=scan.next();
		
		System.out.print("please input the stu2's Id:");
		String studentid2=scan.next();
		System.out.print("Please input the stu2's firstname2:");
		String firstname2=scan.next();
		System.out.print("Please input the stu2's lastname2:");
		String lastname2=scan.next();
		
		Student s1 = new Student(studentid1, firstname1, lastname1);
		Student s2 = new Student(studentid2, firstname2, lastname2);
		list = new ClassList(year, semester, subj, s1, s2);
		
		
	}
	
	public static void printList(){
		if(list == null) {
			System.out.println("先执行第一步!");
			return;
			}
		System.out.println(list.toString());
		}
	
}

