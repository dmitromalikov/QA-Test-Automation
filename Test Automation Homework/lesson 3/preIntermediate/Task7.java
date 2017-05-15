package preIntermediate;
import java.util.Scanner;
public class Task7 {
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
	int max = 0;
	int min = 999999999;
	for (int i=1; i<=ar.length; i++){
		if (ar[i-1] > max) {
			max = ar[i-1];
		}
		if (ar[i-1] < min) {
			min = ar[i-1];
		}
	}
	System.out.println("The maximum number in the array is - " + max);
	System.out.println("The minimum number in the array is - " + min);
	System.out.println("The maximum number multiplied by 2 is - " + max*2);
	System.out.println("The minimum number multiplied by 2 is - " + min*2);
	}
}
