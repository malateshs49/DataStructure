package com.malatesh.learning.string;

//0ms
public class ExcelColumnNumber {

	private String mainVal = "";

	public static void main(String[] args) {
		ExcelColumnNumber ex = new ExcelColumnNumber();
		System.out.println(ex.convertToTitle(26));
	}

	public String convertToTitle(int n) {
		return findCharacter(n);
	}

	private String findCharacter(int n) {
		int quotient = n / 26;
		String a = "", b = "";
		int reminder = n % 26;
		if (reminder == 0) {
			quotient--;
			reminder = 26;
		}
		if (n > 26) {

			if (quotient > 26) {
				mainVal += findCharacter(quotient);
			}
			if (reminder > 26) {
				mainVal += findCharacter(reminder);
			}
		} else {
			quotient = n;
			reminder = 0;
		}
		if (quotient != 0 && quotient <= 26)
			mainVal += String.valueOf((char) (quotient + 64));
		if (reminder != 0 && reminder <= 26)
			mainVal += String.valueOf((char) (reminder + 64));
		return mainVal;
	}

}
