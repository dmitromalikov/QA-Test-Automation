package advanced;

public class Task1v2 {

	static int randomNum(int min, int max) {
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
	
	static public int [] createMask () {
		boolean validMask = false, nullMask = false, oneMask = false, twoMask = false;
		int lengthPassword = randomNum (8, 15);
//		System.out.println(lengthPassword);
		int [] maskArray = new int [lengthPassword];
		while (validMask == false) {
			for (int i = 0; i < lengthPassword; i++){
				maskArray [i] = randomNum(0,2);
//				System.out.println(Arrays.toString(maskArray));
			}
			
			for (int i = 0; i < lengthPassword; i++){
				if (maskArray [i] == 0) {
					nullMask = true;
				}
				if (maskArray [i] == 1) {
					oneMask = true;
				}
				if (maskArray [i] == 2) {
					twoMask = true;
				}
			}
			if (nullMask == true & oneMask == true & twoMask == true) {
				validMask = true;
			}
		}
		return maskArray;
	}
	
	static public char[] createPassword (int [] maskArray) {
		char [] passwordArray = new char [maskArray.length];
		for (int i = 0; i < maskArray.length; i++) {
			if (maskArray [i] == 0) {
				passwordArray [i] = (char) (randomNum(97, 122));
			}
			if (maskArray [i] == 1) {
				passwordArray [i] = (char) (randomNum(65, 90));
			}
			if (maskArray [i] == 2) {
				passwordArray [i] = (char) (randomNum(48, 57));
			}
		}
//		System.out.println(password);
		return passwordArray;
	}
	
	public static void main (String args[]){
		System.out.println("Password generator.\n"
        		+ "Apple ID requires a password strong enough to protect your account, data and money.\n"
        		+ "It's difficult to come up a good example of password which meets the following requirements from Apple:\n"
        		+ "- should include uppercase and lowercase Latin letters\n"
        		+ "- should include digit (-s)\n"
        		+ "- should be at least 8 characters.\n"
        		+ "Please write a program which generates a random password considering the above-mentioned requirements.\n"
        		+ "Choose the max length of password within reasonable limits (for ex. set mas password's length = 15).");
        System.out.println("======================= Solution ==============================");
		
//		createMask();
//		System.out.println(Arrays.toString(createMask()));
		System.out.println(createPassword(createMask()));
		
	}
}
