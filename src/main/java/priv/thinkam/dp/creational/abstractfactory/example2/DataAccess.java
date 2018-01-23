package priv.thinkam.dp.creational.abstractfactory.example2;

/**
 * Created by thinkam on 1/21/18.
 */
public class DataAccess {
	public static final String MYSQL = "mysql";
	public static final String ORACLE = "oracle";
	private String database;

	public DataAccess(String database) {
		this.database = database;
	}

	public UserDAO createUserDAO() {
		UserDAO userDAO = null;
		switch (database) {
			case MYSQL:
				userDAO = new UserDAOMysqlImpl();
				break;
			case ORACLE:
				userDAO = new UserDAOOracleImpl();
				break;
			default:
		}
		return userDAO;
	}

	public LogDAO createLogDAO() {
		LogDAO logDAO = null;
		switch (database) {
			case MYSQL:
				logDAO = new LogDAOMysqlImpl();
				break;
			case ORACLE:
				logDAO = new LogDAOOracleImpl();
				break;
			default:
		}
		return logDAO;
	}
}
