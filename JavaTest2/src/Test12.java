
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}

	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과 : "+ (num1/num2));
	}
}
