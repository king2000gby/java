package week3;

import java.util.Scanner;

public class num {
	public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in );
		System.out.println("��������������FirstNum��SecondNum(FirstNumҪ��SecondNumС)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i;
        if(a>=b) {
        	System.out.println("�������������������������������������");
        	System.out.println("��������������FirstNum��SecondNum(FirstNumҪ��SecondNumС)");
        	}
        System.out.println("a��b֮�������Ϊ��");
        i=a+1;
        while(i<b) {
        	if(i%2!=0)
        		System.out.println(+i);
        	i++;        		
        }            	
        int sum = 0;
        i=a+1;
        while(i<b) {
        	if(i%2==0)
        		sum=sum+i;
        	i++;
        } 
        i=a+1;
        int qsum = 0;
        while(i<b) {
		if(i%2!=0)
			qsum=qsum+i*i;
		i++;
        }
        int z=1;
        int x=0;
        int y=0;
        while(z<=10) {
        	x=x+z;
        	y=y+z*z;
        	z++;
        }
    System.out.println("a��b֮���ż����Ϊ"+sum);	
    System.out.println("a��b֮�������ƽ����Ϊ"+qsum);
    System.out.println("1��10֮���������ּ���ƽ��"+x+y);
}
}