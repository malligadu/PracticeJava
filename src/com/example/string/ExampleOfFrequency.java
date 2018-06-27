package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class ExampleOfFrequency {

	public static void main(String[] args) {
	/*	 String text="10011101101";
		String text="010201010100222112";
		 char[] arr=text.toCharArray();
		int[] arr1=new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 arr1[i]=Integer.parseInt(String.valueOf(arr[i]));
		 }
		 for(int i:arr1) {
			 System.out.print(i+" ");String text="10011101101";
		 }
		 Map<Integer,Integer> m=new HashMap();
		 for(int i:arr1) {
		   Integer value=m.get(i);
		   value=(value==null)? 1:++value;
		   m.put(i, value);
		 }

		 System.out.println(m);*/
		
		
		String s="hi how ru hello?";
		char[] ch=s.toCharArray();
		Map<Character,Integer> m=new HashMap();
		for(Character c:ch) {
			Integer value=m.get(c);
			value=(value==null)?1:++value;
			m.put(c, value);
		}
		System.out.println(m);
	}

}
