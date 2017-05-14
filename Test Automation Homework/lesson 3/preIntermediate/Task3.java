package preIntermediate;
import java.util.Scanner;
public class Task3 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number a");
		int a = in.nextInt();
		System.out.println("Please enter the number b");
		int b = in.nextInt();
		boolean result=false;
		int z = a+b;
		if (a==21 || b==21 || z==21)
		{
			result=true;
		}
		System.out.println(result);
}
}
