package com.example.sorting;

public class ExampleBubblesort {

	public static void main(String[] args) {
		int[] arr= {3,45,67,90,3,0,12,2,4,1,-2,-8};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("after sorting array elements: ============== ");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
