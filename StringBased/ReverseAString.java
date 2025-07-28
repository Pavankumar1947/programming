package StringBased;

public class ReverseAString {
	public static void main(String[] args) {
		String str ="Pavan";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println(reverse);
	}

}
