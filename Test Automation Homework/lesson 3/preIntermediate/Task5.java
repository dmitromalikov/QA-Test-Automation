package preIntermediate;
public class Task5 {
	public boolean checkArray(int [] ar) {
		for (int k = 0; k < ar.length; k++) {
			if (ar[k] == 7 | ar[k] == 9)
			{
			return false;
			}
			}
		return true;
		}

	public static void main (String[] args){
		int[] ar = new int[] {5,8,444,8,22};
		System.out.println("You don't like number 7 and number 9. Write a method which checks input array\n"
				+ "and returns True if the array doesn't contain your unloved numbers");
        System.out.println("======================= Solution ==============================");
	Task5 One = new Task5();
	System.out.println("Initial array of integers:");
	beginner.Task1.showArray(ar);
	System.out.println("Result: " + One.checkArray(ar));
}
}