package com.malatesh.learning.string;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveAdjacent {
	
	//21ms
	public static void main(String[] args) {
		RemoveAdjacent adjacent = new RemoveAdjacent();
		System.out.println(adjacent.removeDuplicates("abbaca"));
	}

	public String removeDuplicates(String S) {
		String s = "";
		char[] chara = S.toCharArray();
		char candidate = ' ';
		for (int i = 0; i < chara.length; i++) {
			if (candidate == chara[i]) {
				chara[i] = '\0';
				chara[i - 1] = '\0';
				candidate = '\0';
			} else {
				candidate = chara[i];
			}
		}
		s = new String(chara).replaceAll("\0", "");
		if (!s.equalsIgnoreCase(S))
			return removeDuplicates(s);
		return s;
	}

	public String removeDuplicates1(String S) {
		Stack<Character> queue = new Stack<Character>();
		String s = "";
		for (int i = 0; i < S.length(); i++) {
			if (!queue.isEmpty() && queue.peek() == S.charAt(i)) {
				queue.pop();
			} else {
				queue.push(S.charAt(i));
			}
		}
		Collections.reverse(queue);
		while (queue.size() > 0) {
			s += queue.pop();
		}
		return s;
	}

}
