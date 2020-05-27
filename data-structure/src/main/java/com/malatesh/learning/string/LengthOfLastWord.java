package com.malatesh.learning.string;
//1ms
public class LengthOfLastWord {

	public static void main(String[] args) {
		String input = "Hello World  ";
		System.out.println(lengthOfLastWord(input));
	}

	public static int lengthOfLastWord(String s) {
		int count = 0;
		int n = s.length();
		int i = 0;

		while (i < n) {

			if (s.charAt(i) != ' ') {
				count++;
				i++;
			} else {
				while (i < n && s.charAt(i) == ' ') {
					i++;
				}
				if (i == n)
					return count;
				else
					count = 0;
			}
		}
		return count;
	}
}
