package com.arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] number = { 1, 2, 4, 2, 4, 7, 5, 8, 7, 8, 5 };

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					System.out.println(number[j]);
					break;
				}

			}
		}
	}
}
