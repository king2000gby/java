package week8;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hasspace = false;
		boolean hasupper = false;
		boolean haslower = false;
		boolean hasdigit = false;
		boolean repeatInput = true;
		System.out.println("1.It contains a total of 8 to 15 characters,no space.");
		System.out.println("2.It contains at least one uppercase non-numeric character");
		System.out.println("and one lowercase non-numeric character.");
		System.out.println("3.It contains at least one numeric digit.");
		System.out.print("Enter a password:");
		
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		int len = password.length();
		while(repeatInput){
			hasspace = false;
			hasupper = false;
			haslower = false;
			hasdigit = false;
		if(len<6 || len>10){
			System.out.println("The length of the password is invalid");
			System.out.print("Enter a new password:");
			password = scan.nextLine();
			len = password.length();
			continue;
		}
		
		for(int i=0;i<len;i++){
			char c = password.charAt(i);
			if(hasspace==false && c == ' '){
				hasspace = true;
				continue;
			}
			if(hasupper==false && c >= 'A'&& c<='Z'){
				hasupper = true;
				continue;
			}
			if(haslower==false && c>='a' && c<='z'){
				haslower = true;
				continue;
			}
			if(hasdigit==false && c>='0' && c<='9'){
				hasdigit = true;
				continue;
			}
		}
		if(!hasspace && hasupper && haslower && hasdigit){
			System.out.println("Congratulations! It's a valid password!");
			repeatInput = false;
			return;
		}
		else{
			System.out.println("Your password '"+password+"' is not valid for the following reason:");
			if(hasspace){
				System.out.println("It contains a spcae");
			}
			if(!hasupper){
				System.out.println("It does not contain a upper case character");
			}
			if(!haslower){
				System.out.println("It does not contain a lower case character");
			}
			if(!hasdigit){
				System.out.println("It does not contain a numeric digit");
			}
		}
		System.out.print("Enter a new password:");
		password = scan.nextLine();
		len = password.length();
		}
		return;
		

	}

}
