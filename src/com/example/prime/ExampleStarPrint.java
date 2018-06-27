package com.example.prime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleStarPrint {

	public static void main(String[] args) {
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("  ");
			}// for spaces
			for(int k=0;k<=i;k++) {
				System.out.print("*"+"  ");
			}
			System.out.println();
			
		}*/

		// String Capitalize
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("eneter text: ============= ");
		String text=sc.nextLine();
		String some="";
		
		char[] charr=text.toCharArray();
		for(int i=0;i<charr.length;i++) {
			if(i%2==0) {
				char c=text.toUpperCase().charAt(i);
				some=some+c;
			}
			else some=some+charr[i];
			
			
		}
		
		text=text.toUpperCase().charAt(0)+text.substring(1, text.length());
		System.out.println(text);
		
		System.out.println(some);*/
		
		
		
		//String digits and alphabet
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter email ================ ");
		String email=sc.nextLine();
		String digit="";
		String alphabet="";
		
		char[] charr=email.toCharArray();
		for(int i=0;i<charr.length;i++) {
			if(Character.isDigit(email.charAt(i))) {
				digit=digit+charr[i];
				
			}else alphabet=alphabet+charr[i];
			
		}
		
		System.out.println("digits are: ============ "+digit);
		System.out.println("alphabets fre ==========  "+alphabet);*/
		
		
		// compare two list duplicate elements
		
		/*List<String> list1=Arrays.asList("malli","vasu","satish","arun","siva");
		List<String> list2=Arrays.asList("vasu","malli","mass","ravi","rajesh");*/
		
		List<Integer> list1=Arrays.asList(1,3,5,6,10,3,45,56);
		List<Integer> list2=Arrays.asList(3,5,8,1,4,2);
		
		/*Set<String> dup=new HashSet(list1);
		Set<String> unique=new HashSet<>();*/
		
		Set<Integer> dup=new HashSet(list1);
		Set<Integer> unique=new HashSet();
		
		unique.addAll(list1);
		unique.addAll(list2);
		
		System.out.println(dup);
		System.out.println(unique);
		System.out.println("========================================");
		
		
		dup.retainAll(list2);
		unique.removeAll(dup);
		
		System.out.println("duplicates elements are: =============== "+dup);
		System.out.println("unique elements are: =============== "+unique);
		
		
		
		
		
		
		
		
		
		
		
	}

}
