package beginner;

public class Task7 {
	int max;
	public void showNewArray(int[] numbers){
		for(int element: numbers)
			System.out.print(element + " ");
			System.out.println();
		}
	
	public int searchMax (int [] numbers){
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
	return max;
}
public static void main(String[] args) {
	int[] numbers = new int[]{9,7,11,35,81,56,34,93,132,76,54};
	Task7 One = new Task7();
	System.out.println("Given an array of integers. Find and print the max element in it.");
	System.out.print("Initial array is ");
	One.showNewArray(numbers);
	System.out.println("The maximum number in the array is - " + One.searchMax(numbers));
}
}