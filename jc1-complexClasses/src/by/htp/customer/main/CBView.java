package by.htp.customer.main;

import java.util.List;
import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerBook;

public class CBView {
	public void printAll(String message, List<Customer> customers) {
		System.out.println(message);

		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			System.out.println(customer.toString());
		}
	}

	public void printAll(String message, CustomerBook customerBook) {
		System.out.println(message);

		List<Customer> customers = customerBook.getCustomers();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			System.out.println(customer.toString());
		}
	}
}
