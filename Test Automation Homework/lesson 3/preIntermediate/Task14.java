package preIntermediate;

public class Task14 {
	public void newText (String text){
	int lengthText = text.length();
	char [] CharArray = new char [lengthText];
	for (int i=0; i < lengthText; i++) {
		CharArray[i] = text.charAt(i);
		}
	for (int i = 0; i < lengthText; i++) {
		System.out.println(CharArray[i]);
		for (int n = 1; n <= (i + 1) * 3; n++) { 
			System.out.print(" ");
		}
		}
	}
	
	public static void main (String[] args) {
		String text = "Test";
	System.out.println("Write a method, which takes a word and prints it like a diagonal matrix. See example:\n"
			+ "Input: “Test”\n"
			+ "Output:\n"
			+ "T\n"
			+ "   e\n"
			+ "      s\n"
			+ "         t\n");
	Task14 One = new Task14();
	System.out.println("Input: " + text);
	System.out.println("Output:");
	One.newText (text);
	}
}