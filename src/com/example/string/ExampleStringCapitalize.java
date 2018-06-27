package com.example.string;

import java.util.Scanner;

public class ExampleStringCapitalize {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter text: ================ ");
		String text=sc.nextLine();
		
		 text=text.toUpperCase().charAt(0)+text.substring(1, text.length());
		System.out.println(text);

	}

}
