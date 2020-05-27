package com.malatesh.learning.string;

import java.util.HashMap;
import java.util.Iterator;
//1ms
public class MajorityElement {

	public static void main(String[] args) {
		MajorityElement element = new MajorityElement();
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(element.majorityElement(nums));
	}

	public int majorityElement(int[] nums) {
		int count = 0, candidate = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {

			if (candidate == nums[i]) {
				count++;
			} else {
				if (count == 0) {
					candidate = nums[i];
				} else {
					count--;
				}
			}

		}
		return candidate;
	}

	public int majorityElement2(int[] nums) {
		int count = 0, majorityValue = 0;
		int size = nums.length / 2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				count = map.get(nums[i]);
				count++;
				map.put(nums[i], count);

			} else {
				map.put(nums[i], 1);
			}
		}
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			count = map.get(num);
			if (size < count) {
				majorityValue = num;
			}
		}

		return majorityValue;
	}

	public int majorityElement1(int[] nums) {
		int count = 0, majorityValue = 0;
		int size = nums.length / 2;

		for (int i = 0; i < nums.length; i++) {
			count = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < Integer.MAX_VALUE && nums[i] == nums[j]) {
					nums[j] = Integer.MAX_VALUE;
					count++;
				}
			}
			if (size < count) {
				majorityValue = nums[i];
			}
		}

		return majorityValue;
	}

}
