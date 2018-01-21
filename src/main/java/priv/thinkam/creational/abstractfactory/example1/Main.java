package priv.thinkam.creational.abstractfactory.example1;

/**
 * Created by thinkam on 1/21/18.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("==== if mysql ====");
		DAOFactory factory1 = new DAOFactoryMysqlImpl();
		factory1.createUserDAO().add();
		factory1.createLogDAO().add();

		System.out.println("==== if oracle ====");
		DAOFactory factory2 = new DAOFactoryOracleImpl();
		factory2.createUserDAO().add();
		factory2.createLogDAO().add();
	}

}
