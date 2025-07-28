package StringBased;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "Pavan";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> res : map.entrySet()){
			if(res.getValue()==1) {
				System.out.println(res.getKey());
				return;
				
			}
			
		}
	}
    
}