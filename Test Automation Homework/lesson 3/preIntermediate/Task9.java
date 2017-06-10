package preIntermediate;

public class Task9 {
	public void ShowMultTable (int n){
	for (int i=1; i<=10; i++) {
		System.out.println(n + " x " + i + " = " + (n*i));
	}
	}
	public static void main (String[] args){
		System.out.println("Write a method which prints multiplication table for the input number.");
		Task9 One = new Task9();
		int n = 7;
		System.out.println("The multiplication table for the number - " + n);
		One.ShowMultTable(n);
	}
}
