package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class Resultdao {
	public ArrayList<Student> createStudent(){
		ArrayList<Student> list = new ArrayList<Student>();
		String msg = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生基本信息：（每个学生一行，输入格式为“学号，姓名，性别”，如“001，张 三，男”，当输入“end”时结束输入）");
		while(true) {
			msg = scan.nextLine();
			if(msg.equals("end"))break;
			msg = msg.replace(" ", "");
			String section[] = msg.split(",|，");
			Student s = new Student(section[0], section[1], section[2]);
			list.add(s);
		}
		return list;
	}
	
	public ArrayList<Result> createResult(){
		ArrayList<Result> list = new ArrayList<Result>();
		String msg = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生成绩：（每个成绩一行，输入格式为“学号，课程名称，成绩”，如“001，Java， 90”，当输入“end”时结束输入）");
		while(true) {
			msg = scan.nextLine();
			if(msg.equals("end"))break;
			msg = msg.replace(" ", "");
			String section[] = msg.split(",|，");
			double score = Double.parseDouble(section[2]);
			Result s = new Result(section[0], section[1], score);
			list.add(s);
		}
		return list;
	}
	
	public void display(ArrayList<Student> student, ArrayList<Result> result) {
		ArrayList<Student> sList = new ArrayList<Student>();
		ArrayList<Result> rList = new ArrayList<Result>();
		int score,num;
		System.out.println("按学生统计：");
		System.out.println("学号\t姓名\t性别\t平均分");
		for (Student student2 : student) {
			score = num = 0;
			for (Result result2 : result) 
				if(student2.getSno().equals(result2.getSno())) {
					score += result2.getScore();
					num++;
				}
			if(!(score == num))
			student2.setScore(score/num);
			System.out.println(student2.toString());
		}
		
		System.out.println("按课程统计：");
		System.out.println("课程\t平均分");
		String cname="";
		for (Result result3 : result) {
			score = num = 0;
			if(result3.getCname().equals(cname))continue;
			cname = result3.getCname();
			for (Result result4 : result) 
				if(result3.getCname().equals(result4.getCname())) {
					score += result4.getScore();
					num++;
				}
			double average = score / num;
			String msg = cname +"\t"+average;
			System.out.println(msg);
		}
	}
}