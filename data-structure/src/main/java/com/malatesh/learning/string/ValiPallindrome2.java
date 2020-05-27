package com.malatesh.learning.string;

public class ValiPallindrome2 {

	//8ms
	public static void main(String[] args) {

		ValiPallindrome2 vp = new ValiPallindrome2();
		String s = "abca";
		System.out.println(vp.isPalindrome(s));
	}

	private boolean FirstTime = true;

	public boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				if (FirstTime) {
					FirstTime = false;
					String temp = s.substring(0, start) + s.substring(start + 1, s.length());
					String temp1 = s.substring(0, end) + s.substring(end + 1, s.length());
					boolean a = (CheckBoolean(temp));
					boolean b = (CheckBoolean(temp1));
					if (a || b) {
						return true;
					} else {
						return false;
					}
				}
			}
			start++;
			end--;
		}

		return true;
	}

	public boolean CheckBoolean(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}

		return true;
	}
}
