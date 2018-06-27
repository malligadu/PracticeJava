package com.example.oveload;


class A{
	A(){
		System.out.println("A class");
	}
}
class B extends A{
	B(){
		System.out.println("B class");
	}
}
public class Example2Overload {

	public static void main(String[] args) {
		B b=new B();

	}

}
