package com.malatesh.learning.string;

import java.util.Stack;
//0ms
public class ReverseString {

	public static void main(String[] args) {
		ReverseString str = new ReverseString();
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		str.reverseString(s);
	}

	public void reverseString(char[] s) {
		int k = s.length - 1;
		for (int i = 0; i < s.length / 2; i++) {
			char c = s[i];
			s[i] = s[k];
			s[k] = c;
			k--;
		}
		System.out.println(s);
	}

}
