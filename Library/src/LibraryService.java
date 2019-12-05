import java.util.ArrayList;
import java.util.Date;

public class LibraryService {
	
	private Library library;
	
	public LibraryService(Library library) {
		this.library = library;
	}
	
	public Author findAuthorByName(String name) {
		
		Author result = null;
		
		for (Author author : library.getAuthors()) {
			
			if (author.getName().equals(name)) {
				
				result = author;
				System.out.println("Age: " + result.getAge());
			} 
//			
		} 
		return result;
		
		} 
	
	public Book findBookByName(String name) {
		
		Book bookResult = null;
		
		for (Author author : library.getAuthors()) {
			for (Book book : author.getBooks()) {
				
				if (book.getTitle().equals(name)) {
					
					bookResult = book;
					System.out.println("ISBN: " + book.getISBN() + "\nYear Published: " + book.getDate() +
							"\nCategory: " + book.getCategory());
				}
			}
		}
		
		return bookResult;
	}
	
	public ArrayList<Book> getAllBooksFromAuthor(Author author) {
		 
		ArrayList<Book> allBooksAuthor = new ArrayList<Book>(); 
		
//		for (Author aut : library.getAuthors()) {
			
//			if (aut == author) {
				
				for (Book book : author.getBooks()) {
//					
//					allBooksAuthor.add(book);
//				}
				
				allBooksAuthor.add(book);

			} return allBooksAuthor;
		} 
	

	public ArrayList<Book> findBooksBetweenDate(Date start, Date end) {
		
		ArrayList<Book> booksBetweenDate = new ArrayList<Book>();
		
		for (Author aut : library.getAuthors()) {
			
			for (Book book : aut.getBooks()) {
				
				if (book.getDate().after(start) && book.getDate().before(end)) {
					
					booksBetweenDate.add(book);
				}
			}
		} return booksBetweenDate;
	}
}
