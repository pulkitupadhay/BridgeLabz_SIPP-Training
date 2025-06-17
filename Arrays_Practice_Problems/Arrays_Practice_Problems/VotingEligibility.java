import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(arr[i]>=18) 
					System.out.println("The Student with the age "+arr[i]+" can vote");
				else System.out.println("The Student with the age "+arr[i]+" can not vote");
			}
			else System.out.println("Invalid age");
		}
	}

}
