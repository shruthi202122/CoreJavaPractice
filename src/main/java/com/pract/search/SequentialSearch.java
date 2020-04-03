package com.pract.search;

public class SequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element=7;
		int a[] = {2,4,5,1,6,3,8};
		boolean search = SequentialSearch.elementSearch(a, element);
		if(search) {
			System.out.println("element found : "+element);
		}
		else {
			System.out.println("element is not found : "+element);
		}
		
	}
	public static boolean elementSearch(int[] a,int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				
				return true;
			}
		}
		return false;
	}

}
