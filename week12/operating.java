package week12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class operating {
	public static void main(String args[]) throws IOException {

		File infl = new File("D:\\question.txt");
		FileReader frdr = new FileReader(infl);
		BufferedReader aBfrd = new BufferedReader(frdr);
		
		File ofl = new File("D:\\answer.txt");
		FileWriter fwt = new FileWriter(ofl);
		PrintWriter pwt = new PrintWriter(fwt);

		while (true) {
			String express = aBfrd.readLine();
			
			express = express.replace(" ", "");
			
			if (express.equals(""))
				break;

			int pos1 = express.indexOf("(");
			int pos2 = express.indexOf(")");

			String operate = express.substring(0, pos1);
			String numberString = express.substring(pos1 + 1, pos2);
			double number1, number2, result;
			String msg = "";

			if (!operate.equals("doubleMe")) {
				int pos3 = numberString.indexOf(",");
				String string1 = numberString.substring(0, pos3);
				String string2 = numberString.substring(pos3 + 1);
				number1 = Double.parseDouble(string1);
				number2 = Double.parseDouble(string2);
				if (operate.equals("add")) {
					result = number1 + number2;
					msg += express + " = " + result;
				}

				if (operate.equals("sub")) {
					result = number1 - number2;
					msg += express + " = " + result;
				}

				if (operate.equals("max")) {
					if (number1 > number2)
						result = number1;
					else
						result = number2;
					msg += express + " = " + result;
				}

				if (operate.equals("min")) {
					if (number1 > number2)
						result = number2;
					else
						result = number1;
					msg += express + " = " + result;
				}
			}
			else if (operate.equals("doubleMe")) {
				number1 = Double.parseDouble(numberString);
				result = number1 * 2;
				msg += express + " = " + result;
			}
			else
				System.out.println("´íÎó");

			pwt.println(msg);
			
		}
		pwt.close();
		aBfrd.close();
	}
}

