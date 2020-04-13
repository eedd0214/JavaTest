package com.test;


class A1{
	void aMethod() {
		System.out.println("aMethod");
	}
}
class B1 extends A1{
	void bMethod() {
		System.out.println("bMethod");
	}
	void aMethod() {
		System.out.println("aMethod on b1 class");
	}
		
}

class C extends A1{
	void cMethod() {
		System.out.println("cMethod");
	}
	void aMethod() {
		System.out.println("cMethod on c class");
	}
}
public class Test12 {
	static void callMethod(B1 b) {
		b.aMethod();
	}
	static void callMethod(C c) {
		c.aMethod();
	}
	static void callMethod(A1 a) {
		a.aMethod();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B1();
		a.aMethod();
		callMethod(new B1());
		callMethod(new C());
		callMethod(new B1());
		callMethod(new C());
	}

}
