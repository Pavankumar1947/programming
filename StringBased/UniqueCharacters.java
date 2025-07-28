package StringBased;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		String str = "pavan";
		System.out.println(isUnique(str));
	}

	private static boolean isUnique(String str) {
		long ab = str.chars().distinct().count();
		return ab == str.length();
	}
	
	
	

}
