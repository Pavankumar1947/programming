package StringBased;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates_string {
	public static void main(String[] args) {
		String str = "Pavan";
		String res = str.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
		System.out.println(res);
		
		
		Set<Character> set = new LinkedHashSet<>();
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : set) {
			sb.append(c);
		}
		
		System.out.println(sb);
	}

	
}
 