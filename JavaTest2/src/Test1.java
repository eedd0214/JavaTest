//Local variable(로컬변수)
//Instance variable(인턴스 변수)
class A {
	int data = 50;
	static int m = 100;
	void method() {
		int n = 90;
	}
}

}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.m);
		A.m = 200;
		System.out.println(A.m);
		A a = new A();
		System.out.println(a.data);
		String str = "1234";
//		int a = Integer.parseInt(str);
//		Integer a2 = new Integer(a);
//		String str2 = a2.toString();
		Student stu = new Student();
		stu.name = "이순신";
		stu.age = 20;
		stu.goSchool();
		
		
		
	}

}
