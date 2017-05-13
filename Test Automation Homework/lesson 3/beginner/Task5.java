package beginner;
import java.util.Scanner;
public class Task5 {
	public static void main (String[] args){
		String[] marks={"Failure","Poor","Satisfactory","Good","Excellent"};
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the your mark");
		int x = in.nextInt();
		System.out.println("Your result is - "+marks[x-1]);
}
}