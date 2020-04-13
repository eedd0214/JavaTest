class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi ~ form "+number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	public SmartPhone(String num,String ver) {
		super(num);
		androidVer = ver;
		// TODO Auto-generated constructor stub
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}
	
}
public class MobileSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone("010555777", "Nougat");
		phone.answer();
		phone.playApp();
	}

}
