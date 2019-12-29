package priv.thinkam.dp.creational.simplefactory.java8;

import com.google.common.collect.ImmutableMap;
import priv.thinkam.dp.creational.simplefactory.UserDAO;
import priv.thinkam.dp.creational.simplefactory.UserDAOMysqlImpl;
import priv.thinkam.dp.creational.simplefactory.UserDAOOracleImpl;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by thinkam on 2019/12/29
 */
public class UserDAOFactory {
	private static final Map<String, Supplier<UserDAO>> CONSTRUCTOR_MAP = ImmutableMap.of(
			"mysql", UserDAOMysqlImpl::new,
			"oracle", UserDAOOracleImpl::new
	);

	public static UserDAO createUserDAO(String database) {
		return Optional.ofNullable(CONSTRUCTOR_MAP.get(database))
				.orElseThrow(IllegalArgumentException::new)
				.get();
	}

}
