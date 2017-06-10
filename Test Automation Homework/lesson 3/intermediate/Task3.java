package intermediate;

import preIntermediate.Task4;

public class Task3 {
	public int [] reversArray (int [] ar){
	       for (int i = 0; ar.length/2 > i; i++) {
	            int tmp = ar[i];
	            ar[i] = ar[ar.length - i - 1];
	            ar[ar.length - i - 1] = tmp;
	        }
	       return ar;
	}

	public static void main (String[] args){
		int [] ar = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
		System.out.println("Reversed array.\n"
				+ "Write a method which takes an array and returns inverted one.");
		System.out.print("Initial array is: ");
		preIntermediate.Task4.showArray(ar);
		Task3 One = new Task3();
		System.out.print("Reversed array is: ");
		preIntermediate.Task4.showArray(One.reversArray(ar));
	}
}
