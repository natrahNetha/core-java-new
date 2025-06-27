package com.arrays;

public class FindingMaxAndMinum {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5, 6, 7 };
		int max = 0;
		int min = 0;
		for (int arr : i) {
			if (arr > max)
				max = arr;
			if (arr < min)
				min = arr;
		}
		System.out.println(max);
		System.out.println(min);
	}

}
