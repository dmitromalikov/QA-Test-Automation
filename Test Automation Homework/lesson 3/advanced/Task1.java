package advanced;

public class Task1 {

	static private String [] data = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a",
			"s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "Q",
			"W", "E","R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J",
			"K", "L", "Z", "X", "C", "V","B", "N", "M", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "0"};
	
	static private int randomNum(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
		
	public static void main(String[] args) {
    	System.out.println("Password generator.\n"
        		+ "Apple ID requires a password strong enough to protect your account, data and money.\n"
        		+ "It's difficult to come up a good example of password which meets the following requirements from Apple:\n"
        		+ "- should include uppercase and lowercase Latin letters\n"
        		+ "- should include digit (-s)\n"
        		+ "- should be at least 8 characters.\n"
        		+ "Please write a program which generates a random password considering the above-mentioned requirements.\n"
        		+ "Choose the max length of password within reasonable limits (for ex. set mas password's length = 15).");
        System.out.println("======================= Solution ==============================");
    	for (int m = 0; m < 5; m++){
    		int length = randomNum(8,15);
    		
    		String [] p = new String [length];
    		
    		for (int i=0; i < length; i++) {
    			p [i] = data[randomNum(0,data.length-1)];
    		}
    		String password = "";
    		
    		for (String s : p){
   			password += s;
    		}
    		System.out.println(password);
    	}
    }
}
