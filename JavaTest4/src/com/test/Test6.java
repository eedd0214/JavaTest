package com.test;
class A {
	int aValue;
	public A() {
		System.out.println("Default Constructor A");
		this.aValue= 10;
	}
	public A(int aValue) {
		System.out.println("Constructor A");
		this.aValue =aValue;
	}
}
	
class B extends A{
	int bValue;
	public B() {
		System.out.println("Default Constructor B");
		this.bValue =100;//this 자기자신을 지칭
	}
	public B(int bvlaue) {
		super(300);//위에 a생성자가 호출됨
		this.bValue = bvlaue;
		System.out.println("Default Constructor B"+bvlaue+","+this.aValue);
	}
}
public class Test6 {

	public static void main(String[] args) {
		//A a = new A();
		//B b = new B();//두개 다 호출되는 이유 : 먼저 상위생성자 호출되고 하위생성자가 생성되기 때문
		B b1 = new B(200);
		
	}

}
