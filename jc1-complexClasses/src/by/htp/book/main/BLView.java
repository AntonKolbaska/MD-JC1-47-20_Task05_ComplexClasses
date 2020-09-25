package by.htp.book.main;

import java.util.List;

import by.htp.book.entity.Book;
import by.htp.book.entity.Library;

public class BLView {
	public void printAll(String message, List<Book> books) {
		System.out.println(message);

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);			
			System.out.println(book.toString());
		}
	}
	
	public void printAll(String message, Library library) {
		System.out.println(message);

		List<Book> books = library.getBooks();
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);			
			System.out.println(book.toString());
		}
	}
}
