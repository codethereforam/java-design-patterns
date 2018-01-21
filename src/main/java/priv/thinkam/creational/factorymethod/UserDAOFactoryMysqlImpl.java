package priv.thinkam.creational.factorymethod;

/**
 * Created by thinkam on 1/21/18.
 */
public class UserDAOFactoryMysqlImpl implements UserDAOFactory {
	@Override
	public UserDAO createUserDAO() {
		return new UserDAOMysqlImpl();
	}
}
