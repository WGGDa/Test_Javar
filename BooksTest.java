package new3;

public class BooksTest {

	 public static void main(String[]args) {
		 
			Books books1 = new Books("Rick Riordran", "2005", "9788498383133", "$21.00");
				
			System.out.println(books1.BookAuthor);
			System.out.println(books1.BookYearPublish);
			System.out.println(books1.BookISBNNumber);
			System.out.println(books1.BookPrice);
 
		}
	
}
