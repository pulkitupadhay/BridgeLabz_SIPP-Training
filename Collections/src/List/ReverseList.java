package List;
import java.util.*;

public class ReverseList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<>();
		for(int i=0;i<n;i++) ls.add(sc.nextInt());
		Collections.reverse(ls);
		for(int i=0;i<n;i++) System.out.print(ls.get(i)+" ");
	}
}
