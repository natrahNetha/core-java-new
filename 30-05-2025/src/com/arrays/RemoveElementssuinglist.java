package com.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveElementssuinglist {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 5, 3, 6, 5 };
		Set<Integer> set = new LinkedHashSet<>();
		
		

		for (int num : arr) {
			set.add(num);
		}

		System.out.println("Array after removing duplicates:");
		for (int num : set) {
			System.out.print(num + " ");
		}
	}

}
