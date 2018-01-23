package priv.thinkam.dp.creational.simplefactory;

/**
 * Created by thinkam on 1/21/18.
 */
public class UserDAOFactory {

	//静态工厂方法
	public static UserDAO createUserDAO(String database) {
		UserDAO userDAO = null;
		switch (database) {
			case "mysql":
				userDAO = new UserDAOMysqlImpl();
				break;
			case "oracle":
				userDAO = new UserDAOOracleImpl();
				break;
			default:
		}
		return userDAO;
	}

}
