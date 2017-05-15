package preIntermediate;
import java.util.Scanner;
public class Task11 {
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
	for (int i=1; i < ar.length-2; i++) {
	if (ar[i-1]==1 | ar[i-1]==2 | ar[i-1]==3) {
		result = true;
		}
	}
	System.out.println(result);
}
}