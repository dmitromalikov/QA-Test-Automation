package beginner;

public class Task1 {

	int 
public int[] newArray(int [] numbers, int factor){
	int [] newArray = new int [numbers.length];
	for (int i = 0; i < numbers.length; i++){
		newArray[i] = numbers[i] * factor;
		}
return newArray;
	}
public void showArray(int[] numbers){
	for(int element: numbers)
		System.out.print(element + " ");
		System.out.println();
	}
public static void main(String[] args) {
	int[] numbers = new int[]{1,2,3,4,5};
	int factor = 3;
	Task1 One = new Task1();
	System.out.println("Given an array of integer numbers.\n"
			+ "Create a method (program) which returns a new one where each element is multiplied by 3");

	System.out.print("Initial array is ");
	One.showArray(numbers);
	System.out.println("Factor is " + factor);
	System.out.print("Modified array is ");
	One.showArray(One.newArray(numbers, factor));
}
}