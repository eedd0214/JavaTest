
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.Bark();
		Animal a =d;//Ÿ�Ը� �ٲ��.
		a.breath();
		//a.brak();
		Dog d1 = (Dog)a;
		d1.Bark();
		
		Animal a1 = new Dog();//Ÿ���� �ִϸ� ��ü�� ����
		Animal a2 = new Cat();
		a1.breath();
		a2.breath();
		//��ü�� ���� Ÿ������ �� ���� �� �ִ�.
		
		Test3(new Dog());
		
		/*
		 * �������� ���� Ŭ������ ������ ����
		 * �������� ���� Ŭ������ �����ΰ�
		 * ������ �ִ� Ŭ�����鰣 �̵��� �Ұ�
		 * 
		 */
	
	}
		static void Test(Dog d) {}//���׿� ������
		static void Test2(Cat d) {}//Ĺ�� ������ �ΰ� �� �����ߴ�
		static void Test3(Animal d) {}//���ϸַ� ����� �Ѵ� ���� �� ����
		//��ȯ�� ���ϸַ� ��ȯ
		//��ü
		//Animal a = new Dog();
		//������ �������̵��� ���� ���� �޼��嵵 �������� Ư���� ���� �� ����
		//�������̵� �� �ڵ差�� ���ϼ� ����
}