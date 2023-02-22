package threepracticestuff;

import java.util.Scanner;

public class Driver3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers would you like to input?");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your array numbers now:");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
	}
		

	public int Sum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}
	
	public int Mult(int[] input) {
		int sum = input[0];
		for (int i = 1; i < input.length; i++) {
			sum = sum*(input[i]);
		}
		return sum;
	}
	
	public static int[] Reverse(int[] input) {
		int reverse[] = new int[input.length];
		int counter = 0;
		
		for(int i = input.length - 1; i >= 0; i--) {
			reverse[counter] = input[i];
			counter++;
		}
		
		return reverse;
			
	}
	
	
}
