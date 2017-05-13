package beginner;
import java.util.Scanner;
public class Task3 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number");
		int x = in.nextInt();
		boolean result=false;
		if (x < 0) System.out.println("Specified number is negative");
		else if ((x % 3 == 0) || (x % 5 == 0))
		{
			result=true;
			System.out.println(result);
		}
		else System.out.println("The specified number is not a multiple of either 3 or 5");
}
}
