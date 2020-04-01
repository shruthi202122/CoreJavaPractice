package com.pract.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 2, 5, 11, 4, 1, 10};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count++;
			boolean swap=false;
			for (int j = a.length - 1; j > i; j--) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println("loop count : "+count);
		
	}

}
