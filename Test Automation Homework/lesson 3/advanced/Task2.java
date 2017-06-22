package advanced;

public class Task2 {
	
	public boolean isValidArabic(int x) {
		String num = String.valueOf(x);
		for (int k = 0; k < num.length(); k++) {
			if (Character.isDigit(num.charAt(k)) == false) {
				return false;
			}
		}
		if (x > 2015 ||x < 0) {
			return false;
		}
		return true;
	}

	public String toRoman(int num) {
	if (isValidArabic(num)) {
		String Roman = "";
		String onesArray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String tensArray[] = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String hundredsArray[] = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	
		int ones = num % 10;
		num = (num - ones) / 10;
		int tens = num % 10;
		num = (num - tens) / 10;
		int hundreds = num % 10;
		num = (num - hundreds) / 10;
		
		for (int i = 0; i < num; i++) {
			Roman += "M";
		}
		if (hundreds >= 1) {
			Roman += hundredsArray[hundreds - 1];
		}
		if (tens >= 1) {
			Roman += tensArray[tens - 1];
		}
		if (ones >= 1) {
			Roman += onesArray[ones - 1];
		}
	return String.valueOf(Roman);
	}
	else {
	return null;
		}
	}

	public static void main (String[] args){
		int x = 2001;
		System.out.println("Years converter.\n"
				+ "Write a program which takes Arabic numerals in range (0..2015) and returns their Romanian analogue.\n"
				+ "Do not create dual converter, just Arabic > Romanian.");
        System.out.println("======================= Solution ==============================");
        System.out.println("Initial Arabic year = " + x);
		Task2 One = new Task2 ();		
		System.out.println("Romanian year = " + One.toRoman(x));
		}
}