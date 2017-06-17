package beginner;

public class Task8 {
	public String printText(int n, String s){
		while (n > 0) {
			s = s.substring(0, n);
			System.out.print(s);
			n = n-1;
			}
		return s;
	}
	
	public static void main (String[] args){
		int n = 4;
		String s = "Testing";
	System.out.println("Given a string and an int n. Return a string made of the first n characters of the string,\n"
			+ "followed by the first n-1 characters of the string, and so on.");
    System.out.println("======================= Solution ==============================");
	System.out.println("String = " + s);
	System.out.println("Int n = " + n);
	Task8 One = new Task8();
	System.out.println(One.printText(n,s));
}
}
