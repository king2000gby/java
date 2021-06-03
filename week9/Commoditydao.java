package week9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Commoditydao {
	public ArrayList<Commodity> create(){
		ArrayList<Commodity> list = new ArrayList<Commodity>();
		String msg="";
		int i = 0;
		System.out.println("������Ʒ��Ϣ�����ƣ������͵��ۣ��á���������������0000�˳�����");
		Scanner scan = new Scanner(System.in);
		while(true) {
			msg = scan.nextLine();
			if(msg.equals("0000"))break;
			i++;
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			Date today = new Date();
			String id = df.format(today);
			String number = String.valueOf(i);
			if(number.length() < 4) {
				int supplement = 4 - number.length();
				for(int j = 0; j < supplement; j++)
					id += "0";
			}
			id += number;
			msg = msg.replace(" ", "");
			String section[] = msg.split(",|��");
			String name = section[0];
			Integer nCount = Integer.parseInt(section[1]);
			Double price = Double.parseDouble(section[2]);
			Commodity C = new Commodity(id, name, nCount, price);
			list.add(C);
		}
		return list;		
	}
	
	public void display(ArrayList<Commodity> list) {
		String msg = "";
		int nCount = 0;
		double total = 0;
		int time = 0;
		msg += "       ��ˮ��\t"+"��Ʒ����\t"+"����\t"+"��Ʒ����\t"+  "�ܼ�  \n";
		System.out.println(msg);
		for (Commodity commodity : list) {
			System.out.println(commodity.toString());
			total += commodity.getTotal();
			nCount += commodity.getnCount();
			if(commodity.getId()!=null)
				time++;
		}
		String result = "�ܼƣ�\t" + "���۱��� " + time + "\t�������� " + nCount + "\t���۽��" + total + "\n";
		System.out.println(result);
	}
}
