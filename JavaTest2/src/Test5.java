
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		while(a<10) {
			System.out.println(a);
			a++;
		}
		a=1;
		do {
			System.out.println(a);
			a++;
		}while(a<10);
		
		
		for(int a2=0;a2<10;a2++) {
			System.out.println(a2);
		}
		int sum=0;
		for(int a3=0;a3<=10;a3++) {
			sum=sum+a3;
		}
		System.out.println(sum);
		System.out.println("==========================================");
		int a4;
		for(a4=0;a4<=10;a4++) {
			System.out.println(a4);
			a4=+a4;
		}
		System.out.println(a4);
		System.out.println("==========================================");
		int b=1;
		int sum2=0;
		System.out.print("1~10까지의 합계:");
		while(b<=10) {
			sum2=sum2+b;
			b++;
		}
		System.out.println(sum2);
		
		
		
	}

}
