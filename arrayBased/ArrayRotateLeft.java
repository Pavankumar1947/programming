package arrayBased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayRotateLeft {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int first = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = first;
		System.out.println(Arrays.toString(arr));

//		 streams

		int brr[] = { 1, 2, 3, 4, 5, 6 };
		int fi = brr[0];
		List<Integer> list = Arrays.stream(brr).boxed().collect(Collectors.toList());

		list.remove(0);
		list.add(fi);
		System.out.println(list);

		// usign kth times
		int krr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		int n = krr.length;

		int[] kth = IntStream.concat(Arrays.stream(krr).skip(k), Arrays.stream(krr).limit(k)).toArray();
		System.out.println(Arrays.toString(kth));

	}

}
