package StringBased;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String str= "pavankumarreddy";
		int voewl=0,cons=0;
		
		str = str.toLowerCase();
		for(char c: str.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c)!= -1) {
					voewl ++;
				}else cons++;
			}
		}
		System.out.println(voewl +" "+ cons);
		
		
		
		Long vo = str.chars().filter(Character::isLetter).filter(c->"aeiou".indexOf(c)!= -1).count();
		long co = str.chars().filter(Character::isLetter).filter(c->"aeiou".indexOf(c)== -1).count();
		
		System.out.println(vo +" "+ co);
	}

}
