package beginner;

public class Task2 {
	
	public boolean checkNumbers (int x, int y) {
		if (x==10 || y==10 || x+y == 10){
		return true;
		}
		else return false;
	}
	public static void main(String[] args) {
	int x = 2;
	int y = 8;
	Task2 One = new Task2();
	System.out.println("Given two integers, x and y.\n"
			+ "Create a method (program) which returns True if one if them is 10 or if their sum is 10");
    System.out.println("======================= Solution ==============================");
	System.out.println("Initial numbers x = " + x);
	System.out.println("Initial numbers y = " + y);
	System.out.println("Calculated z = " + (x+y));
	System.out.println("Result = " + One.checkNumbers(x,y));
	}
}