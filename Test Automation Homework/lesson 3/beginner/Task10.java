package beginner;
import java.util.Scanner;
public class Task10 {
	int k = 0;
	public String printText (String s, int n){
	int m = n;
	for (int i = 1; i <= m + 1; i++) {
			String t = s.substring(0, k);
			System.out.println(t);
			k = k+1;
		}
	k=n-1;	
	for (int i = 1; i <= n-1; i++) {
		String t = s.substring(0, k);
		System.out.println(t);
		k = k - 1;
	}
	return s;
	}
	public static void main (String[] args){
		int n;
		int m;
		n = m = 5;
		String s = "*********";
			System.out.println("Create method which gets a number form 1 to 9 (for example 4) and then prints the follow output:\n"
			+ "*\n"
			+ "**\n"
			+ "***\n"
			+ "****\n"
			+ "***\n"
			+ "**\n"
			+ "*\n");
			Task10 One = new Task10();
	System.out.println("Text = " + s);	
	System.out.println("Number = " + n);
	System.out.println("Result: ");
	One.printText(s, n);	
	}
}
