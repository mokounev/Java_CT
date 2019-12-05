import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String[] args) {
		
		new Main();
	
	}
	
//	@SuppressWarnings("deprecation")
	public Main() {
		
		// Harry Mulisch
		
		Author hMulisch = new Author("Harry Mulisch", 83);
		
		Book book1 = new Book("Ontdekking van de hemel", "9789023461234", new Date(1992), Category.LITERATUUR);
		Book book2 = new Book("De Aanslag", "9789023466345", new Date(1982), Category.LITERATUUR);
		Book book3 = new Book("De Procedure", "9789023437147", new Date(1998), Category.LITERATUUR);
		
		hMulisch.addBook(book1);
		hMulisch.addBook(book2);
		hMulisch.addBook(book3);
		
		
		// Gerard Reve
		
		Author gReve = new Author("Gerard Reve", 82);
		
		Book deAvonden = new Book("De Avonden", "9789023455738", new Date(1947), Category.THRILLER);
		Book naderTotU = new Book("Nader tot U", "9789028206809", new Date(1966), Category.ROMANTIEK);
		Book opWegNaarHetEinde = new Book("Op weg naar het einde", "9789028200852", new Date(1963), Category.GESCHIEDENIIS);
		
		gReve.addBook(deAvonden);
		gReve.addBook(naderTotU);
		gReve.addBook(opWegNaarHetEinde);

		// Library
		
		Library lib1 = new Library("Openbare Bibliotheek CT", "Signaalrood 25");
		
		lib1.addAuthor(hMulisch);
		lib1.addAuthor(gReve);
		
		LibraryService libService = new LibraryService(lib1);
		
		
//		System.out.println(libService.findAuthorByName("Harry Mulisch"));
//		System.out.println(libService.findBookByName("De Avonden"));
//		System.out.println(libService.findBooksBetweenDate(new Date(1946), new Date(1948)));
//		System.out.println(libService.getAllBooksFromAuthor(gReve));
		
//		System.out.println(book2.getDate());
//		System.out.println(deAvonden.getDate());
		
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		
		System.out.println(date);
		

		
		
		
		
	}

}
