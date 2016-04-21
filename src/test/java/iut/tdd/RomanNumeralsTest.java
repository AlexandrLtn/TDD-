package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void convertToRoman(){
		RomanNumerals romanNumeral = new RomanNumerals();
	Assert.assertEquals("I", romanNumeral.convertToRoman("1"));
	Assert.assertEquals("III", romanNumeral.convertToRoman("3"));
	Assert.assertEquals("IV", romanNumeral.convertToRoman("4"));
	Assert.assertEquals("V", romanNumeral.convertToRoman("5"));
	Assert.assertEquals("X", romanNumeral.convertToRoman("10"));
	Assert.assertEquals("D", romanNumeral.convertToRoman("500"));
	Assert.assertEquals("C", romanNumeral.convertToRoman("100"));
	Assert.assertEquals("CI", romanNumeral.convertToRoman("101"));
	Assert.assertEquals("CCX", romanNumeral.convertToRoman("210"));
	Assert.assertEquals("XI", romanNumeral.convertToRoman("11"));
	Assert.assertEquals("IX", romanNumeral.convertToRoman("9"));
	Assert.assertEquals("VII", romanNumeral.convertToRoman("7"));
	}
}
