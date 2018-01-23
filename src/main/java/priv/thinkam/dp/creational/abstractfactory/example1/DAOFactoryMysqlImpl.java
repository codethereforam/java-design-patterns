package priv.thinkam.dp.creational.abstractfactory.example1;

/**
 * Created by thinkam on 1/21/18.
 */
public class DAOFactoryMysqlImpl implements DAOFactory {
	@Override
	public UserDAO createUserDAO() {
		return new UserDAOMysqlImpl();
	}

	@Override
	public LogDAO createLogDAO() {
		return new LogDAOMysqlImpl();
	}
}
