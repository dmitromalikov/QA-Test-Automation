package beginner;
import java.util.Scanner;
public class Task8 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter a string");
	String s = in.next();
	System.out.println("Please enter a int n");
	int n = in.nextInt()+1;
	while (n>0) {
		n = n-1;
		s = s.substring(0, n);
		System.out.print(s);
		}
		}
}
