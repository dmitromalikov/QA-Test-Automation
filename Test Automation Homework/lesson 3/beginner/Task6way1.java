package beginner;

public class Task6way1 {
	int a = 0;
	public void printNumbers (){
		for (int i = 0; i <= 50; i++) {
		a = a + 1;
		if (a % 2 == 0) {
			System.out.print(a);
			System.out.print(" ");
		}
	}
	}
	public static void main (String[] args){
		System.out.println("Print all even numbers from range (0..50). Try to solve this in more than one way.\n"
				+ "Way 1.");
		Task6way1 One = new Task6way1();
		One.printNumbers();
	}
}