package preIntermediate;

public class Task4 {
	public void secondHalf(int[] ar){
		if (ar.length % 2 == 0) {
		for (int i=ar.length/2; i < ar.length; i++) {
		System.out.println(ar[i]);
		}
		}
		else
			for (int i=ar.length/2; i < ar.length; i++) {
				System.out.println(ar[i]);
			}
			}
	public static void main (String[] args){
		int[] ar = new int[] {5,7,98,3,6,11,54,22,73};
		System.out.println("Given an array of integers. Write a method which prints the second half of the array.\n"
			+ "Include the middle element to output, if the array has odd number of elements.");
        System.out.println("======================= Solution ==============================");
		Task4 One = new Task4();
		System.out.println("Initial array of integers:");
		beginner.Task1.showArray(ar);		
		System.out.println("Second half of the array:");
		One.secondHalf(ar);
	}
}