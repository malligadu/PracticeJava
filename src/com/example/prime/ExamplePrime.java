package com.example.prime;

import java.util.Scanner;

public class ExamplePrime {
	public static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		
		return num>0 && flag;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ============ ");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++) {
		System.out.println(i+" prime or not ? ===============: "+isPrime(i));
		}
		

	}

}
