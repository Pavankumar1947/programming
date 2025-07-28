package arrayBased;

public class MaxMinInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 6, 8, 1, 9 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println(min + " " + max);
	}

}
