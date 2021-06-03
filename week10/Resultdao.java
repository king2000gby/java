package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class Resultdao {
	public ArrayList<Student> createStudent(){
		ArrayList<Student> list = new ArrayList<Student>();
		String msg = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��������Ϣ����ÿ��ѧ��һ�У������ʽΪ��ѧ�ţ��������Ա𡱣��硰001���� �����С��������롰end��ʱ�������룩");
		while(true) {
			msg = scan.nextLine();
			if(msg.equals("end"))break;
			msg = msg.replace(" ", "");
			String section[] = msg.split(",|��");
			Student s = new Student(section[0], section[1], section[2]);
			list.add(s);
		}
		return list;
	}
	
	public ArrayList<Result> createResult(){
		ArrayList<Result> list = new ArrayList<Result>();
		String msg = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�����ÿ���ɼ�һ�У������ʽΪ��ѧ�ţ��γ����ƣ��ɼ������硰001��Java�� 90���������롰end��ʱ�������룩");
		while(true) {
			msg = scan.nextLine();
			if(msg.equals("end"))break;
			msg = msg.replace(" ", "");
			String section[] = msg.split(",|��");
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
		System.out.println("��ѧ��ͳ�ƣ�");
		System.out.println("ѧ��\t����\t�Ա�\tƽ����");
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
		
		System.out.println("���γ�ͳ�ƣ�");
		System.out.println("�γ�\tƽ����");
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