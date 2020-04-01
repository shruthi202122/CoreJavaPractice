package com.pract.sort;

public class CharArraySelectionSort {

	public static void main(String[] args) {

		String s = "we have to fight corona";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for (char c : ch) {
			System.out.print(c+" ");
		}
	}

}
