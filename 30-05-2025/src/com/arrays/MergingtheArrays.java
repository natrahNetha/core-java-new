package com.arrays;

public class MergingtheArrays {
	public static void main(String[] args) {
		int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
