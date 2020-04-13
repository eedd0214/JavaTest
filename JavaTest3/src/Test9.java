
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.Bark();
		Animal a =d;//타입만 바뀐다.
		a.breath();
		//a.brak();
		Dog d1 = (Dog)a;
		d1.Bark();
		
		Animal a1 = new Dog();//타입은 애니멀 객체는 도그
		Animal a2 = new Cat();
		a1.breath();
		a2.breath();
		//객체를 상위 타입으로 다 받을 수 있다.
		
		Test3(new Dog());
		
		/*
		 * 상위에서 만든 클래스는 하위로 못감
		 * 하위에서 만든 클래스는 상위로감
		 * 하위에 있는 클래스들간 이동이 불가
		 * 
		 */
	
	}
		static void Test(Dog d) {}//도그에 고정됨
		static void Test2(Cat d) {}//캣에 고정됨 두개 다 만들어야댐
		static void Test3(Animal d) {}//에니멀로 선언시 둘다 받을 수 잇음
		//반환시 에니멀로 반환
		//객체
		//Animal a = new Dog();
		//다형성 오버라이딩을 통해 같은 메서드도 개별적인 특성을 가질 수 있음
		//오버라이딩 시 코드량을 줄일수 잇음
}
