
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		
		Cat c = new Cat();
		c.breath();
		
		
		Animal a = new Dog();
		a.breath();//Ÿ���� �ִϸ��ε� ���� �귡��������
		//�������ߴµ� �ٲ��. �������̊�~
		Animal a1 = new Cat();
		a1.breath();
		test(a);
		test(a1);
	

	}
	static void test(Animal a) {
		a.breath();
	}

}