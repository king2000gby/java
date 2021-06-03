  
package week9;

import java.util.ArrayList;

public class driver {
	public static void main(String args[]) {
		Commoditydao dao = new Commoditydao();
		ArrayList<Commodity> list = dao.create();
		dao.display(list);
		
	}
}