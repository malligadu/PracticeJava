package com.example.string;

import java.util.Arrays;

public class ExampleAnagram {

	public static void main(String[] args) {
		String s1="Malli";
		String s2="Amill";
		
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		/*int count=0;
		
		if(text1.length()!=text2.length())
			System.out.println("no anagram");
		else {
			for(int i=0;i<text1.length();i++) {
				char c=text1.charAt(i);
				for(int j=0;j<text2.length();j++) {
					if(c==text2.charAt(j)) {
						count++;
					}
				}
				if(count==0)
					break;
			}
			if(count==0)
				System.out.println("no anagram");
			else System.out.println("yes anagram");
		}

		System.out.println(count);*/
		
		
	boolean flag=true;
	
	if(s1.length()!=s2.length()) {
		flag=false;
	}
	
	else {
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		flag=Arrays.equals(c1, c2);
		}
		
	if(flag)
		System.out.println("agaram");
	else System.out.println("no anagram");

}
}
