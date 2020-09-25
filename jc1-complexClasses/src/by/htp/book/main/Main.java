package by.htp.book.main;



import by.htp.book.entity.Book;
import by.htp.book.entity.Library;
import by.htp.book.logic.LLogic;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		LLogic logic = new LLogic();
		BLView view = new BLView();
		lib.add(new Book());
		lib.add(new Book(865, "Tigers in mud", "Otto Karius", "SomePublisher", 1965, 312, 40, "Hard"));
		lib.add(new Book(733, "Data structures and algoriths in Java", "R. W. Lafore", "SAMS", 2019, 701, 51, "Hard"));
		view.printAll("Full list:", lib);
		view.printAll("\nAll books of Otto Karius:", logic.booksByAuthor(lib, "Otto Karius"));
		view.printAll("\nAll books of SAMS:", logic.booksByPublisher(lib, "SAMS"));
		view.printAll("\nAll books published after 2000:", logic.booksAfterYear(lib, 2000));

	}
}
