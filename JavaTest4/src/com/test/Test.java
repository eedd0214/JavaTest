package com.test;
class Dog {
	public Dog() {
		age = 1;
		color = "Black";//객체가 초기화할때 쓰는 것
		System.out.println("Default Constructor Dog");
	}
	public Dog(int ag, String clr) {
		age = ag;
		color = clr;
		
	}
	String bread;
	int age;
	String color;
	void barking() {}//값이 반환되지 않는 타입
	int hungry() {
		int a =1;
		int b =2;
		int c =a+b;
		return c;//값이 반환되는 타입
	}
	void sleeping() {}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		Dog d2 = new Dog(2, "땡칠이");
		int s =d.hungry();
		int s2 = d2.hungry();
		System.out.println(s);

	}

}
