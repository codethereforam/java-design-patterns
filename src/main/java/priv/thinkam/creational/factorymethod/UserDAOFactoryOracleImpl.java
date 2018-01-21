package priv.thinkam.creational.factorymethod;

/**
 * Created by thinkam on 1/21/18.
 */
public class UserDAOFactoryOracleImpl implements UserDAOFactory {
	@Override
	public UserDAO createUserDAO() {
		return new UserDAOOracleImpl();
	}
}
