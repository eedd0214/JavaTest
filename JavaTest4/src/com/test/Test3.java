package com.test;
class Calculator {//Calculator�� ���ú��� a,b
	int result;
	public Calculator() {//������
		result = 0;//�ʱ�ȭ�ϰ� ������ �����ϴ°�!
	}
	public Calculator(int r) {
		result = r;
	}
	int add(int a, int b) {
		result = a + b;
		return result;
	}
	int add(int a, int b, int c) {
		result = a+b+c;
		return result;
	}//�޼ҵ��� �����ε�!
	int subtract(int a, int b) {
		result = a-b;
		return result;
	}
	//���Ʒ� ������ ���� �ƹ� ���谡 ����.
}
public class Test3 {//Test3�� ���ú��� a,b
	public static void main(String[] args) {
		//Calculator calc = new Calculator();
		Calculator calc = new Calculator(100);
		int a = 1;
		int b =2;
		int result = calc.add(a, b);
		int result2 = calc.subtract(a, b);
		System.out.println(result);
		System.out.println(result2);
		
	}
}