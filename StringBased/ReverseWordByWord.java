package StringBased;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordByWord {
	public static void main(String[] args) {
		String str = "pavan kumar reddy";
		String rev = reverseWordByWord(str);
		System.out.println(rev);

		String ab = reverseUsingStreams(str);
	}

	public static String reverseWordByWord(String str) {
		String[] words = str.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	// using streams

	private static String reverseUsingStreams(String str) {
		return Arrays.stream(str.split(" ")).map(word -> new StringBuilder(str).reverse().toString())
				.collect(Collectors.joining(" "));
	}

}
