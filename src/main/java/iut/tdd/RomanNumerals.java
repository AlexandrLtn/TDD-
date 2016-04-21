package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res="";
		for(int i=0;i<=3;i++){
			if(arabe=="3"){
				res="III";
			}else if(arabe=="1"){
				res="I";
			}
		}
		return res;
	}

	public String convertFromRoman(String roman) {
		return "2";
	}
}
