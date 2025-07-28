package arrayBased;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target = 11;
		int[] result = towAdd(num, target);
		System.out.println(Arrays.toString(result));
	}

	static int[] towAdd(int[] num, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			int ab = target - num[i];

			if (map.containsKey(ab)) {
				return new int[] { map.get(ab), i };
			}
			map.put(num[i], i);
		}

		return new int[] {};

	}

}
