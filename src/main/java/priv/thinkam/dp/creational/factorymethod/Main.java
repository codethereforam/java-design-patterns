package priv.thinkam.dp.creational.factorymethod;

/**
 * Created by thinkam on 1/21/18.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("==== if mysql ====");
		UserDAO userDAO1 = new UserDAOFactoryMysqlImpl().createUserDAO();
		userDAO1.add();
		System.out.println("==== if oracle ====");
		UserDAO userDAO2 = new UserDAOFactoryOracleImpl().createUserDAO();
		userDAO2.add();
	}

}
