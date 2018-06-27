package com.example.oveload;

public class ExampleMethodOverLoad {

	/*public void method(Object obj) {
		System.out.println("Object method:");
	}*/
	/*public void method(String s) {
		System.out.println("String method:");
	}*/
	/*public void method(Integer s) {
		System.out.println("Integer method");
	}*/
	/*public void method(char[] c) {
		System.out.println("char array method");
	}*/
	
	public void method(Object s) {
		System.out.println("String method:");
	}
	public void method(StringBuilder sb1) {
		System.out.println("Stringbuffer method:");
	}
	
	
	public static void main(String[] args) {
		ExampleMethodOverLoad eload=new ExampleMethodOverLoad();
		eload.method(null);

	}

}
