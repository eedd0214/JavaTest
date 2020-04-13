package com.test;
class Student4 {
	protected String name ;//상속에 대해서만 쓸수 있다.
	public Student4(String name) {
		this.name =name;
		System.out.println(name);
	}
}
class MiddleStudent4 extends Student4{
	int age;
	public MiddleStudent4(String name, int age) {
		super(name);
		
		//this.name= name;
		this.age=age;
		System.out.println(name+", "+age);
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleStudent4 mid = new MiddleStudent4("홍길동", 47);
		
	}

}
