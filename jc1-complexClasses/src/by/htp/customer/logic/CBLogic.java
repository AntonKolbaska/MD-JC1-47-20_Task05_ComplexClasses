package by.htp.customer.logic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerBook;

public class CBLogic {
	public List<Customer> alphabetSorted(CustomerBook customerBook) {		
		List<Customer> customers = customerBook.getCustomers();
		
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getSurName().compareTo(o2.getSurName());
			}
		});
		
		return customers;
	}
	
	public List<Customer> creditCardNumbersInInterval(CustomerBook customerBook, int minNum, int maxNum) {
		List<Customer> result = new ArrayList<Customer>();
		List<Customer> customers = customerBook.getCustomers();
		
		for (int i = 0; i < customers.size(); i++) {
			if ((customers.get(i).getCardNumber() >= minNum) && (customers.get(i).getCardNumber() <= maxNum)) {
				result.add(customers.get(i));
			}
		}
		
		return result;
	}
}
