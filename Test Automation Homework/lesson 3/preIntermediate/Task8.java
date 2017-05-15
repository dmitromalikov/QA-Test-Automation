package preIntermediate;

public class Task8 {
	public static void main (String[] args){
	long n1 = 1;
	long n2 = 1;
	long n3;
	int m = 2;
	long sum = 2;
	for (int k=1; m < 100; k++){
		n3 = n1 + n2;
		if ((n3 % 2) != 0) {
			m = m + 1;
//			System.out.println(m + " " + n3);
			sum = sum + n3;
			}
		n1 = n2;
		n2 = n3;
	}
	System.out.println("Sum of first " + m + " odd elements of Fibonacci sequence is " + sum);	
	}
}
