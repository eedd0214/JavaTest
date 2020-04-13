package com.test;
class MyClass3{
	int a;
	static int b;

	public static void setAValue(int x) {
		b=x;
	}
	public void setBValue(int y) {
		a=y;
	}
	
}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass3.b = 20;
		MyClass3 m = new MyClass3();
		m.a=10;
		m.b=20;

	}

}
