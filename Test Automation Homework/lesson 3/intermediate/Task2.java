package intermediate;

public class Task2 {
	int number = 0;
	public int luckyTicket (){
		int n1, n2, n3, n4, n5, n6;
	       for(int i = 1; i < 1000000; i++){
	            n1 = i / 100000 % 10;
	            n2 = i / 10000 % 10;
	            n3 = i / 1000 % 10;
	            n4 = i / 100 % 10;
	            n5 = i / 10 % 10;
	            n6 = i % 10;
	            if((n1 + n2 + n3) == (n4 + n5 + n6)){
	                number++;
	            }
	        }
	       return number;       
	    }
	
	public static void main (String[] args){

		System.out.println("Lucky tickets. As you may know tram tickets have numbering in the range \n"
				+ "from 000 001 to 999 999. Many people try to find a lucky ticket, where the sum of the \n"
				+ "first three digits = the sum of the second three digits. For example, 205 151 is a lucky \n"
				+ "ticket. Write a program for calculating of how many lucky tickets people can find in the one roll.");
        System.out.println("======================= Solution ==============================");
		Task2 One = new Task2();
		System.out.print("Number of lucky tickets = " + One.luckyTicket());
		}
}