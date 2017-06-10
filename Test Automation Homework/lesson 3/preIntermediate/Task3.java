package preIntermediate;

public class Task3 {
	public boolean checkNumber(int a, int b){
		int z = a + b;
		if (a==21 | b==21 | z==21)
		{
			return true;
		}
		else return false;
	}

	public static void main (String[] args){
		int a = 10;
		int b = 11;
		System.out.println("Given 2 integers, a and b. Write a method which returns true if one if them is 21 or if their sum is 21.");
		System.out.println("The number a = " + a);
		System.out.println("The number b = " + b);
		System.out.println("The number z = " + (a + b));
		Task3 One = new Task3();
		System.out.println("Result is = " + One.checkNumber(a, b));
		}
}
