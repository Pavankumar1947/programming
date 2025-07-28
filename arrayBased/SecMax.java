package arrayBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecMax {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 5, 3, 8, 4 };

//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		int large = Integer.MIN_VALUE;
		int scLar = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > large) {
				scLar = large;
				large = num;
			} else if (num > scLar && num != large) {
				scLar = num;
			}
		}
		System.out.println(scLar);

		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 66, 22);
		
		

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : list) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		System.out.println("Second Largest: " + secondLargest);

		Optional<Integer> secMax = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(secMax.orElse(null));
	}

}
