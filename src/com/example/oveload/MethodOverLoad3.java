package com.example.oveload;


class A1{
	A1(){
		System.out.println("class A constructor:");
	}
	public void method() {
		System.out.println("class A method:");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("class B constructor:");
	}
	public void method() {
		System.out.println("class B method:");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("class C constructor:");
	}
	public void method() {
		System.out.println("class C method:");
	}
}
public class MethodOverLoad3 {

	public static void method(A1 a) {
		System.out.println("A class method:");
		a.method();
	}
	public static void method(B1 b) {
		System.out.println("B class method:");
		b.method();
	}
	public static void method(C1 c) {
		System.out.println("C class method:");
		//c.method();
	}
	public static void main(String[] args) {
		method(null);

	}

}
