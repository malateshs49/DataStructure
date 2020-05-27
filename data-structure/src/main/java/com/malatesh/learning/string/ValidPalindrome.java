package com.malatesh.learning.string;

import java.util.Arrays;

//5ms
public class ValidPalindrome {
	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		String s = "race a car";
		System.out.println(vp.isPalindrome(s));
	}

	public boolean isPalindrome(String s) {
		if (s.trim().length() == 0) {
			return true;
		}
		String mala = s;
		int start = 0;
		int end = mala.length() - 1;

		while (start < end) {
			if (!checkIfAlphabet(mala.charAt(start))) {
				start++;

			}
			if (!checkIfAlphabet(mala.charAt(end))) {
				end--;

			}
			if (checkIfAlphabet(mala.charAt(start)) && checkIfAlphabet(mala.charAt(end))) {

				if (Character.toUpperCase(mala.charAt(start)) != Character.toUpperCase(mala.charAt(end))) {
					return false;
				} else {

					start++;
					end--;
				}
			}
		}

		return true;
	}

	private boolean checkIfAlphabet(char c) {
		if (Character.isDigit(c) || Character.isAlphabetic(c))
			return true;
		return false;
	}

}
