package com.test;
class Dog {
	public Dog() {
		age = 1;
		color = "Black";//°´Ã¼°¡ ÃÊ±âÈ­ÇÒ¶§ ¾²´Â °Í
		System.out.println("Default Constructor Dog");
	}
	public Dog(int ag, String clr) {
		age = ag;
		color = clr;
		
	}
	String bread;
	int age;
	String color;
	void barking() {}
	void hungry() {}
	void sleeping() {}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		Dog d2 = new Dog(2, "¶¯Ä¥ÀÌ");
		

	}

}
