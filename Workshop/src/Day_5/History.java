package Day_5;

class Node{
    String url;
    Node prev;
    Node next;
    
    Node(String url){
        this.url=url;
    }
}

abstract class BrowserHistoryNavigator{
    abstract void visit(String url);
    abstract void forward();
    abstract void back();
    abstract void showHistory();
}

class BrowserHistory extends BrowserHistoryNavigator{
    private Node curr;
    
    BrowserHistory(){
        this.curr=null;
    }
    
    public void visit(String url){
        Node newnode=new Node(url);
        if(curr!=null){
            curr.next=newnode;
            newnode.prev=curr;
        }
        curr=newnode;
        System.out.println("Visited: "+url);
    }
    
    
    public void forward(){
        if(curr!=null && curr.next!=null){
            curr=curr.next;
            System.out.println("Moved forward to: "+curr.url);
        }else{
            System.out.print("No Next Page found");
        }
    }
    
    public void back(){
        if(curr!=null && curr.prev!=null){
            curr=curr.prev;
            System.out.println("Moved backward to: "+curr.url);
        }else{
            System.out.println("No previous page found");
        }
    }
    
    public void showHistory(){
        System.out.println("Browser History");
        Node temp=curr;
        while(temp!=null && temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.println(temp.url);
            temp=temp.next;
        }
    }
}

public class History
{
	public static void main(String[] args) {
		BrowserHistory brow=new BrowserHistory();
		brow.visit("www.google.com");
		brow.visit("www.youtube.com");
		brow.visit("www.github.com");
		brow.visit("www.leetcode.com");
		
		brow.showHistory();
		
		brow.back();
		brow.back();
		
		brow.forward();
		
		
	}
}