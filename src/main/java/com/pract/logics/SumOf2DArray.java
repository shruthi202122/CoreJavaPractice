package com.pract.logics;

public class SumOf2DArray {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		SumOf2DArray array = new SumOf2DArray();
		int sum = array.calculateSum(a);
		System.out.println("sum of 2D array: "+sum);
		
	}
	public int calculateSum(int[][] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
		}
		return sum;
	}

}
