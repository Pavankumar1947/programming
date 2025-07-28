package StringBased;

import java.util.Arrays;

public class AnagramCheckSorted {
	public static void main(String[] args) {
		String s1 = "pavan", s2 = "pnvaa";
		System.out.println(isAnagram(s1, s2) ? "true" : "false");
	}

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		return Arrays.equals(a1, a2);

	}

}
