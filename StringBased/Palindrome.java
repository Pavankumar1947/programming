package StringBased;

public class Palindrome {
	public static void main(String[] args) {
		String str = "PAVAPq";
		if(isPalindrome(str)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
//	public static boolean isPalindrome(String str) {
//		int i=0, j=str.length()-1;
//		while(i<j) {
//			if(str.charAt(i++) != str.charAt(j--)) return false;
//		}
//		return true;
//	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder builder = new StringBuilder(str);
		return str.equalsIgnoreCase(builder.reverse().toString());
	}

}
