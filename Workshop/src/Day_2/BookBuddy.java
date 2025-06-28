package Day_2;

import java.util.*;
public class BookBuddy{
    List<String> book;
    public BookBuddy(){
        book=new ArrayList<String>();
    }
    public void addBook(String title,String author){
        book.add(title.trim()+"-"+author);
    }
    public void sortBooksAlphabatically(){
        int n=book.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                String title1=book.get(i).split("-")[0];
                String title2=book.get(j).split("-")[0];
                if(title1.compareToIgnoreCase(title2)<0){
                    String temp=book.get(i);
                    book.set(i,book.get(j));
                    book.set(j,temp);
                }
            }
        }
    }
    public String searchByAuthor(String author){
        for(String str: book){
            String[] s=str.split("-");
            if(s[1].equals(author)) return str;
        }
        return "No Book Found";
    }
    public String[] convert(){
        return book.toArray(new String[1]);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    BookBuddy b=new BookBuddy();
		for(int i=0;i<n;i++){
		    String title=sc.next();
		    String author=sc.next();
		    b.addBook(title,author);
		}
		b.sortBooksAlphabatically();
		for(String s:b.book) System.out.print(s+" ");
		System.out.println();
		System.out.println("Enter the author name to be searched");
		String str=sc.next();
		System.out.println(b.searchByAuthor(str));
		String[] arr=b.convert();
		System.out.println(Arrays.toString(arr));
	}
}