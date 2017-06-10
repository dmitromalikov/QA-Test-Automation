package preIntermediate;

public class Task11 {
//	public void error
	
//	public boolean isInteger (int [] array){
//	for(int i = 0; i < array.length; i++){
//	if (array [i] % 2 ==! 0)
//			{
//				result = true;
//			}
//		}
//	}
//	public boolean isPositive (int [] array){
	
//	public void showArray (int [] array){
//		for(int i = 0; i < array.length; i++)
//			System.out.print(array[i] + " ");
//		}
	
//	public void checkArrayIntPositive(int[] array){
//	        int i = 10;
//	        while (i > 0) {
//	            try {
//	                int str = new Scanner(System.in).nextInt();
//	            } catch (InputMismatchException e) {
//	                System.out.println("You did not enter an integer!");
//	            }
//	            i--;	
//	}
	
	
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
		Task11 One = new Task11();
		int [] array = new int [] {9,8,3,5,1,2,1,7,9,3};
		System.out.println("In array:");
		Task4.showArray(array);
		System.out.println("Result - " + One.findSequence(array));
}
}