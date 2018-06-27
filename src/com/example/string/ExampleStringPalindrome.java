package com.example.string;

import java.util.Scanner;

public class ExampleStringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		
		String name=sc.nextLine();
		String reverse="";
	
		
		char[] ch=name.toCharArray();
	
		for(int i=ch.length-1;i>=0;i--) {
			//System.out.print(ch[i]+" ");
			reverse=reverse+ch[i];
		}
		
		//String reverse=new String(ch);
		System.out.println(reverse);
		
		
		System.out.println(reverse);
		if(name.equals(reverse))
           System.out.println("palindrome");
		else System.out.println("not a palindrome");
			
	}

}
