package Task3;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("task3");
		int numbers[] = { 65, 9000, 87, 12, 45, 10, 25, 58, 2, 45, 1, 65, 69 };
		int x = averageValue(numbers);
		int y = findMin(numbers);
		for (int i = (numbers.length - 1); i > 0; i--) {
			if (numbers[i] == y) {
				numbers[i] = x;
				System.out.println(Arrays.toString(numbers));
				return;
			}
		}
	}

	public static int averageValue(int[] numbers) {
		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			k = k + numbers[i];
		}
		int z = k / numbers.length;
		return z;
	}

	public static int findMin(int[] numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
}



