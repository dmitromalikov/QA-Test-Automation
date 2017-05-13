package beginner;
import java.util.Scanner;
public class Task2 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number x");
		int x = in.nextInt();
		System.out.println("Please enter the number y");
		int y = in.nextInt();
		boolean result=false;
		int z = x+y;
		if (x==10 || y==10 || z==10)
		{
			result=true;
		}
		System.out.println(result);
}
}