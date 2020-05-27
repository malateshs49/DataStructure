package com.malatesh.learning.string;

import java.util.Arrays;
import java.util.Stack;

//5ms
public class ReversePolishNotation {

	public static void main(String[] args) {
		ReversePolishNotation rv = new ReversePolishNotation();
		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		System.out.println(rv.evalRPN(tokens));
	}

	public int evalRPN(String[] tokens) {
		int val = 0;
		Stack<Integer> stacks = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (!tokens[i].equals("+") && !tokens[i].equals("*") && !tokens[i].equals("/") && !tokens[i].equals("-")) {
				val = Integer.parseInt(tokens[i]);
				stacks.push(val);
			} else {
				if (!stacks.isEmpty() && stacks.size() > 1) {
					int b = stacks.pop();
					int a = stacks.pop();
					if (tokens[i].equals("+")) {
						val = a + b;

					} else if (tokens[i].equals("-")) {
						val = a - b;

					} else if (tokens[i].equals("*")) {
						val = a * b;

					} else if (tokens[i].equals("/")) {
						val = a / b;

					}
					stacks.push(val);
				}
			}
		}
		return stacks.peek();
	}
}
