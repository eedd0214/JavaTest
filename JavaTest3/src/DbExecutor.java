/*
 * object : states behavior �޸𸮰� ����� ����
 *          states : color name
 *          behavior : bark() eat()
 *          
 * Class : an object is an instance of class
 * 		      �޸𸮸� ������ Ʋ�� ����� ��
 *         
 * ĸ��ȭ(Encapsulation)
 * ��Ӽ�(Inheritance)
 * ������(Polymoephism)
 * �߻�ȭ(Abstraction)
 */
public class DbExecutor {
	static Database CreateDatabase(String dbname) {
		Database db =null;
		switch(dbname) {
		case "Mysql":
			db = new Mysql();//dbŸ���� Mysql��ü�� �����Ѵ�.
			break;
		case "Oracle":
			db = new Oracle();//dbŸ���� Oracle��ü�� �����Ѵ�.
			break;
		}
		return db;//db�� ���� �ִ´�.
	}
	public static void main(String[] args) {
		
		Database db = CreateDatabase("Mysql");
		db.open();
		
		Database db2 = CreateDatabase("Oracle");
		db2.open();
	}

}
