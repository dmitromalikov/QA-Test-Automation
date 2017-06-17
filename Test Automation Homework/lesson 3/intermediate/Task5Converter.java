package intermediate;

public class Task5Converter {

	public static void converterTemperature(int convertTo, double t){
		if (convertTo == 1){
			t = t + 273;
			System.out.println("Result = " + t + " K");
		}
		else if (convertTo == 2){
			t = t - 273;
			System.out.println("Result = " + t + " C");
		}
		else System.out.println("Input Error");
	}
}
