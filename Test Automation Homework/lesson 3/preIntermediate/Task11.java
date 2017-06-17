package preIntermediate;

public class Task11 {
	public boolean isIntegerAr (int [] array){
	boolean resultInt = true;
	for(int i = 0; i < array.length; i++){
	if (array [i] % 1 == 0) {
				resultInt = true;
			}
		else {
		resultInt = false;
		System.out.println("Error. The number from array " + array[i] + " is n't integer.");
		}
		}
		return resultInt; 
	}
	
	public boolean isPositiveAr (int [] array){
	boolean resultPositive = true;
	for(int i = 0; i < array.length; i++){
	if (array [i] < 0) {
			resultPositive = false;
			System.out.println("Error. The number from array " + array[i] + " is n't positive.");
		}
		}
	return resultPositive; 
	}

	boolean result = false;
	public boolean findSequence (int [] array){
		for(int i = 0; i < array.length-3; i++){
			if (array [i] == 1 & array [i + 1] == 2 & array [i + 2] == 3)
			{
				result = true;
			}
		}
		return result;
		}

	public static void main (String[] args){
		System.out.println("Given an array of integer positive numbers. For example, {4, 6, 0, 1, 2, 3, 1, 9},\n"
				+ "but it can be any random. Write Java-program which returns True, if sequence {1, 2, 3} appears\n"
				+ "somewhere in the array. Provide additional boundary checks.");
        System.out.println("======================= Solution ==============================");
		Task11 One = new Task11();
		int [] array = new int [] {9,8,3,-5,1,2,2,7,9,3};
		System.out.println("In array:");
		beginner.Task1.showArray(array);
		if (One.isIntegerAr (array) == true & One.isPositiveAr (array) == true) {
			System.out.println("Result - " + One.findSequence(array));
		}
		else System.out.println("Result - error");
	}
}