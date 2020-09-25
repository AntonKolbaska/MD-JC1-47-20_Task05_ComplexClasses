package by.htp.customer.main;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerBook;
import by.htp.customer.logic.CBLogic;

public class Main {

	public static void main(String[] args) {
		CustomerBook cb = new CustomerBook();
		CBLogic logic = new CBLogic();
		CBView view = new CBView();
		
		cb.add(new Customer(121, "Brown", "Emmett", "Lathrop", "1646, Hillwalley", 25101985, 88));
		cb.add(new Customer());
		cb.add(new Customer(66, "Cartman", "Eric", "Theodore", "??? SP", 148, 666));
		view.printAll("Full list:\n", cb);
		view.printAll("Sort by surname:\n", logic.alphabetSorted(cb));
		view.printAll("Card number 500-2000", logic.creditCardNumbersInInterval(cb, 500, 30000000));

	}

}
