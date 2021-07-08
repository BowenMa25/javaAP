package com.huaxia.ap2021.homeworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayHW1 {

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		printArray("Original numeric array : [", my_array1);
		Arrays.sort(my_array1);
		printArray("Sorted numeric array : [", my_array1);
	}

	static void printArray(String prefix, int[] arr) {
		System.out.print(prefix);
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println("]");
	}
}
