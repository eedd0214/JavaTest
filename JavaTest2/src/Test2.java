class Employee{
	String name;
	int age;
	void gotoWork() {
		System.out.println("�̸��� "+name+"�̰�, ���̴� "+age+"�� ����� ���� �Ѵ�.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		value-type(��Ÿ��) vs reference-type(����Ÿ��)
		int a = 1;
		int b= a;
		Employee emp;//���ð����� ��ġ��
		// ���� �޸� ���� 
		// ������ ��ü����
		
		Employee c= new Employee();//�������� �޸𸮰� �ö�
		c.name = "ȫ�浿";
		c.age = 45;
		c.gotoWork();
		
		Employee emp2 = c;//c�� ���� emp2�� �����
		emp2.gotoWork();
		
		Employee emp3 =new Employee();
		emp3.name = "�̼���";
		emp3.age = 50;
		emp3.gotoWork();
		
		
	}

	public static void test2() {
		// TODO Auto-generated method stub
		
	}

}
