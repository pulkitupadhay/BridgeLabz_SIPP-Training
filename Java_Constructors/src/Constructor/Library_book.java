package Constructor;

public class Library_book {
	public String ISBN;
	protected String title;
	private String author;
	
	public Library_book(String ISBN,String title,String author) {
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
	}
	
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	
	public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class Ebook extends Library_book{
	public Ebook(String ISBN,String title,String author) {
		super(ISBN,title,author);
	}
	 public void displayEBookInfo() {
	        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title);
	    }

	    public static void main(String[] args) {
	        Ebook ebook = new Ebook("1234567890", "Learn Java", "John Smith");
	        ebook.displayBook();
	        ebook.displayEBookInfo();
	    }
}
