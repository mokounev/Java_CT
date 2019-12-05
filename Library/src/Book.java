import java.util.Date;

public class Book {

	private String title;
	private String ISBN;
	private Date date;
	private Category Category;
	
	public Book (String title, String ISBN, Date date, Category Category) {
		this.title = title;
		this.ISBN = ISBN;
		this.date = date;
		this.Category = Category;
	}

	public String getTitle() {
		return title;
	}

	
	public String getISBN() {
		return ISBN;
	}

	
	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return title;
		
		}

	public Category getCategory() {
		return Category;
	}

	public void setCategory(Category category) {
		Category = category;
	}
	}
	
