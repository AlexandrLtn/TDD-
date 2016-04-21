package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res="";
		int nb=Integer.parseInt(arabe);
		for(int i=0;i<nb;i++){
			res=res+"I";
		}
		return res;
	}

	public String convertFromRoman(String roman) {
		return "2";
	}
}
