class Employee{
	String name;
	int age;
	void gotoWork() {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"인 사람이 일을 한다.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		value-type(값타입) vs reference-type(참조타입)
		int a = 1;
		int b= a;
		Employee emp;//스택공간에 위치함
		// 힙은 메모리 관리 
		// 스택은 객체생성
		
		Employee c= new Employee();//힙공간에 메모리가 올라감
		c.name = "홍길동";
		c.age = 45;
		c.gotoWork();
		
		Employee emp2 = c;//c의 값이 emp2에 복사됨
		emp2.gotoWork();
		
		Employee emp3 =new Employee();
		emp3.name = "이순신";
		emp3.age = 50;
		emp3.gotoWork();
		
		
	}

	public static void test2() {
		// TODO Auto-generated method stub
		
	}

}
