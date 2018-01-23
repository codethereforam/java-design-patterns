package priv.thinkam.dp.creational.abstractfactory.example3;

/**
 * Created by thinkam on 1/21/18.
 */
public class DataAccess {
	public static final String MYSQL = "Mysql";
	public static final String ORACLE = "Oracle";
	private String database;
	public static final String PACKAGE_NAME = DataAccess.class.getPackage().getName();

	public DataAccess(String database) {
		this.database = database;
	}

	public UserDAO createUserDAO() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		String className = PACKAGE_NAME + ".UserDAO" + database + "Impl";
		return (UserDAO) Class.forName(className).newInstance();
	}

	public LogDAO createLogDAO() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		String className = PACKAGE_NAME + ".LogDAO" + database + "Impl";
		return (LogDAO) Class.forName(className).newInstance();
	}
}
