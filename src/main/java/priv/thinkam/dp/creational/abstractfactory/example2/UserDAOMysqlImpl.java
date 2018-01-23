package priv.thinkam.dp.creational.abstractfactory.example2;

/**
 * Created by thinkam on 1/21/18.
 */
public class UserDAOMysqlImpl implements UserDAO {
	@Override
	public void add() {
		System.out.println("an user has bean inserted into mysql");
	}
}
