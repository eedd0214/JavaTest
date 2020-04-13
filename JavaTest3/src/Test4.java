class Student3{
	public Student3() {
		System.out.println("Default Constructor");//호출 확인용
		name="홍길동";
		age=20;
	}
	public Student3(String nm, int ag) {
		System.out.println("Default Constructor");//생성자의 오버로딩
		name=nm;
		age=ag;
	}
	//메소드 오버로딩(Overloading)
	//클래스의 메소드,생성자가 같은 이름을 가지면서 파라미터의 개수와 타입이 다른경우를 정의할때
	private String name;//안에서만 사용할수있게 제약시킴
	private int age;
	public void setName(String nm) {//얘는 공용으로 사용가능
		name= nm;
	}
	public void setName(String nm, int age) {//오버로딩 파라미터 개수가 다름
		name= nm;
	}
	public void setAge(int ag) {
		age=ag;
	}
	public void gotoSchool() {
		System.out.println(name+","+age+"가 학교에 가다.");
		
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 st1 = new Student3();
		st1.gotoSchool();
		Student3 st2 = new Student3("이순신",21);
		st2.gotoSchool();
				
	
	}

}
