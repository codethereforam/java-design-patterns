package priv.thinkam.dp.behavioral.command;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public class Shell {

	public void who() {
		System.out.println("xx@xx-pc:~$ who");
		System.out.println("xx  tty7         2018-02-02 22:22 (:0)");
	}

	public void pwd() {
		System.out.println("xx@xx-pc:~$ pwd");
		System.out.println("/home/xx");
	}

}
