package com.malatesh.learning.string;
//9ms
public class CommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "a" };
		CommonPrefix cp = new CommonPrefix();
		System.out.println(cp.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		String subString = "";
		int count = 0;
		if (strs.length > 0) {
			String first = strs[0];
			for (int i = 0; i < first.length(); i++) {
				count = 0;
				for (int j = 0; j < strs.length; j++) {
					if (i < strs[j].length()) {
						if (first.charAt(i) != strs[j].charAt(i)) {
							count--;
						} else {
							count++;
						}
					}
				}
				if (count == strs.length) {
					subString += first.charAt(i);
				} else {
					break;
				}
			}

		}
		return subString;
	}

	public String longestCommonPrefix1(String[] strs) {
		String min = null;
		String subString = "";
		int minVal = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minVal) {
				min = strs[i];
				minVal = strs[i].length();
			}
		}

		for (int i = 0; i < min.length(); i++) {
			count = 0;
			for (int j = 0; j < strs.length; j++) {
				if (min.charAt(i) != strs[j].charAt(i)) {
					count--;
				} else {
					count++;
				}
			}
			if (count == strs.length) {
				subString += min.charAt(i);
			} else {
				break;
			}

		}
		return subString;
	}

}
