package TPO1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
	private List<Book> books = new ArrayList<>();
	private Set<String> categories = new HashSet<>();
	private Map<String, Book> isbnIndex = new HashMap<>();
	private Map<Book, String> loans = new HashMap<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public void addCategory(String category) {
		categories.add(category);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBookIndexed(Book book) {
		books.add(book);
		isbnIndex.put(book.getIsbn(), book);
	}

	public Book findByIsbn(String isbn) {
		return isbnIndex.get(isbn);
	}
	

	public boolean borrowBook(Book book, String borrower) {
	    if (!loans.containsKey(book)) {
	        loans.put(book, borrower);
	        return true;
	    }
	    return false;
	}
	
	public void returnBook(Book book) {
	    loans.remove(book);
	}
}
