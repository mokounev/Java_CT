import java.util.ArrayList;

public class Author {
	
	private String name;
	private int age;
	private ArrayList<Book> books;
	
	public Author(String name, int age) {
		this.name = name;
		this.age = age;
		books = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void addBook(Book book) {
		books.add(book);
		
		
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	
	@Override
	public String toString() {
		return name;
		
		}
	
	}
	

	
	
	
		
		