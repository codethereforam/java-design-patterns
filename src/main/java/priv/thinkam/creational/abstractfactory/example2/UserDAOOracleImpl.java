package priv.thinkam.creational.abstractfactory.example2;

/**
 * Created by thinkam on 1/21/18.
 */
public class UserDAOOracleImpl implements UserDAO {
	@Override
	public void add() {
		System.out.println("an user has bean inserted into oracle");
	}
}
