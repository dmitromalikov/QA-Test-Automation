package preIntermediate;
import java.util.Scanner;
public class Task13 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter numer a");
	double a = in.nextDouble();
	System.out.println("Please enter numer b");
	double b = in.nextDouble();
	System.out.println("Please enter numer c");
	double c = in.nextDouble();
	double d = Math.pow(b, 2) - (4 * a * c);
	double x1, x2;
	System.out.println("d = " + d);
	if (d > 0){
	x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
	x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
	System.out.printf("x1 = " + x1 + " x2 = " + x2);
	}
	else if (d == 0){
	x1 = ((-1) * b) / (2 * a);
	System.out.println("x1, x2 = " + x1);
	}
	else
	System.out.print("Error. D < 0");
	}
}
