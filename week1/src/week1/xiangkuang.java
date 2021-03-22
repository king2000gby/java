package week1;
import java.util.Scanner;

public class xiangkuang {

	public static void main(String args[]) {
		
		
		//定义变量
		float width,leng;
		int type,respond,respond2,respond3,i;
		double total=0;
		//赋值
		Scanner scan=new Scanner(System.in);
		
	
		//输入数据
		System.out.println("请选择相框种类(low/high)(1/0)：");
		type=scan.nextInt();
		System.out.println("请输入相框长：");
		leng=scan.nextFloat();
		System.out.println("请输入相框宽：");
		width=scan.nextFloat();
		System.out.println("是否定制颜色（1/0）：");
		respond=scan.nextInt();
		System.out.println("是否添加纸板（1/0）：");
		respond2=scan.nextInt();
		System.out.println("是否添加玻璃（1/0）：");
		respond3=scan.nextInt();
		System.out.println("皇冠的数量：/n");
		i=scan.nextInt();
		//数据处理
		
		if(type == 1) {
		  if(respond3 == 1) {
			if(respond2 == 1) {
				if(respond == 1) {
					total=total+0.1*2*(leng+width);
				}
				total=total+0.02*leng*width;
			}
			total=total+0.07*leng*width;
		}
		total=0.15*2*(leng+width);
		}
		
		else {
						total=0.25*2*(leng+width);
					}
						
			total=total+0.35*i;									
		//输出
		System.out.println("价格(美元)："+total);
	}
}
