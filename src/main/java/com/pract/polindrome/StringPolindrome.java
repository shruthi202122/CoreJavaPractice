package com.pract.polindrome;

public class StringPolindrome {

	public static void main(String[] args) {
	
		String s="madam";
		boolean result=true;
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				result=false;
			}
		}
		if(!result) {
			System.out.println(s+ "  is not a polindrome");
		}
		else {
			System.out.println(s+"  is a polindrome");
		}
	}

}
