package com.pract.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 2, 5, 10, 3, 11, 1 };
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count++;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		System.out.println("count : "+count);
	}

}
