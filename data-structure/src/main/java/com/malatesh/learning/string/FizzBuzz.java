package com.malatesh.learning.string;

import java.util.ArrayList;
import java.util.List;
//1ms
public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz buzz = new FizzBuzz();
		System.out.println(buzz.fizzBuzz(15));
	}

	public List<String> fizzBuzz(int n) {
		List<String> array = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				array.add("FizzBuzz");
			} else if (i % 3 == 0) {
				array.add("Fizz");
			} else if (i % 5 == 0) {
				array.add("Buzz");
			} else {
				array.add(String.valueOf(i));
			}

		}
		return array;
	}
}
