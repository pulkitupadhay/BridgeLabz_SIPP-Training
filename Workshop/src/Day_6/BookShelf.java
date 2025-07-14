package Day_5;
import java.util.*;

class Node_book{
    String book;
    Node_book next;
    Node_book(String b){
        this.book=b;
    }
}

class LinkList{
    private Node_book head;
    
    public void add(String book){
    	Node_book node=new Node_book(book);
        if(head==null){
            head=node;
            
            return;
        }
        Node_book curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
    }
    public void remove(String book){
        if(head==null) return;
        if(head.book.equals(book)){
            head=head.next;
            return;
        }
        Node_book curr=head;
        while(curr.next!=null){
            if(curr.next.book.equals(book)){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }
    
    public void display(){
    	Node_book temp=head;
        while(temp!=null){
            System.out.print(temp.book+"->");
            temp=temp.next;
        }
    }
    public boolean contains(String book){
    	Node_book temp=head;
        while(temp!=null){
            if(temp.book.equals(book)) return true;
            temp=temp.next;
        }
        return false;
    }
}
public class BookShelf
{
    HashMap<String,LinkList> catalog;
    Set<String> set;
    BookShelf(){
        catalog=new HashMap<>();
        set=new HashSet<>();
    }
    public void addBook(String genre,String book){
        if(set.contains(book)){
            System.out.println("Book already exists"+book);
            return;
        }
        catalog.putIfAbsent(genre, new LinkList());
        catalog.get(genre).add(book);
        set.add(book);
        System.out.println("Added book: "+book+"to genre: "+genre);
        
    }
    public void borrowBook(String genre,String book){
        LinkList list=catalog.get(genre);
        if(list== null){
            System.out.println("No genre found"+genre);
            return;
        }
        if(list.contains(book)){
            list.remove(book);
            set.remove(book);
            System.out.println("Book removed"+book);
        }else{
            System.out.println("Book Not available");
        }
        
    }
    public void displayCatalog(){
        for(Map.Entry<String,LinkList> entry:catalog.entrySet()){
            System.out.print("genre: "+entry.getKey()+" ");
            entry.getValue().display();
        }
    }
    
	public static void main(String[] args) {
		BookShelf shelf=new BookShelf();
		shelf.addBook("Fiction", "The Great Gatsby");
        shelf.addBook("Fiction", "To Kill a Mockingbird");
        shelf.addBook("Science", "A Brief History of Time");
        shelf.displayCatalog();
        shelf.borrowBook("Fiction", "The Great Gatsby");
        shelf.displayCatalog();
	}
}
