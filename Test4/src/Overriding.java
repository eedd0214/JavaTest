class A {
	void aM(){
		System.out.println("A 메소드");
	}
}
class B extends A{
	void bM(){
		System.out.println("b 메소드");
	}
	void aM(){
		System.out.println("b클래스의 a 메소드의 오버라이딩");
	}
}
class C extends B{
	void bM(){
		System.out.println("c클래스의 b 메소드의 오버라이딩");
	}
	void aM(){
		System.out.println("c클래스의 a 메소드의 오버라이딩");
	}
	void cM(){
		System.out.println("c 메소드");
	}
}
public class Overriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();//A클래스 타입의 B객체
		a.aM();
		A a1 = new C();
		a1.aM();
		B b = new C();
		b.bM();
	}

}
