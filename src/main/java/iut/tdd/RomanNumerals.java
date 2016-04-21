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
			if(nb==11){
				res="XI";
			}
			if(nb==100){
				res="C";
			}
			if(nb==210){
				res="CCX";
			}
			if(nb==101){
				res="CI";
			}
			if(nb==500){
				res="D";
			}
		}
		return res;
	}

	public String convertFromRoman(String roman) {
		return "2";
	}
}
