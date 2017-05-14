package preIntermediate;

import java.util.Scanner;
public class Task9 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter a number to display the multiplication table");
	int n = in.nextInt();
	for (int i=1; i<=10; i++) {
		System.out.println(n + " x " + i + " = " + (n*i));
	}
	}
}
