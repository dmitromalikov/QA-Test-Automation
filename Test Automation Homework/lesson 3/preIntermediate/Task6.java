package preIntermediate;

public class Task6 {
double sum = 0;
	public double sumAr (int [] ar){
		for (int num = 0; num < ar.length; num++){
			sum = sum + ar[num];
			}
		return sum;
	}
	
	double average = 0;
	public double avgAr (int [] ar){
		average = sum / ar.length;
		return average;
	}
		public static void main (String[] args){
		System.out.println("Given an array of integers. Write a method which calculates sum of all\n"
				+ "elements and arithmetic average of them");
        System.out.println("======================= Solution ==============================");
		int[] ar = new int[] {5,3,6,8,2,7,9,3,1,8};
		Task6 One = new Task6();
		System.out.println("Initial array of integers:");
		beginner.Task1.showArray(ar);
		System.out.println("Sum of all elements: " + One.sumAr(ar));
		System.out.println("Arithmetic average of all elements: " + One.avgAr(ar));
		
}
}