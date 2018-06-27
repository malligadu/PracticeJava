package com.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleStringSort {

	public static void main(String[] args) {
		/*String number="010201010100222112";
		
		char[] chArray=number.toCharArray();
		int[] arr=new int[chArray.length];
		
		for(int i=0;i<chArray.length;i++) {
			arr[i]=Integer.parseInt(String.valueOf(chArray[i]));
			System.out.print(arr[i]+" ");
		}

		Arrays.sort(arr);
		System.out.println("\n after sorting ====================");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		Map<Integer,Integer> m=new HashMap();
		for(int i:arr) {
			Integer value=m.get(i);
			value=(value==null)?1:++value;
			m.put(i,value);
		}
		System.out.println(m);*/
		
		// sorting string
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String ============= ");
		String name=sc.nextLine();
		
		String sorting="";
		
		
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					 char temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
				}
				}
			sorting=sorting+ch[i];
		}
		
		System.out.println("after sorting string ........ ");
		System.out.println(sorting);
		
		
	}

}
