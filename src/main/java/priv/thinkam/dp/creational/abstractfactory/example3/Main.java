package priv.thinkam.dp.creational.abstractfactory.example3;

/**
 * Created by thinkam on 1/21/18.
 */
public class Main {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		System.out.println("==== if mysql ====");
		DataAccess dataAccess1 = new DataAccess(DataAccess.MYSQL);
		dataAccess1.createUserDAO().add();
		dataAccess1.createLogDAO().add();

		System.out.println("==== if oracle ====");
		DataAccess dataAccess2 = new DataAccess(DataAccess.ORACLE);
		dataAccess2.createUserDAO().add();
		dataAccess2.createLogDAO().add();
	}

}
