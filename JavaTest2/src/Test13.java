


public class Test13 {
	static int count=0;
	static void recursion() {
//		System.out.println("recursion");
//		recursion();//재귀호출 꼬리에 꼬리르 물고 호출한다 트리만들때 조직도만들때 사용
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
