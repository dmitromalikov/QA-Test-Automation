package preIntermediate;
import java.util.Scanner;

public class Task2 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the text to change the first and last characters in some places.");
	String text = in.nextLine();
	int lengthText = text.length();
	char [] originalCharArray = new char [lengthText];
	char [] modifiedCharArray = new char [lengthText];
	for (int i=0; i < lengthText; i++) {
		originalCharArray[i] = text.charAt(i);
		modifiedCharArray[i] = text.charAt(i);
	}
	modifiedCharArray[0] = originalCharArray[lengthText-1];
	modifiedCharArray[lengthText-1] = originalCharArray[0];
	System.out.println(modifiedCharArray);
}
}