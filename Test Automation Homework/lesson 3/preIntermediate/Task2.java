package preIntermediate;

public class Task2 {
	public char [] modifiedCharArray (String text){
	int lengthText = text.length();
	char [] originalCharArray = new char [lengthText];
	char [] modifiedCharArray = new char [lengthText];
	for (int i = 0; i < lengthText; i++) {
		originalCharArray[i] = text.charAt(i);
		modifiedCharArray[i] = text.charAt(i);
	}
	modifiedCharArray[0] = originalCharArray[lengthText-1];
	modifiedCharArray[lengthText-1] = originalCharArray[0];
	return modifiedCharArray;
	}
	public static void main (String[] args){
	String text = "Cool text";
	System.out.println("Given a string. Write a method which swaps first and last characters and returns a new modified	string:\n"
			+ "swapChar(Cool text) -> tool texC");
	System.out.println("Initial string is " + text);
	Task2 One = new Task2();
	System.out.println("Modified string is: ");
	System.out.println(One.modifiedCharArray(text));
	}
}