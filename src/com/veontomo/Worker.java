package com.veontomo;

import java.util.ArrayList;
import java.util.List;

public class Worker {
	public int[] createArrayPrimitive(int size) {
		final int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = i;
		}
		return result;
	}

	public List<Integer> createArrayObject(int size) {
		final List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			result.add(i);
		}
		return result;
	}
}
