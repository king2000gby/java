package week10;

import java.util.ArrayList;

public class Driver {
	public static void main(String args[]) {
		Resultdao dao = new Resultdao();
		ArrayList<Student> s = dao.createStudent();
		ArrayList<Result> r = dao.createResult();
		dao.display(s, r);
	}
}