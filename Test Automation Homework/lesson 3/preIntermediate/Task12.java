package preIntermediate;

import beginner.Task1;

public class Task12 {

	int number = 100000121;
	int sum;
		public int sumNumber (int number) {
			while (number != 0) {
				sum = sum + number % 10;
				number /= 10;
			}
			return sum;
		}
	
	public static void main (String[] args){
		int number = 100000121;
		int sum;
		System.out.println("Imagine that you have a special skill which allows to calculate amount of digits in any\n"
				+ "integer positive number. For example, if number is 12345, amount=15. Write a method which check\n"
				+ "your superpower for any hard-coded number.");
		Task12 One = new Task12();
		System.out.println("In number = " + number);
		System.out.println("Amount = " + One.sumNumber(number));
	}
}