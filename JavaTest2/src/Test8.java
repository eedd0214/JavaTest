
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		boolean search= false;
		while(num<100) {
			if(((num%5)==0)&&((num%7)==0)) {
				search =true;
				break;
			}
			num++;
		}
		if(search) {
			System.out.println("찾는정수 : "+ num);
		}else {
			System.out.println("5의배수 : "+num);
		}
	}

}
