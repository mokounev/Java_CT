import java.util.ArrayList;

public class Library {
	
	private String name;
	private String address;
	private ArrayList<Author> authors;
	
	public Library(String name, String address) {
		this.name = name;
		this.address = address;
		authors = new ArrayList<Author>();
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
