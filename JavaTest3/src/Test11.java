
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		
		Cat c = new Cat();
		c.breath();
		
		
		Animal a = new Dog();
		a.breath();//타입은 애니멀인데 도그 브래스가나옴
		//재정의했는데 바뀐다. 오버라이딍~
		Animal a1 = new Cat();
		a1.breath();
		test(a);
		test(a1);
	

	}
	static void test(Animal a) {
		a.breath();
	}

}
