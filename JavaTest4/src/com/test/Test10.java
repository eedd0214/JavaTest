package com.test;
class MyClass4{
	static int a;
	static int b;
	static {
		a=1;
		b=2;
		System.out.println("Static Initialize");
	}
}
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass4 m =new MyClass4();
		
	}

}
