package week6;

import java.util.Scanner;

public class Driver {
	public static Customer C;
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int choose;
		while (true) {
			choose = menu();
			if (choose == 0) {
				System.out.println("��лʹ�� Thanks!");
				break;
			}
			switch (choose) {
			case 1:
				create();
				break;
			case 2:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					save();
				break;
			case 3:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					withdraw();
				break;
			case 4:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					comsume();
				break;
			case 5:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					repay();
				break;
			case 6:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					settle();
				break;
			case 7:
				if (C == null)
					System.out.println("���ȿ�����");
				else
					balance();
				break;
			default:
				System.out.println("��������������(0~7)");
				break;
			}
		}
	}

	public static int menu() {
		int choose = 0;
		System.out.println("��ӭʹ������ϵͳ");
		System.out.println("1.���� create");
		System.out.println("2.��� save");
		System.out.println("3.ȡ�� withdraw");
		System.out.println("4.���� comsume");
		System.out.println("5.���� repay");
		System.out.println("6.���н��� settle");
		System.out.println("7.��ѯ��� balance");
		System.out.println("0.�˳� exit");
		System.out.print("��ѡ��(0~7):");
		choose = scan.nextInt();
		return choose;
	}

	public static int submenu() {
		int choose = 0;
		System.out.println("��ѡ�񿪿�����");
		System.out.println("1.���ÿ� checkingAccount");
		System.out.println("2.�洢�� savingAccount");
		System.out.println("0.���� exit");
		System.out.print("��ѡ��(0~2):");
		choose = scan.nextInt();
		return choose;
	}

	public static void create() {
		int choose = 0;
		while (true) {
			if (C == null)
				choose = submenu();
			if (choose == 0) {
				System.out.println("�����ɹ���");
				break;
			}
			switch (choose) {
			case 1:
				createCheckingAccount();
				break;
			case 2:
				createSavingAccount();
				break;
			default:
				System.out.println("��������������(0~2)");
				break;
			}
			if (C != null)
				choose = 0;
		}
	}

	public static void createCheckingAccount() {
		System.out.print("������SSN�ţ�");
		String ssn = scan.next();
		System.out.print("������������");
		String name = scan.next();
		System.out.print("���������ÿ��ţ�");
		String accountNum = scan.next();
		System.out.print("�������·����:");
		double serviceCharge = scan.nextDouble();
		CheckingAccount checkingAccount = new CheckingAccount(accountNum, serviceCharge);
		C = new Customer(ssn, name, checkingAccount);

	}

	public static void createSavingAccount() {
		System.out.print("������SSN�ţ�");
		String ssn = scan.next();
		System.out.print("������������");
		String name = scan.next();
		System.out.print("���������ÿ��ţ�");
		String accountNum = scan.next();
		System.out.print("������������:");
		double interestRate = scan.nextDouble();

		SavingAccount savingAccount = new SavingAccount(accountNum, interestRate);
		C = new Customer(ssn, name, savingAccount);
	}

	public static void save() {
		System.out.print("�����");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null)
			C.getCheckingAccount().setBalance(money);
		else
			C.getSavingAccount().setBalance(money);
		System.out.println("�ɹ���");
	}

	public static void withdraw() {
		System.out.print("ȡ����");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null) {
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("�ɹ���");
			} else
				System.out.println("���㣡");
		} else {
			if (C.getSavingAccount().getBalance() > money) {
				C.getSavingAccount().setBalance(C.getSavingAccount().getBalance() - money);
				System.out.println("�ɹ���");
			} else
				System.out.println("���㣡");
		}
	}

	public static void comsume() {
		System.out.print("���ѽ�");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null) {
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("�ɹ���");
			} else
				System.out.println("���㣡");
		} else {
			if (C.getSavingAccount().getBalance() > money) {
				C.getSavingAccount().setBalance(C.getSavingAccount().getBalance() - money);
				System.out.println("�ɹ���");
			} else
				System.out.println("���㣡");
		}
	}

	public static void repay() {

		if (C.getSavingAccount() == null)
			System.out.println("��Ĵ������Ҫ����");
		else {
			System.out.print("�����");
			double money = scan.nextDouble();
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("�ɹ���");
			} else
				System.out.println("���㣡");
		}
	}

	public static void settle() {
		if (C.getCheckingAccount() != null)
			C.getCheckingAccount().accessServiceCharge();
		else
			C.getSavingAccount().payInterest();
	}

	public static void balance() {
		String msg;
		msg = C.toString();
		System.out.println(msg);
	}
}