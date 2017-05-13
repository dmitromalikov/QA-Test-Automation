package beginner;
import java.util.Scanner;
public class Task10 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter a number from 1 to 9");
	int n = in.nextInt();
	String s = "*********";
	int k = 0;
	int m = n;
	if(n <1 || n > 9)
	System.out.println("You entered a number not from 1 to 9");
	else for (int i=1; i<=m+1; i++) {
			String t = s.substring(0, k);
			System.out.println(t);
			k=k+1;
		}
	k=n-1;	
	for (int i=1; i<=n-1; i++) {
		String t = s.substring(0, k);
		System.out.println(t);
		k=k-1;
	}
}
}
