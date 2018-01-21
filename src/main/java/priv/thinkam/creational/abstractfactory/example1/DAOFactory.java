package priv.thinkam.creational.abstractfactory.example1;

/**
 * Created by thinkam on 1/21/18.
 */
public interface DAOFactory {
	UserDAO createUserDAO();
	LogDAO createLogDAO();
}
