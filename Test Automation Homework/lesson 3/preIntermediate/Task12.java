package preIntermediate;
import java.util.Scanner;
public class Task12 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("How many elements would you like to create an array of integers?");
	int n = in.nextInt();
	int[] ar=new int[n];
	for (int i=1; i<=n; i++) {
			System.out.println("Please enter integer ¹" + i + " from " + n);
			int x = in.nextInt();
			ar[i-1]=x;
	}
	int sum = 0;
	for (int num=0; num < ar.length; num++){
		sum = sum + ar[num];
	}
	System.out.println("Sum of all elements = " + sum);
}
}