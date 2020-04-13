/*
 * object : states behavior 메모리가 적재된 공간
 *          states : color name
 *          behavior : bark() eat()
 *          
 * Class : an object is an instance of class
 * 		      메모리를 적재할 틀을 만드는 곳
 *         
 * 캡슐화(Encapsulation)
 * 상속성(Inheritance)
 * 다형성(Polymoephism)
 * 추상화(Abstraction)
 */
public class DbExecutor {
	static Database CreateDatabase(String dbname) {
		Database db =null;
		switch(dbname) {
		case "Mysql":
			db = new Mysql();//db타입의 Mysql객체를 생성한다.
			break;
		case "Oracle":
			db = new Oracle();//db타입의 Oracle객체를 생성한다.
			break;
		}
		return db;//db에 값을 넣는다.
	}
	public static void main(String[] args) {
		
		Database db = CreateDatabase("Mysql");
		db.open();
		
		Database db2 = CreateDatabase("Oracle");
		db2.open();
	}

}
