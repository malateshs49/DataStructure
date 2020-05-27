package com.malatesh.learning.string;

public class RemoveAdjacent2 {

	//27ms
	public static void main(String[] args) {
		RemoveAdjacent2 rm = new RemoveAdjacent2();
		System.out.println(rm.removeDuplicates("deeedbbcccbdaa", 3));
	}

	public String removeDuplicates(String s, int k) {
		String st = "";
		int count = 0;
		int j = 0;
		char[] chara = s.toCharArray();
		char candidate = ' ';
		for (int i = 0; i < chara.length; i++) {
			if (candidate == chara[i]) {
				count++;
				if (count == k) {
					j = 0;
					while (j < k) {
						chara[i - j] = '\0';
						j++;
					}
					candidate = '\0';
				}
			} else {
				count = 0;
				candidate = chara[i];
				count = 1;
			}
		}
		st = new String(chara).replaceAll("\0", "");
		if (!st.equalsIgnoreCase(s))
			return removeDuplicates(st, k);
		return st;
	}
}
