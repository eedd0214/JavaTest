


public class Test13 {
	static int count=0;
	static void recursion() {
//		System.out.println("recursion");
//		recursion();//���ȣ�� ������ ������ ���� ȣ���Ѵ� Ʈ�����鶧 ���������鶧 ���
		count++;
		if(count <=5) {
			System.out.println("recursion");
			recursion();
		}
	}
	static int factorial(int n) {
		if(n==1) 
			return 1;
		else
			return (n* factorial(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion();
		int result = factorial(5);
		System.out.println(result);
	}

}
