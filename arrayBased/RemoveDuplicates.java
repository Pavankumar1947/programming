package arrayBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[]arr = {1,4,6,3,9,6};
		
		int [] list = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(list));
		
		Set<Integer> set = new HashSet<>();
		for(int ab : arr) {
			set.add(ab);
		}
		System.out.println(set);
		
		
		
		List<Integer> num = Arrays.asList(1,44,44,6,9,4,6,0);
		List<Integer> nums = num.stream().distinct().collect(Collectors.toList());
		System.out.println(nums);
		
		List<Integer> data = new ArrayList<>(num);
		
		Set<Integer> remove = new HashSet<>(data);
		
		List< Integer> res = new ArrayList<>(remove);
		System.out.println(res);
		

		
	}

}
