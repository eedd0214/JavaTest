package com.test;
class Student5{
	protected String name;//하위 클래스에서 사용이 가능함
	protected int age;
	public Student5(String name, int age) {
		this.name=name;
		this.age = age;
		
	}
}
class Highstudent5 extends Student5{
	int grade;
	public Highstudent5(String name, int age, int grade) {
		super(name, age);//상위 클래스의 값을 그대로 가져옴
		this.grade = grade;
	}
	void setNameAge(String name, int age) {//여러줄 쓰는거보다 위에 슈퍼 쓰는게 이득
		this.name =name;
		this.age = age;
	}
	void study() {
		System.out.println(name+" " +age+" "+grade);
	}
}
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Highstudent5 hs = new Highstudent5("kwon", 27, 3);
		hs.study();
	}
}
