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
				System.out.println("感谢使用 Thanks!");
				break;
			}
			switch (choose) {
			case 1:
				create();
				break;
			case 2:
				if (C == null)
					System.out.println("请先开户！");
				else
					save();
				break;
			case 3:
				if (C == null)
					System.out.println("请先开户！");
				else
					withdraw();
				break;
			case 4:
				if (C == null)
					System.out.println("请先开户！");
				else
					comsume();
				break;
			case 5:
				if (C == null)
					System.out.println("请先开户！");
				else
					repay();
				break;
			case 6:
				if (C == null)
					System.out.println("请先开户！");
				else
					settle();
				break;
			case 7:
				if (C == null)
					System.out.println("请先开户！");
				else
					balance();
				break;
			default:
				System.out.println("错误！请重新输入(0~7)");
				break;
			}
		}
	}

	public static int menu() {
		int choose = 0;
		System.out.println("欢迎使用银行系统");
		System.out.println("1.开户 create");
		System.out.println("2.存款 save");
		System.out.println("3.取款 withdraw");
		System.out.println("4.消费 comsume");
		System.out.println("5.还款 repay");
		System.out.println("6.银行结算 settle");
		System.out.println("7.查询余额 balance");
		System.out.println("0.退出 exit");
		System.out.print("请选择(0~7):");
		choose = scan.nextInt();
		return choose;
	}

	public static int submenu() {
		int choose = 0;
		System.out.println("请选择开卡类型");
		System.out.println("1.信用卡 checkingAccount");
		System.out.println("2.存储卡 savingAccount");
		System.out.println("0.返回 exit");
		System.out.print("请选择(0~2):");
		choose = scan.nextInt();
		return choose;
	}

	public static void create() {
		int choose = 0;
		while (true) {
			if (C == null)
				choose = submenu();
			if (choose == 0) {
				System.out.println("开户成功！");
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
				System.out.println("错误！请重新输入(0~2)");
				break;
			}
			if (C != null)
				choose = 0;
		}
	}

	public static void createCheckingAccount() {
		System.out.print("请输入SSN号：");
		String ssn = scan.next();
		System.out.print("请输入姓名：");
		String name = scan.next();
		System.out.print("请输入信用卡号：");
		String accountNum = scan.next();
		System.out.print("请输入月服务费:");
		double serviceCharge = scan.nextDouble();
		CheckingAccount checkingAccount = new CheckingAccount(accountNum, serviceCharge);
		C = new Customer(ssn, name, checkingAccount);

	}

	public static void createSavingAccount() {
		System.out.print("请输入SSN号：");
		String ssn = scan.next();
		System.out.print("请输入姓名：");
		String name = scan.next();
		System.out.print("请输入信用卡号：");
		String accountNum = scan.next();
		System.out.print("请输入月利率:");
		double interestRate = scan.nextDouble();

		SavingAccount savingAccount = new SavingAccount(accountNum, interestRate);
		C = new Customer(ssn, name, savingAccount);
	}

	public static void save() {
		System.out.print("存入金额：");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null)
			C.getCheckingAccount().setBalance(money);
		else
			C.getSavingAccount().setBalance(money);
		System.out.println("成功！");
	}

	public static void withdraw() {
		System.out.print("取出金额：");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null) {
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("成功！");
			} else
				System.out.println("余额不足！");
		} else {
			if (C.getSavingAccount().getBalance() > money) {
				C.getSavingAccount().setBalance(C.getSavingAccount().getBalance() - money);
				System.out.println("成功！");
			} else
				System.out.println("余额不足！");
		}
	}

	public static void comsume() {
		System.out.print("消费金额：");
		double money = scan.nextDouble();
		if (C.getCheckingAccount() != null) {
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("成功！");
			} else
				System.out.println("余额不足！");
		} else {
			if (C.getSavingAccount().getBalance() > money) {
				C.getSavingAccount().setBalance(C.getSavingAccount().getBalance() - money);
				System.out.println("成功！");
			} else
				System.out.println("余额不足！");
		}
	}

	public static void repay() {

		if (C.getSavingAccount() == null)
			System.out.println("你的储蓄卡不需要还款");
		else {
			System.out.print("还款金额：");
			double money = scan.nextDouble();
			if (C.getCheckingAccount().getBalance() > money) {
				C.getCheckingAccount().setBalance(C.getCheckingAccount().getBalance() - money);
				System.out.println("成功！");
			} else
				System.out.println("余额不足！");
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