package beginner;

public class Task6way4 {
	public static void main (String[] args){
		System.out.println("Print all even numbers from range (0..50). Try to solve this in more than one way.\n"
				+ "Way 4.");
        System.out.println("======================= Solution ==============================");
		int a = 1;
		int b = 50;
		while (a <= b) {
		a = a + 1;
		if (a % 2 == 0) {
			System.out.print(" " + a);
		}
	}
	}
}
