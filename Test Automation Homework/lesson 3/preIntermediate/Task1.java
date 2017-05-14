package preIntermediate;

import java.util.Scanner;
public class Task1 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter wife's mood. Is it good? False or true.");
	boolean sheSmile = in.nextBoolean();
	System.out.println("Please enter husband's mood. Is it good? False or true.");
	boolean heSmile = in.nextBoolean();
	boolean visitCinema;
	if (sheSmile == heSmile) {
		visitCinema = true;
	}
	else visitCinema = false;
	System.out.println("Visit cinema = " + visitCinema);
}
}