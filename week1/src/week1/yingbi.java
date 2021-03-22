package week1;
import java.util.Scanner;

public class yingbi {

	public static void main(String args[]) {
		float price;
		float dec;
		int i = 0;
		int n1 = 0, n2 = 0;
		int a = 0, b = 0, c = 0, d = 0;
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("请输入零钱数目（末尾为5或0）：");
		price=scan.nextFloat();


		while (i < price)
		{
			i++;
		}

		i--;

		dec = price - i;

		while (i > 1)
		{
			if (i >= 2)
			{
				i -= 2;
				n2++;
			}
		}

		if (i == 1)
		{
			n1++;
		}

		if (dec >= 0.5)
		{
			dec -= 0.5;
			a++;
		}

		while (dec >= 0.2)
		{
				dec -= 0.2;
				b++;
		}

		while (dec >= 0.1)
		{
			dec -= 0.1;
			c++;
		}

		while (dec >= 0.05)
		{
			dec-= 0.05;
			d++;
		}
		
		System.out.println("1$美元:"+n1);
		System.out.println("2$美元:"+n2);
		System.out.println("50cent美分:"+a);
		System.out.println("20cent美分:"+b);
		System.out.println("5cent美分:"+d);
				
	}
		
}

