package com.test2;

class A {//클래스 앞에 final 이면 상속 불가
	void aMethod() {System.out.println("a Method");}
	//final void aMethod() {System.out.println("a Method");}
	//  메소드 앞에 파이널 붙으면 상속불가
}
class B extends A{
	void bMethod() {System.out.println("b Method");}
	void aMethod() {System.out.println("b Method on B class");}
}
class C extends B{
	void cMethod() {System.out.println("c Method");}
	void bMethod() {System.out.println("c Method of b class");}
	void aMethod() {System.out.println("c Method of a class");}
}

public class Test1 {
	static void goMethod(A a) {
		a.aMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		goMethod(a);
		A a1 = new B();
		goMethod(a1);
	}

}
