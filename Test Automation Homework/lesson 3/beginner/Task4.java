package beginner;

public class Task4 {
		private static int number2;
		public void showNewArray(int[] numbers){
			for(int element: numbers)
				System.out.print(element + " ");
				System.out.println();
			}
		
		public int searchNumber (int [] numbers, int n){
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] == n) {
			number2 = i + 1;
			}
			}
		return number2;
	}
			public static void main(String[] args) {
			int n = 35;
			int[] numbers = new int[]{9,7,11,35,81,56,34,93};
		Task4 One = new Task4();
		System.out.println("Given an array of integers. Create a method (program) which takes two arguments - this array and number \n"
				+ "that you are looking for - and returns quantity of this number in the array.");
		System.out.print("Initial array is ");
		One.showNewArray(numbers);
		System.out.println("Number to search = " + n);
		if (One.searchNumber(numbers, n) == 0) {
			System.out.println("This number is not present in the array");
		}
		else
			System.out.println("The number in the array is found at number - " + One.searchNumber(numbers, n));
		}
	}