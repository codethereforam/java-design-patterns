package priv.thinkam.dp.structural.facade;

/**
 *
 * @author thinkam
 * @date 1/30/18
 */
public class UserController {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.add();
		System.out.println("-------------");
		userService.delete();
	}

}
