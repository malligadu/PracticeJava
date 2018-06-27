package com.example.string;

import java.util.Scanner;

public class ExampleReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ================ :");
		String name=sc.nextLine();
		
		char[] chArray=name.toCharArray();
		for(int i=chArray.length-1;i>=0;i--) {
			System.out.print(chArray[i]+" ");
		}

	}

}
