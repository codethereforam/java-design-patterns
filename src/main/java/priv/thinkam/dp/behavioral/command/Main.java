package priv.thinkam.dp.behavioral.command;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public class Main {

	public static void main(String[] args) {
		Shell bash = new Shell();
		ShellScript shellScript = new ShellScript();
		shellScript.addCommand(new Pwd(bash));
		shellScript.addCommand(new Who(bash));
		shellScript.executeAll();
	}

}
