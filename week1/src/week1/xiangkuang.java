package week1;
import java.util.Scanner;

public class xiangkuang {

	public static void main(String args[]) {
		
		
		//�������
		float width,leng;
		int type,respond,respond2,respond3,i;
		double total=0;
		//��ֵ
		Scanner scan=new Scanner(System.in);
		
	
		//��������
		System.out.println("��ѡ���������(low/high)(1/0)��");
		type=scan.nextInt();
		System.out.println("��������򳤣�");
		leng=scan.nextFloat();
		System.out.println("����������");
		width=scan.nextFloat();
		System.out.println("�Ƿ�����ɫ��1/0����");
		respond=scan.nextInt();
		System.out.println("�Ƿ����ֽ�壨1/0����");
		respond2=scan.nextInt();
		System.out.println("�Ƿ���Ӳ�����1/0����");
		respond3=scan.nextInt();
		System.out.println("�ʹڵ�������/n");
		i=scan.nextInt();
		//���ݴ���
		
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
		//���
		System.out.println("�۸�(��Ԫ)��"+total);
	}
}
