package preIntermediate;
import java.util.Scanner;

public class Task4 {
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
	System.out.println("Second half of the array:");
	if (n % 2 == 0) {
	for (int i=0; i<=n/2-1; i++) {
	System.out.println(ar[i]);
	}
	}
	else
		for (int i=0; i<=n/2; i++) {
			System.out.println(ar[i]);
			}
}
}