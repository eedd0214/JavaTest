class Student3{
	public Student3() {
		System.out.println("Default Constructor");//ȣ�� Ȯ�ο�
		name="ȫ�浿";
		age=20;
	}
	public Student3(String nm, int ag) {
		System.out.println("Default Constructor");//�������� �����ε�
		name=nm;
		age=ag;
	}
	//�޼ҵ� �����ε�(Overloading)
	//Ŭ������ �޼ҵ�,�����ڰ� ���� �̸��� �����鼭 �Ķ������ ������ Ÿ���� �ٸ���츦 �����Ҷ�
	private String name;//�ȿ����� ����Ҽ��ְ� �����Ŵ
	private int age;
	public void setName(String nm) {//��� �������� ��밡��
		name= nm;
	}
	public void setName(String nm, int age) {//�����ε� �Ķ���� ������ �ٸ�
		name= nm;
	}
	public void setAge(int ag) {
		age=ag;
	}
	public void gotoSchool() {
		System.out.println(name+","+age+"�� �б��� ����.");
		
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 st1 = new Student3();
		st1.gotoSchool();
		Student3 st2 = new Student3("�̼���",21);
		st2.gotoSchool();
				
	
	}

}