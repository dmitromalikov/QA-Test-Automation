package beginner;
import java.util.Scanner;
public class Task5 {
	public static void main (String[] args){
		String[] marks={"Failure","Poor","Satisfactory","Good","Excellent"};
		System.out.println("There are several marks in the school: from 1 to 5 (the highest).\n"
				+ "Create a method (program) which takes a mark and return your result (for ex. Excellent, Good, Failed3 etc.).\n"
						+ "Please do not use if...else condition");
        System.out.println("======================= Solution ==============================");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the your mark (from 1 to 5):");
		int x = in.nextInt();
		System.out.println("Your result is - " + marks[x-1]);
}
}