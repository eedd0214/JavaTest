
class Student2{
	private String name;//�ڿ� �ֵ� �������. Ŭ�����ȿ� �ɹ������� �������.
//	Ư�� ���ǿ� ���� ������ �� �ְ�!
//	�ϳ��� �ٲٸ� ��ü�� �ٲ�� �ֱ� ������
//	��������ʰ� ������ַ���!
	public Student2() {//�⺻������ �����ȴ� ��>>>> ������! Ŭ�����̸�������, ���� x, �ۺ�!
		//�޸𸮿� �����Ҷ� �ʱ�ȭ�ɼ��մ� ���� ���ص�
		System.out.println("Default Constructor");
		name ="������";//�⺻���� �����ص�
	}
	
	public void setName(String nm) {
		name= nm;
	}
	public String getName() {
		return name;
	}
	public void gotoSchool() {
		System.out.println(name+"�� �б��� ����.");
	}
}


public class Tset15 {
	public static void main(String[] args) {
		Student2 stu1 =new Student2();
//		stu1.name="�̼���";
		stu1.setName("�̼���");
		stu1.gotoSchool();
		Student2 stu2;
		stu2= new Student2();
//		stu2.name="������";
		stu2.setName("������");
		stu2.gotoSchool();
		Student2 t = execute(stu2);
		t.gotoSchool();
		Student2 t1 = new Student2();//�Ϲ����� ���
		Student2 t2 = execute(t1);//���ٷ� ���
		Student2 t3 = execute(new Student2());//�ѹ��� �ϴ� ���
		
	}
	static Student2 execute(Student2 s) {//Student2 s = stu2; �ϳ��� ������
		s.gotoSchool();
		return s;
	}
//	static Student2 execute() {
//		
//	}
	static void test2(String name, int age, 
			int height) {//�ʹ� ���� �߰��ɶ����� �����ؾ��ؤ�
		
	}
}
