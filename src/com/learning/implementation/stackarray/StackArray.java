package com.learning.implementation.stackarray;

public class StackArray<T> {

	private Object[] stackObject;

	private int top;

	public StackArray(int capacity) {
		stackObject = new Object[capacity];
	}

	public void push(T t) {

		if (top == stackObject.length) {
			Object[] temp = new Object[2 * stackObject.length];
			System.arraycopy(stackObject, 0, temp, 0, top);
			stackObject = temp;
		}

		stackObject[top++] = t;
	}

	public void pop() {
		stackObject[--top] = null;
	}

	public void printElements() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.print(stackObject[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public int size() {
		return top;
	}

}
