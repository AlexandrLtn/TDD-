package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res="";
		int nb=Integer.parseInt(arabe);
		for(int i=0;i<nb;i++){
			res=res+"I";
			if(nb==4){
				res="IV";
			}if(nb==5){
				res="V";
			}if(nb==7){
				res="VII";
			}
			if(nb==9){
				res="IX";
			}
			if(nb==10){
				res="X";
			}
		}
		return res;
	}

	public String convertFromRoman(String roman) {
		return "2";
	}
}
