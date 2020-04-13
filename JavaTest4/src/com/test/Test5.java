package com.test;

class Student2 {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;//이 클래스의 객체를 지칭 this.
	}
	public void setAge(int age) {
		this.age = age;
	}

}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu = new Student2();
		stu.setName("이순신");
		stu.setAge(20);
	}

}
