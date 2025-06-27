package com.arrays;

public class SumofElements {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5, 6, 7 };

		int sum = 0;
		for (int num : i) {
			sum += num;
		}
		System.out.println(sum);
	}
}
