package priv.thinkam.dp.creational.abstractfactory.example3;

/**
 * Created by thinkam on 1/21/18.
 */
public class LogDAOMysqlImpl implements LogDAO {
	@Override
	public void add() {
		System.out.println("a log has bean inserted into mysql");
	}
}
