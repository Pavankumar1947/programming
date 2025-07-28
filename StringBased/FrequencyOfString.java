package StringBased;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {
	public static void main(String[] args) {
		String str ="pavanraj";
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		System.out.println(map);
	}
	

}
