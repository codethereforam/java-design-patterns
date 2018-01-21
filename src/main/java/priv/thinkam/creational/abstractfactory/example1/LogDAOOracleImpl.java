package priv.thinkam.creational.abstractfactory.example1;

/**
 * Created by thinkam on 1/21/18.
 */
public class LogDAOOracleImpl implements LogDAO {
	@Override
	public void add() {
		System.out.println("a log has bean inserted into oracle");
	}
}
