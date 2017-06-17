package intermediate;

import java.util.*;

public class Task5 {
	static int convertTo;
	static double t;
	public static void enterData (){
		System.out.println("If you want to convert Celsius into Kelivins, enter 1.\n"
				+ "If you want to convert Kelvin into Celsius - type 2.");
		Scanner in = new Scanner(System.in);
		convertTo = in.nextInt();
		System.out.println("Please enter the temperature for conversion in the format \"0,00\".");
		t = in.nextDouble();	
	}
	
public static void main (String[] args){
	System.out.println("Temperature converter.\n"
			+ "Write a program for temperature converter between Celsius and Kelvin and vice versa.\n"
			+ "Use OOP for realizing separate class with appropriate methods and call them in the main class of your program");
    System.out.println("======================= Solution ==============================");
	enterData();
	Task5Converter.converterTemperature(convertTo, t);
}
}
