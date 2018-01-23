package priv.thinkam.dp.creational.abstractfactory.example1;

/**
 * Created by thinkam on 1/21/18.
 */
public class DAOFactoryOracleImpl implements DAOFactory {

	@Override
	public UserDAO createUserDAO() {
		return new UserDAOOracleImpl();
	}

	@Override
	public LogDAO createLogDAO() {
		return new LogDAOOracleImpl();
	}
}
