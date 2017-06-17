package preIntermediate;

public class Task7 {
	int max = 0;
	int min = 999999999;
	
	public int minAr (int [] ar){
		for (int i=1; i<=ar.length; i++){
			if (ar[i-1] < min) {
				min = ar[i-1];
			}
		}
		return min;
	}
	public int maxAr (int [] ar){
		for (int i=1; i<=ar.length; i++){
			if (ar[i-1] > max) {
				max = ar[i-1];
			}
		}
		return max;
	}
	public static void main (String[] args){
		System.out.println("Given an array of integers. Write a method which finds max and min elements\n"
				+ "in it and multiplies them by 2");
        System.out.println("======================= Solution ==============================");
		int[] ar = new int[] {5,3,6,8,2,7,9,3,1,8};
		Task7 One = new Task7();
		System.out.println("Initial array of integers:");
		beginner.Task1.showArray(ar);
		System.out.println("The maximum number in the array is - " + One.maxAr(ar));
		System.out.println("The minimum number in the array is - " + One.minAr(ar));
		System.out.println("The maximum number multiplied by 2 is - " + One.maxAr(ar)*2);
		System.out.println("The minimum number multiplied by 2 is - " + One.minAr(ar)*2);
}

}
