package beginner;
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
	System.out.println("Enter an integer to search in an array");
	int numberToSearch = in.nextInt();
	int y=0;
	for (int i=1; i<=n; i++) {
		if (ar[i-1] == numberToSearch) {
		y=i-1;
		System.out.println("The number in the array is found at number - " + y);
		}
		}
	if (y==0) System.out.println("This number is not present in the array");
}
}