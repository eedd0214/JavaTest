/*
 * Class, Object(Instance)
 * Ŭ���� �ҽ� û����
 * ������Ʈ �޸� 
 * ��ü����
 * ������ : ���α׷��� �����ϰ� �����ؾ� �� ������
 * ��� : �����͸� �����ϴ� ��� û���� Ư������ �����Ҽ��ִ� �����⸦ ����
 * 
 * �л��� �����غ���
 * �л��� �׸�
 *  -�̸�, ����, Ű ���...
 *  -�����ϴ�, ��ϴ�, �ϱ��ϴ�
 *  >>>>>��ü���� Ŭ������ ���� �� �ִ�.
 *  ��üȭ�� Ʋ�� ����� ��!
 *  �ؾ Ʋ!
 *  
 *  
 * 
 */

class Student1{
	String name;
	int age;
	int height;
	
	void study() {
		System.out.println(name+", ("+age+"��,"+height+"cm) ��(��) �����Ѵ�.");
	}
	void goSchool() {
		
	}
	void goHome() {
	
	}	
}
class School{
	String location;
	int qty;
	void teaching() {
		System.out.println(location+"���� ");
	}
}

public class Test14 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu1=new Student1();
		Student1 stu2=new Student1();
		School s = new School();
		s.location = "����";
		s.teaching();
		stu1.name="�̼���";
		stu1.age=20;
		stu1.height=180;
		stu1.study();
		Student1 stu3 = stu1;
		Test(stu3);
		int a =1;
		Test(stu1);
		
	}
	static void Test(Student1 s) {//��ü ���� Ÿ���� ���ŷ� �ްڴ�!
		String name=s.name;
		int age=s.age;
		int height =s.height;
		System.out.println(name+age+height);
	}
	static void Test2(int b) { //int b= a;
	
		
	}

}
