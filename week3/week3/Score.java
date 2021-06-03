package week3;

import java.util.Scanner;

public class Score {
	public static double score[];
	public static void main(String[] args) {
		int choose = menu();
		double average,max,min;
		while(choose!=6) {
			switch(choose) {
			case 1:input();break;
			case 2:
				if(score == null) {
					System.out.println("请先输入成绩，在执行该功能");
					break;
				}
				average = getAverage();
				System.out.println("平均分="+average);
				break;
			case 3:
			if(score == null) {
				System.out.println("请先输入成绩，在执行该功能");
				break;
				}
			max = getMax();
			System.out.println("max="+max);break;
			case 4:
				if(score == null) {
					System.out.println("请先输入成绩，在执行该功能");
					break;
					}
				min = getMin();
				System.out.println("min="+min);break;
			case 5:
				if(score == null) {
					System.out.println("请先输入成绩，在执行该功能");
					break;
				}
				getRank();
				break;
				default:System.out.println("输入无效，重新选择!");
			}
			choose=menu();
		}
		System.out.println("程序退出，欢迎再次使用!");
	}
	
	public static int menu() {
		int choice = 0;
		System.out.println("1.Input");
		System.out.println("2.Average");
		System.out.println("3.High");
		System.out.println("4.Low");
		System.out.println("5.Rank");
		System.out.println("6.Exit");
		System.out.println("please choose(1-6):");
		Scanner scan=new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	
	public static void input() {
		score = new double[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.print("请输入第"+(i+1)+"个成绩:");
			boolean ok = false;
			while(!ok) {
				score[i] = scan.nextDouble();
				if(score[i]<0||score[i]>100) {
					System.out.print("成绩无效，重新输入:");
				}
				else {
					ok=true;
				}
			}
		}				
	}
	public static double getAverage() {
		double average=0;
		double sum=0;
		for(int i=0;i<score.length;i++) {
			sum = sum+score[i];
		}
		average = sum/score.length;
		return average;
	}
	public static double getMax() {
		double max = score[0];
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}
		}
		return max;
	}
	public static double getMin() {
		double min = score[0];
		for(int i=1;i<score.length;i++) {
			if(score[i]<min) {
				min = score[i];
			}
		}
		return min;
	}
	public static void getRank() {
			for(int m=1;m<score.length ;m++)
				{
				for(int n=0;n<score.length;n++) {
					if(score[m]<score[n]) {
						double temp = score[m];
						score[m]=score[n];
						score[n]=temp;
					}
			
				}
			}
			for(int m=0;m<score.length;m++) {
				System.out.println(score[m]);
		}
	}
}

