package com.example.string;

import java.util.Scanner;

public class RemoveDigits {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter string ======== ");
	 String name=sc.nextLine();
	 
	 String digit="";
	 String alphabet="";
	 
	 char[] ch=name.toCharArray();
	 for(int i=0;i<ch.length;i++) {
		 if(Character.isDigit(name.charAt(i))) {
			 digit=digit+ch[i];
			 
		 }else
			 alphabet=alphabet+ch[i];
	 }
	 
	 System.out.println(digit+" ============= ");
	 System.out.println(alphabet);
	 

	}

}
