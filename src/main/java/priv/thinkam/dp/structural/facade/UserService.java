package priv.thinkam.dp.structural.facade;

/**
 *
 * @author thinkam
 * @date 1/30/18
 */
public class UserService {
	private UserDAO userDAO = new UserDAO();
	private LogDAO logDAO = new LogDAO();

	public void add() {
		userDAO.add();
		logDAO.add("a user inserted into DB");
	}

	public void delete() {
		userDAO.delete();
		logDAO.add("a user deleted from DB");
	}

}
