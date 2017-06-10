package preIntermediate;

public class Task4 {
	public static void showArray(int[] ar){
		for(int element : ar)
			System.out.print(element + " ");
			System.out.println();
		 }
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
		Task4 One = new Task4();
		System.out.println("Initial array of integers:");
		One.showArray(ar);		
		System.out.println("Second half of the array:");
		One.secondHalf(ar);
	}
}