package week3;

import java.util.Scanner;

public class num {
	public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in );
		System.out.println("请输入两个整数FirstNum和SecondNum(FirstNum要比SecondNum小)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i;
        if(a>=b) {
        	System.out.println("你所输入的两个数不满足条件，请重新输入");
        	System.out.println("请输入两个整数FirstNum和SecondNum(FirstNum要比SecondNum小)");
        	}
        System.out.println("a和b之间的奇数为：");
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
    System.out.println("a和b之间的偶数和为"+sum);	
    System.out.println("a和b之间的奇数平方和为"+qsum);
    System.out.println("1到10之间所有数字及其平方"+x+y);
}
}