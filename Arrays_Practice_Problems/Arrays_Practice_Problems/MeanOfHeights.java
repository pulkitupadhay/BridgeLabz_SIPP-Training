import java.util.Scanner;
public class MeanOfHeights {

	public static void main(String[] args) {
		double [] arr=new double[11];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Mean Height of football team is "+sum/11);
	}
}
