package preIntermediate;

public class Task8 {
	long n1 = 1;
	long n2 = 1;
	long n3 = 0;
	long n4 = 0;
	long sum = 1;
	int count = 1;
	public long sumOddFibonacci(long n1, long n2, int m){
	while (count < m){
		n3 = n1 + n2;
		n4 = n2 + n3;
		sum = sum + n3;
		count = count + 1;
		System.out.println (count + " - " + sum);
		n1 = n3;
		n2 = n4;
	}
	return sum;	
	}
	public static void main (String[] args){
	System.out.println("Write a method which calculates a sum of first 100 odd elements of Fibonacci sequence.");
	Task8 One = new Task8();
	System.out.println("Sum of first 100 odd elements of Fibonacci sequence is " + One.sumOddFibonacci(1, 1, 100));
}
}
