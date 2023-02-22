package threepracticestuff;

public class Driver3 {

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
}
