package preIntermediate;
import java.util.Scanner;
public class Task5 {
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
	boolean result = false;
	for (int i=1; i<=n; i++) {
		if (ar[i-1] == 7 || ar[i-1] == 9) {
		result = false;
		}
		else result = true;
		}
	System.out.println(result);
}
}