package intermediate;

public class Task4 {
	static int num;
	public int numberFromString (String str){
		num = Integer.parseInt(str.replaceAll("[^0-9]", ""));		
	return num;
	}
	public static void main (String[] args){
		String str = "krm236%./$7abw";

		System.out.println("Sum of numbers in the string. \n"
				+ "Given a string. Write a method which returns the sum of the numbers appearing in the string,\n"
				+ "ignoring all other characters. Provide all necessary checks.\n"
				+ "Example:\n"
				+ "yourMethod(krm236abw) -> 11\n"
				+ "yourMethod(aa49b55) -> 23");
        System.out.println("======================= Solution ==============================");
		System.out.println("Initial string = " + str);
		Task4 One = new Task4 ();
		System.out.println("Numbers in the string = " + One.numberFromString(str));
		System.out.println("Sum of the numbers appearing in the string = " + preIntermediate.Task12.sumNumber(num));
}
}