package com.pract.logics;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{6,7,8} };
		int[][] b = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 },{1,2,3} };
		SumOfTwoMatrices s = new SumOfTwoMatrices();
		int[][] a1 = s.findSumOfTwotrices(a, b);
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[i].length; j++) {
				System.out.print(a1[i][j] + " ");
			}
			System.out.println("\n");

		}

	}

	public int[][] findSumOfTwotrices(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}

		}

		return c;

	}

}
