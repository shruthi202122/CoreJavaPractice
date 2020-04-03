package com.pract.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 10, 12, 20, 25, 29, 30 };
		int element = 20;
		int startIndex = 0, endIndex = a.length - 1;
		boolean binarySearch = BinarySearch.binarySearch(a, element, startIndex, endIndex);
		if(binarySearch) {
			System.out.println("element found : "+element);
		}
		else {
			System.out.println("element is not found : "+element);
		}

	}

	public static boolean binarySearch(int[] ar, int element, int startIndex, int endIndex) {
		if (startIndex == endIndex) {
			if (element == ar[startIndex]) {
				return true;
			} else
				return false;
		}

		int midIndex = (startIndex + endIndex) / 2;

		if (element == ar[midIndex]) {

			
			return true;
		} else if (element < ar[midIndex]) {

			return binarySearch(ar, element, startIndex, midIndex - 1);
		} else {

			return binarySearch(ar, element, midIndex + 1, endIndex);
		}

	}

}
