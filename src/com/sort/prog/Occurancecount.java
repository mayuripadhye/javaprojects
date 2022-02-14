package com.sort.prog;

public class Occurancecount {

	public static void main(String[] args) {
		int vcount=0;
		String str="My name is mayuri siddesh kirtani";
		for(int i=0; i<str.length();i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
				System.out.println("total number of occurance of "+vcount);
			}
		}
	}

}
