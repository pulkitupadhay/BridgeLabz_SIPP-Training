package keyworddemo.staticfinalthis;

public class Book {
	static String libraryName="Central Library";
	final String isbn;
	String author,title;
	
	Book(String author,String title,String isbn){
		this.isbn=isbn;
		this.author=author;
		this.title=title;
	}
	
	static String getLibraryName() {
		return libraryName;
	}
	
	void display() {
		if(this instanceof Book) {
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("ISBN: "+isbn);
		}
	}
	
	public static void main(String[] args) {
		 Book book1 = new Book("Java Basics", "John Doe", "ISBN001");
	     Book book2 = new Book("OOP in Java", "Jane Smith", "ISBN002");

	     book1.display();
	     book2.display();

	     System.out.println(Book.getLibraryName());
	}
}
