package com.test;

class Animal2{
	void move() {
		System.out.println("Animal move");
	}
}
class Dog2 extends Animal2{
	void move() {
		System.out.println("Dog move");
	}
}
class Cat2 extends Animal2{
	void move() {
		System.out.println("Cat move");
	}
}


public class Test13 {
	static void goMove(Animal2 a) {
		a.move();
	}
	public static void main(String[] args) {
		System.out.println("=========�ִϸ� Ÿ���� �ִϸ� ��ü==========");
		Animal2 a =new Animal2();
		a.move();
		System.out.println("=========���� Ÿ���� ���� ��ü=============");
		Dog2 d =new Dog2();
		d.move();
		System.out.println("=========���� Ÿ���� ���� ��ü=============");
		Cat2 c =new Cat2();
		c.move();
		
		System.out.println("=========�ִϸ� Ÿ���� ���� ��ü===========");
		Animal2 a2 =new Dog2();
		a2.move();
		System.out.println("=========�ִϸ� Ÿ���� Ĺ ��ü===========");
		Animal2 a3 =new Cat2();
		goMove(a3);
		
	}
}