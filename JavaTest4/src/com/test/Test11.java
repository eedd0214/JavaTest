package com.test;
class Student5{
	protected String name;//���� Ŭ�������� ����� ������
	protected int age;
	public Student5(String name, int age) {
		this.name=name;
		this.age = age;
		
	}
}
class Highstudent5 extends Student5{
	int grade;
	public Highstudent5(String name, int age, int grade) {
		super(name, age);//���� Ŭ������ ���� �״�� ������
		this.grade = grade;
	}
	void setNameAge(String name, int age) {//������ ���°ź��� ���� ���� ���°� �̵�
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
