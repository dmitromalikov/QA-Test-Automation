package preIntermediate;

public class Task13 {
	double a,b,c,d,x1,x2;

	public void quadEquation (double a, double b, double c){
		System.out.println("a = " + a);	
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		d = Math.pow(b, 2) - (4 * a * c);
		System.out.println("d = " + d);
		if (d > 0){
			x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
			x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
			System.out.printf("x1 = " + x1 + " x2 = " + x2);
			}
			else if (d == 0){
				x1 = ((-1) * b) / (2 * a);
				System.out.println("x1, x2 = " + x1);
				}
					else
						System.out.print("Error. D < 0");
			}

	public static void main (String[] args){
		System.out.println("Write a method for calculating quadratic equation. It takes a, b, c numbers and print the solution.");
        System.out.println("======================= Solution ==============================");
		Task13 One = new Task13();
		System.out.print("The solution: ");
		One.quadEquation(1,2,3);
}
}
