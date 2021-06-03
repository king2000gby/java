package week8;

import java.util.Scanner;

public class Splitlnfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("请一次输入学生信息，格式如下：学号,姓名,性别,出生日期");
		
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		String array[] = data.split(",|，");
		String id = array[0];
		String name = array[1];
		String gender = array[2];
		String date = array[3];
		
		Student stu = new Student(id,name,gender,date);
		
		System.out.println(stu.toString());*/
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("输入一个表达式：");
		int i=0;
		float result;
		String express = scan.nextLine();*/
		//String array[] = express.split("[\\+\\-*/]");
		//String array[] = express.split("\\+|\\-|\\*|/");
		/*float num1 = Float.parseFloat(array[0].trim());
		float num2 = Float.parseFloat(array[1].trim());
		for(;i<express.length();i++){
			char c = express.charAt(i);
			if(c=='+'||c=='-'||c=='*'||c=='/')
				break;
		}
		char c = express.charAt(i);
		switch(c){
		case '+':
			result = num1+num2;System.out.println(express+"="+String.valueOf(result));break;
		case '-':
			result = num1-num2;System.out.println(express+"="+String.valueOf(result));break;
		case '*':
			result = num1*num2;System.out.println(express+"="+String.valueOf(result));break;
		case '/':
			result = num1/num2;System.out.println(express+"="+String.valueOf(result));break;
		}*/
	
		Scanner scan = new Scanner(System.in);
		System.out.print("输入一个表达式：");
		String express = scan.nextLine();
		
		int pos1 = 0;
		pos1 = express.indexOf("(");
		if(pos1==-1){
			System.out.println("输入错误，无法运算");
			return;
		}
		String operateCode = express.substring(0,pos1);
		
		int pos2,pos3;
		float number1=0,number2=0;
		pos3 = express.indexOf(")");
		if(operateCode.equals("doubleMe")||operateCode.equals("sqrt")){
			number1 = Float.parseFloat(express.substring(pos1+1,pos3).trim());
		}
		else if(operateCode.equals("add")||operateCode.equals("sub")||operateCode.equals("max")||operateCode.equals("min")){
			pos2 = express.indexOf(",");
			number1 = Float.parseFloat(express.substring(pos1+1,pos2).trim());
			number2 = Float.parseFloat(express.substring(pos2+1,pos3).trim());
		}
		else{
			System.out.println("找不到对应的运算符！程序结束");
			return;
		}
		float result=0;
		switch(operateCode){
		case "doubleMe":
			result = number1*2;System.out.println(express+"="+String.valueOf(result));break;
		case "sqrt":
			result = number1*number1;System.out.println(express+"="+String.valueOf(result));break;
		case "add":
			result = number1+number2;System.out.println(express+"="+String.valueOf(result));break;
		case "sub":
			result = number1-number2;System.out.println(express+"="+String.valueOf(result));break;
		case "max":
			result = number1>number2?number1:number2;System.out.println(express+"="+String.valueOf(result));break;
		case "min":
			result = number1<number2?number1:number2;System.out.println(express+"="+String.valueOf(result));break;
		default:System.out.println("没有对应的操作符");break;
		}
	}

}
