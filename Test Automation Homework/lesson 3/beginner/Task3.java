package beginner;

public class Task3 {
	
	public boolean checkNumber (double x) {
		if ((x % 3 == 0) || (x % 5 == 0))
		{
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
	double x = 11;
	Task3 One = new Task3();
	System.out.println("Create a method (program) which returns True if the given non-negative number is a multiple of 3 or a multiple of 5");
    System.out.println("======================= Solution ==============================");
	System.out.println("Initial number = " + x);
	System.out.println("Initial number / 3 = " + x / 3);
	System.out.println("Initial numbers / 5 = " + x / 5);
	System.out.println("Result = " + One.checkNumber(x));
	}
}