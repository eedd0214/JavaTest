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
		this.bValue =100;//this �ڱ��ڽ��� ��Ī
	}
	public B(int bvlaue) {
		super(300);//���� a�����ڰ� ȣ���
		this.bValue = bvlaue;
		System.out.println("Default Constructor B"+bvlaue+","+this.aValue);
	}
}
public class Test6 {

	public static void main(String[] args) {
		//A a = new A();
		//B b = new B();//�ΰ� �� ȣ��Ǵ� ���� : ���� ���������� ȣ��ǰ� ���������ڰ� �����Ǳ� ����
		B b1 = new B(200);
		
	}

}
