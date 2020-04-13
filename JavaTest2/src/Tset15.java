
class Student2{
	private String name;//뒤에 둬도 상관없다. 클래스안에 맴버변수는 상관없다.
//	특정 조건에 의해 접근할 수 있게!
//	하나를 바꾸면 전체가 바뀔수 있기 때문에
//	집약되지않게 만들어주려구!
	public Student2() {//기본적으로 생성된는 것>>>> 생성자! 클래스이름과동일, 리턴 x, 퍼블릭!
		//메모리에 적재할때 초기화될수잇는 것을 정해둠
		System.out.println("Default Constructor");
		name ="강감찬";//기본값을 설정해둠
	}
	
	public void setName(String nm) {
		name= nm;
	}
	public String getName() {
		return name;
	}
	public void gotoSchool() {
		System.out.println(name+"이 학교에 간다.");
	}
}


public class Tset15 {
	public static void main(String[] args) {
		Student2 stu1 =new Student2();
//		stu1.name="이순신";
		stu1.setName("이순신");
		stu1.gotoSchool();
		Student2 stu2;
		stu2= new Student2();
//		stu2.name="강감찬";
		stu2.setName("강감찬");
		stu2.gotoSchool();
		Student2 t = execute(stu2);
		t.gotoSchool();
		Student2 t1 = new Student2();//일반적인 방법
		Student2 t2 = execute(t1);//두줄로 사용
		Student2 t3 = execute(new Student2());//한번에 하는 방법
		
	}
	static Student2 execute(Student2 s) {//Student2 s = stu2; 하나로 끝내자
		s.gotoSchool();
		return s;
	}
//	static Student2 execute() {
//		
//	}
	static void test2(String name, int age, 
			int height) {//너무 많아 추가될때마다 수정해야해ㅑ
		
	}
}
