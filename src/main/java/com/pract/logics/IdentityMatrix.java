package com.pract.logics;

public class IdentityMatrix {

	public static void main(String[] args) {

		int[][] a = { { 1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		boolean result = IdentityMatrix.findIdentityMatrixOrNot(a);
		if (result) {
			System.out.println("Identity Matrix");
		} else {
			System.out.println("Not Identity");
		}

	}

	public static boolean findIdentityMatrixOrNot(int[][] a) {
		boolean result = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
					result = false;
					break;
				}
			}
		}

		return result;
	}

}
