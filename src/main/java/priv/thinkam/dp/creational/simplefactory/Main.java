package priv.thinkam.dp.creational.simplefactory;

/**
 * Created by thinkam on 1/21/18.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("==== if mysql ====");
		UserDAO userDAO1 = UserDAOFactory.createUserDAO("mysql");
		userDAO1.add();
		System.out.println("==== if oracle ====");
		UserDAO userDAO2 = UserDAOFactory.createUserDAO("oracle");
		userDAO2.add();
	}

}
