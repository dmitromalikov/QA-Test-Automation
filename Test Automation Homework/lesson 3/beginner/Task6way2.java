package beginner;

public class Task6way2 {
	int a = 0;
	public void printNumbers (){
		for (int i = 0; i <= 24; i++) {
		a = a + 2;
		System.out.print(a);
		System.out.print(" ");
		}
	}
	public static void main (String[] args){
		System.out.println("Print all even numbers from range (0..50). Try to solve this in more than one way.\n"
				+ "Way 2.");
		Task6way2 One = new Task6way2();
		One.printNumbers();
	}
}
