
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.Bark();
		d.breath();
		
		
		Cat c = new Cat();
		c.breath();
		c.Meow();
		
		Animal a1=d;//도그 객체, 타입은 에니멀
		a1.breath();//
		Dog d2 =(Dog)a1;
		d2.Bark();
		d2.breath();
		
		Animal a2=c;//캣 객체, 타입은 애니멀
		a2.breath();
		Cat c2 = (Cat)a2;
		c2.breath();
		c2.Meow();
		
		
		Animal a3 =new Dog();
		a3.breath();
		Dog d3= (Dog)a3;
		d3.Bark();
		d3.breath();
		
		Animal a4 =new Cat();
		a4.breath();
		Cat c3 = (Cat)a4;
		c3.Meow();
		c3.breath();
		
		//Animal a10 = new Animal();
		//Dog d10 = (Dog)a10;//안돼
		
		
		//Dog d11 =new Dog();//이것도안돼
		//Animal a11 = d11;
		//Cat c11 =(Cat)a11;
		
		Object o = new Dog();
		Dog d12 = (Dog)o;
		d12.Bark();
		d12.breath();
		
		
		
		
		
		
	}

}
