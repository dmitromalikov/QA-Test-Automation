package beginner;

import java.util.Scanner;

public class Task7 {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("How many elements would you like to create an array of integers?");
	int n = in.nextInt();
	int[] ar=new int[n];
	for (int i=1; i<=ar.length; i++) {
			System.out.println("Please enter integer ¹" + i + " from " + ar.length);
			int x = in.nextInt();
			ar[i-1]=x;
	}
	int max=0;
	for (int i=1; i<=ar.length; i++){
		if (ar[i-1] > max) {
			max =ar[i-1];
		}
	}
	System.out.println("The maximum number in the array is - " + max);
	}
}