class A {
	void aM(){
		System.out.println("A �޼ҵ�");
	}
}
class B extends A{
	void bM(){
		System.out.println("b �޼ҵ�");
	}
	void aM(){
		System.out.println("bŬ������ a �޼ҵ��� �������̵�");
	}
}
class C extends B{
	void bM(){
		System.out.println("cŬ������ b �޼ҵ��� �������̵�");
	}
	void aM(){
		System.out.println("cŬ������ a �޼ҵ��� �������̵�");
	}
	void cM(){
		System.out.println("c �޼ҵ�");
	}
}
public class Overriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();//AŬ���� Ÿ���� B��ü
		a.aM();
		A a1 = new C();
		a1.aM();
		B b = new C();
		b.bM();
	}

}