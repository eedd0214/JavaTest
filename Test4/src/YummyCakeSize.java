class Cake{
	public int size;
	public Cake(int sz) {
		size = sz;
	}
	
	public void showCakeSize() {
		System.out.println("Bread oUnces : "+size);
		System.out.println("케이크 클래스에서 출력됩니다.");
	}
}
class CheeseCake extends Cake{
	public int size;
	
	public CheeseCake(int sz1,int sz2) {
		super(sz1);
		size = sz2;
		// TODO Auto-generated constructor stub
	}
	public void showCakeSize() {
		System.out.println("Bread oUnces : "+super.size);
		System.out.println("cheese ounces : "+ size);
		System.out.println("치즈케이크 클래스에서 출력됩니다.");
	}
}
public class YummyCakeSize {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake ca1= new CheeseCake(5, 7);
		Cake ca2 = ca1;
		
		
		System.out.println("Bread Ounces : "+ ca2.size);
		System.out.println("cheese ounces : "+ ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();//타입이 cake라도 오버라이드 된 메소드를 출력한다. 
		
		
	}

}
