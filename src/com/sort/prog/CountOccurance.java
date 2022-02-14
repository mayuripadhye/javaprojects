package com.sort.prog;

public class CountOccurance {
	public static void main(String[] args) {
		
		String str="My name is Mayuri Kirtani";
		int[] counter= new int[5];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch=='a'||ch=='A') {
				counter[0]++;
			}else if (ch =='e'|| ch=='E') {
				counter[1]++;
			}else if (ch =='i'|| ch=='I') {
				counter[2]++;
			}
			System.out.println("occurance of a is ::"+counter[0]);
			System.out.println("occurance of e is ::"+counter[1]);
			System.out.println("occurance of i is ::"+counter[2]);
		}
		
	}

}
