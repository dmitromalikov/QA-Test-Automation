package intermediate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	static boolean error = false;
	static int number;
	public int inputFromConsolAndCheckInteger() {
		System.out.println("Please enter any integer positive number.");
            try {
            	number = new Scanner(System.in).nextInt();
            }
            catch (InputMismatchException e) {
            	error = true;
                System.out.println("You did not enter a integer number!");
            }
            return number;
	}
     public int isPositive(int number) {
            if (number < 0){
            	error = true;
            	System.out.println("You did not enter a positive number!");
            }
            return number;
    }
	
		public static void main (String[] args){
			System.out.println("Superpower (complicated).\n"
					+ "Imagine that you have a special skill which allows to calculate amount of digits in any integer positive number.\n"
					+ "For example, if number is 12345, amount=15. Write a program which checks your superpower when user enters necessaryn\n"
					+ "number via console (in IDE). Use error guessing technique for provide additional checks.");
	        System.out.println("======================= Solution ==============================");
			Task1 One = new Task1();
			One.isPositive(One.inputFromConsolAndCheckInteger());
			if (error == false) {
				System.out.println("Amount = " + preIntermediate.Task12.sumNumber(number));
			}
			else System.out.println("Amount = error");
	}
}
