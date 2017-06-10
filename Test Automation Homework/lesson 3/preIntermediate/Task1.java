package preIntermediate;

import java.util.Scanner;
public class Task1 {
	public static boolean visitCinema;
	public boolean visitCinema (boolean sheSmile, boolean heSmile){
		if (sheSmile == heSmile) {
			return visitCinema = true;
		}
		else return visitCinema = false;
	}
	public static void main (String[] args){
		System.out.println("A couple is going to go to the cinema. That's makes sense, if both of them have the same mood.\n"
				+ "There are two boolean parameters heSmile and sheSmile which indicate if each is smiling or\n"
				+ "not. Write a method which returns True if they're eventually going to go to the cinema, of False	otherwise:\n"
				+ "visitCinema(true, true) -> true\n"
				+ "visitCinema(false, false) -> true\n"
				+ "visitCinema(true, false) -> false\n");
	boolean sheSmile = true;
	boolean heSmile = true;
	System.out.println("Wife's mood is - " + sheSmile);
	System.out.println("husband's mood is - " + heSmile);
	Task1 One = new Task1();
	System.out.println("Visit cinema = " + One.visitCinema(sheSmile, heSmile));
}
}