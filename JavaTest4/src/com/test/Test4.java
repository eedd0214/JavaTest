package com.test;
class Student{
	public void gotoSchool() {
		System.out.println("Student go to School");
	}
	public void study() {
		System.out.println("Student study");
	}
}
class MiddleStudent extends Student{
	public void gotoSchool() {
		System.out.println("MiddleStudent go to School");
	}
	public void study2() {
		System.out.println("MiddleStudent study");
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleStudent stu = new MiddleStudent();
		stu.gotoSchool();
		stu.study();
		stu.study2();
	}

}
