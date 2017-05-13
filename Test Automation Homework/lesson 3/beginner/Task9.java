package beginner;
import java.util.Scanner;
public class Task9 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter number a");
	int a = in.nextInt();
	System.out.println("Please enter number b");
	int b = in.nextInt();
	double c = (double)a/b;
	System.out.print("Accurate result of division a/b = " + c);
	}
}
