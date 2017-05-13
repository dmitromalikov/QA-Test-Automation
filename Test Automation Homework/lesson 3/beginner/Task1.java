package beginner;
import java.util.Scanner;
public class Task1 {
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
		System.out.println("How much would you like to multiply all the numbers in an array?");
		int m = in.nextInt();
		System.out.println("Now the array contains the following data:");
		for (int i=1; i<=n; i++) {
			ar[i-1]=ar[i-1]*m;
			System.out.println(ar[i-1]);
	}
}
}